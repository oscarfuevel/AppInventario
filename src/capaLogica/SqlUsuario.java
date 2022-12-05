package capaLogica;

import capaDatos.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlUsuario {
    
    public boolean registrar(usuarios usr) {

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        final String SQL = "INSERT INTO usuario (nombre, correo, usuario, password, id_tipoU) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getCorreo());
            ps.setString(3, usr.getUsuario());
            ps.setString(4, usr.getPassword());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();

            return true;

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);

            return false;
        }

    }

    public boolean login(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        final String SQL = "SELECT u.idusuario, u.nombre, u.usuario, u.password, u.id_tipoU, t.nombre FROM usuario AS u INNER JOIN tipo_usuario AS t ON u.id_tipoU=t.idtipo_usuario WHERE usuario = ?";

        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getPassword().equals(rs.getString(4))) {

                    String sqlUpdate = "UPDATE usuario SET last_session = ? WHERE idusuario = ?";
                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_session());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(2));
                    usr.setId_tipo(rs.getInt(5));
                    

                    return true;
                } else {
                    return false;
                }

            }

            return false;

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);

            return false;
        }

    }

    public int existeUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        final String SQL = "SELECT count(idusuario) FROM usuario WHERE usuario = ?";

        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);

            return 1;
        }

    }

    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();
    }
    
}
