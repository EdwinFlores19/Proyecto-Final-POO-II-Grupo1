/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author WILLIAM
 */
public class Cliente {
    String documento;
    String nombre;
    String apellido;
    String f_nacimiento;
    String sexo;
    String email;
    String direccion;
    String d_distrito;
    String d_provincia;

    public Cliente(String documento, String nombre, String apellido, String f_nacimiento, String sexo, String email, String direccion, String d_distrito, String d_provincia) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.f_nacimiento = f_nacimiento;
        this.sexo = sexo;
        this.email = email;
        this.direccion = direccion;
        this.d_distrito = d_distrito;
        this.d_provincia = d_provincia;
    }

    public Cliente() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    
}
