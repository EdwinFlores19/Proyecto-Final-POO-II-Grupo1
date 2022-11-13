package proyecto_final;

public class DetalleVentas {
    int codVenta;
    int codProducto;
    String nomProducto;
    double cantidad;
    double precioProducto;
    double importeTotal;

    public DetalleVentas() {
    }

    public DetalleVentas(int codVenta, String nomProducto ,int codProducto, double cantidad, double precioProducto, double importeTotal) {
        this.codVenta = codVenta;
        this.nomProducto = nomProducto;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.precioProducto = precioProducto;
        this.importeTotal = importeTotal;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    
}
