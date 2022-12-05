package capaPresentacion;

import capaDatos.usuarios;
import capaDatos.hash;
import capaLogica.Conexion;
import capaLogica.SqlUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CrearUsuario extends javax.swing.JInternalFrame {

    public CrearUsuario() {
        initComponents();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        try {
            
            String sql = "SELECT nombre FROM tipo_usuario";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            cbxTipoUsuario.addItem("Seleccione un tipo de usuario");
            
            while(rs.next()){
                cbxTipoUsuario.addItem(rs.getString("nombre"));
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarios = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JButton();
        cbxTipoUsuario = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setTitle("Crear Usuario");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 540));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Usur.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 76));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 267, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Correo: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 267, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        txtUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 267, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 84, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 267, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("<html>Confirmar Contraseña: </html>");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        txtConfirmarPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 267, 28));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tipo Usuario: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, 20));

        btnCrearUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrearUsuario.setText("CREAR USUARIO");
        btnCrearUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 267, 32));

        jPanel1.add(cbxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 267, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarPasswordActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        
        SqlUsuario modSql = new SqlUsuario();
        usuarios mod = new usuarios();

        String pass = new String(txtPassword.getPassword());
        String passcon = new String(txtConfirmarPassword.getPassword());

        if (txtNombre.getText().equals("") || txtCorreo.getText().equals("")
            || txtUsuarios.getText().equals("") || pass.equals("") || passcon.equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, Debe llenar todos los campos");
        } else {

            if (pass.equals(passcon)) {

                if (modSql.existeUsuario(txtUsuarios.getText()) == 0) {

                    if (modSql.esEmail(txtCorreo.getText())) {

                        String nuevoPass = hash.sha1(pass);

                        mod.setNombre(txtNombre.getText());
                        mod.setCorreo(txtCorreo.getText());
                        mod.setUsuario(txtUsuarios.getText());
                        mod.setPassword(nuevoPass);
                        mod.setId_tipo(cbxTipoUsuario.getSelectedIndex());

                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
                            txtNombre.setText("");
                            txtCorreo.setText("");
                            txtUsuarios.setText("");
                            txtPassword.setText("");
                            txtConfirmarPassword.setText("");
                            cbxTipoUsuario.setSelectedIndex(0);

                        } else {
                            System.out.println("Error al guardar");
                            JOptionPane.showMessageDialog(null, "Error al guardar Registro");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "El correo Electrónico no es valido");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuarios;
    // End of variables declaration//GEN-END:variables
}
