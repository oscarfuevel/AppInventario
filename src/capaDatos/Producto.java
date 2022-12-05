package capaDatos;

public class Producto {
    
    private int idProducto;
    private String Nombre;
    private int stock;
    private int idCategoria;
    private String fecha;
    private int precioCompra;

    public Producto() {
    }

    public Producto(int idProducto, String Nombre, int stock, int idCategoria, String fecha, int precioCompra) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.stock = stock;
        this.idCategoria = idCategoria;
        this.fecha = fecha;
        this.precioCompra = precioCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    
    
}
