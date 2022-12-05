package capaDatos;

public class DetalleSalida {

    private int id;
    private String codiPro;
    private String nombre;
    private String cantidad;
    private int idSalida;

    public DetalleSalida() {
    }

    public DetalleSalida(int id, String codiPro, String nombre, String cantidad, int idSalida) {
        this.id = id;
        this.codiPro = codiPro;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.idSalida = idSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodiPro() {
        return codiPro;
    }

    public void setCodiPro(String codiPro) {
        this.codiPro = codiPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }
    
    
}
