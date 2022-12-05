package capaDatos;

public class Salida {
    
   private int idSalida;
   private String  nombre;
   private String telefono;
   private String correo;
   private String fecha;
   private String Factura;

    public Salida() {
    }

    public Salida(int idSalida, String nombre, String telefono, String correo, String fecha, String Factura) {
        this.idSalida = idSalida;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha = fecha;
        this.Factura = Factura;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getFactura() {
        return Factura;
    }

    public void setFactura(String Factura) {
        this.Factura = Factura;
    }
  
}
