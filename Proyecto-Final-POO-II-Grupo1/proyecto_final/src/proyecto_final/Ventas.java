/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author WILLIAM
 */
public class Ventas {
    int codigo;
    String fecha;
    String hora;
    float subtotal;
    float igv;
    float total;
    String docCliente;
    String docVendedor;
    String tipoVenta; //factura(ruc) o boleta(dni)

    public Ventas() {
    }

    public Ventas(int codigo, String fecha, String hora, float subtotal, float igv, float total, String docCliente, String docVendedor, String tipoVenta) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.docCliente = docCliente;
        this.docVendedor = docVendedor;
        this.tipoVenta = tipoVenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getDocVendedor() {
        return docVendedor;
    }

    public void setDocVendedor(String docVendedor) {
        this.docVendedor = docVendedor;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }
    
    
}