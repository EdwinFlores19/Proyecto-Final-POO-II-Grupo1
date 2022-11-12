/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author WILLIAM
 */
public class DetalleVentas {
    int codVenta;
    int codProducto;
    int cantidad;
    float precioProducto;
    float importeTotal;

    public DetalleVentas() {
    }

    public DetalleVentas(int codVenta, int codProducto, int cantidad, float precioProducto, float importeTotal) {
        this.codVenta = codVenta;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.precioProducto = precioProducto;
        this.importeTotal = importeTotal;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    
}
