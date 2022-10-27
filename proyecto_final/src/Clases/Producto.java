package Clases;

public class Producto {
    private int prod_id;
    private String prod_nombre;
    private String prod_tamano;
    private int prod_units;
    private int prod_stock;  /*Stock - general, unidades - individual*/
    private int prod_unidades;
    private double prod_costo;
    private double prod_precio;
    private String prod_f_ingreso;
    private String prod_f_venci;

    public Producto(int prod_id, String prod_nombre, String prod_tamano, int prod_units, int prod_stock, int prod_unidades, double prod_costo, double prod_precio, String prod_f_ingreso, String prod_f_venci) {
        this.prod_id = prod_id;
        this.prod_nombre = prod_nombre;
        this.prod_tamano = prod_tamano;
        this.prod_units = prod_units;
        this.prod_stock = prod_stock;
        this.prod_unidades = prod_unidades;
        this.prod_costo = prod_costo;
        this.prod_precio = prod_precio;
        this.prod_f_ingreso = prod_f_ingreso;
        this.prod_f_venci = prod_f_venci;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public String getProd_tamano() {
        return prod_tamano;
    }

    public void setProd_tamano(String prod_tamano) {
        this.prod_tamano = prod_tamano;
    }

    public int getProd_units() {
        return prod_units;
    }

    public void setProd_units(int prod_units) {
        this.prod_units = prod_units;
    }

    public int getProd_stock() {
        return prod_stock;
    }

    public void setProd_stock(int prod_stock) {
        this.prod_stock = prod_stock;
    }

    public int getProd_unidades() {
        return prod_unidades;
    }

    public void setProd_unidades(int prod_unidades) {
        this.prod_unidades = prod_unidades;
    }

    public double getProd_costo() {
        return prod_costo;
    }

    public void setProd_costo(double prod_costo) {
        this.prod_costo = prod_costo;
    }

    public double getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(double prod_precio) {
        this.prod_precio = prod_precio;
    }

    public String getProd_f_ingreso() {
        return prod_f_ingreso;
    }

    public void setProd_f_ingreso(String prod_f_ingreso) {
        this.prod_f_ingreso = prod_f_ingreso;
    }

    public String getProd_f_venci() {
        return prod_f_venci;
    }

    public void setProd_f_venci(String prod_f_venci) {
        this.prod_f_venci = prod_f_venci;
    }

    
}
