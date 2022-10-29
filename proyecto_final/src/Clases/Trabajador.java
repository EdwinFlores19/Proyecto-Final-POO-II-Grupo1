/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author WILLIAM
 */
public class Trabajador extends Usuario{
    private String dni;
    private String nombre;
    private String f_nacimiento;
    private String sexo;
    private String email;
    private String direccion;
    private String d_distrito;
    private String d_provincia;
    private double sueldo;
    private String sist_pensiones;
    private String f_ingreso;
    private int n_hijos;
    private String s_salud;
    private String rol_t;

    public Trabajador() {
    }

    public Trabajador(String dni, String nombre, String f_nacimiento, String sexo, String email, String direccion, String d_distrito, String d_provincia, double sueldo, String sist_pensiones, String f_ingreso, int n_hijos, String s_salud, String rol_t) {
        this.dni = dni;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.sexo = sexo;
        this.email = email;
        this.direccion = direccion;
        this.d_distrito = d_distrito;
        this.d_provincia = d_provincia;
        this.sueldo = sueldo;
        this.sist_pensiones = sist_pensiones;
        this.f_ingreso = f_ingreso;
        this.n_hijos = n_hijos;
        this.s_salud = s_salud;
        this.rol_t = rol_t;
    }

    public Trabajador(String dni, String nombre, String f_nacimiento, String sexo, String email, String direccion, String d_distrito, String d_provincia, double sueldo, String sist_pensiones, String f_ingreso, int n_hijos, String s_salud, String rol_t, int id, String credencial, String password, String rol) {
        super(id, credencial, password, rol);
        this.dni = dni;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.sexo = sexo;
        this.email = email;
        this.direccion = direccion;
        this.d_distrito = d_distrito;
        this.d_provincia = d_provincia;
        this.sueldo = sueldo;
        this.sist_pensiones = sist_pensiones;
        this.f_ingreso = f_ingreso;
        this.n_hijos = n_hijos;
        this.s_salud = s_salud;
        this.rol_t = rol_t;
    }

    public String getRol_t() {
        return rol_t;
    }

    public void setRol_t(String rol_t) {
        this.rol_t = rol_t;
    }

   
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getD_distrito() {
        return d_distrito;
    }

    public void setD_distrito(String d_distrito) {
        this.d_distrito = d_distrito;
    }

    public String getD_provincia() {
        return d_provincia;
    }

    public void setD_provincia(String d_provincia) {
        this.d_provincia = d_provincia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getSist_pensiones() {
        return sist_pensiones;
    }

    public void setSist_pensiones(String sist_pensiones) {
        this.sist_pensiones = sist_pensiones;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public int getN_hijos() {
        return n_hijos;
    }

    public void setN_hijos(int n_hijos) {
        this.n_hijos = n_hijos;
    }

    public String getS_salud() {
        return s_salud;
    }

    public void setS_salud(String s_salud) {
        this.s_salud = s_salud;
    }

    
}
