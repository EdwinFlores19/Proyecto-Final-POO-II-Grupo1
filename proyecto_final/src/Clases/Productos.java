/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author WILLIAM
 */
public class Productos {
    private int p_id;
    private String nombre;
    private String color;
    private String tamaño;
    private String unidades;
    private String stock;
    private double costo;
    private double precio;
    private String f_ingreso;
    private String f_vencimiento;

    public Productos() {
    }

    public Productos(int p_id, String nombre, String color, String tamaño, String unidades, String stock, double costo, double precio, String f_ingreso, String f_vencimiento) {
        this.p_id = p_id;
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.unidades = unidades;
        this.stock = stock;
        this.costo = costo;
        this.precio = precio;
        this.f_ingreso = f_ingreso;
        this.f_vencimiento = f_vencimiento;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public String getF_vencimiento() {
        return f_vencimiento;
    }

    public void setF_vencimiento(String f_vencimiento) {
        this.f_vencimiento = f_vencimiento;
    }
    
    
    
    
            
            
}
