package capaDatos;

public class TipoUsuario {
    
    private int idTipo;
    private String nombre;

    public TipoUsuario() {
        idTipo = 0;
        nombre = "";
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "idTipo=" + idTipo + ", nombre=" + nombre + '}';
    }
    
    
    
}
