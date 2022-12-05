package capaDatos;

public class Cliente {
    
    private int idCliente;
    private String documen;
    private int idTipoDocumen;
    private String nombre;
    private int idciudad;
    private String direccion;
    private String telefono;
    private String correo;
    private String fecha;

    public Cliente() {
    }

    public Cliente(int idCliente, String documen, int idTipoDocumen, String nombre, int idciudad, String direccion, String telefono, String correo, String fecha) {
        this.idCliente = idCliente;
        this.documen = documen;
        this.idTipoDocumen = idTipoDocumen;
        this.nombre = nombre;
        this.idciudad = idciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDocumen() {
        return documen;
    }

    public void setDocumen(String documen) {
        this.documen = documen;
    }

    public int getIdTipoDocumen() {
        return idTipoDocumen;
    }

    public void setIdTipoDocumen(int idTipoDocumen) {
        this.idTipoDocumen = idTipoDocumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
