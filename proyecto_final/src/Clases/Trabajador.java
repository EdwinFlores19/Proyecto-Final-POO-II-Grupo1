package Clases;

public class Trabajador extends Usuario {
    private int trab_cod;
    private String trab_nombre;
    private String trab_apellido;
    private String trab_nacimiento;
    private String trab_sexo;
    private String trab_email;
    private String trab_dir;
    private String trab_dir_distr;
    private String trab_dir_prov;
    private String trab_seguro;
    private String trab_sist_pen;
    private String trab_f_ingreso;
    private double trab_sueldo;
    private int trab_hijos;

    public Trabajador(String user_credencial, String user_password, String user_rol) {
        super(user_credencial, user_password, user_rol);
    }

    public Trabajador(int trab_cod, String trab_nombre, String trab_apellido, String trab_nacimiento, String trab_sexo, String trab_email, String trab_dir, String trab_dir_distr, String trab_dir_prov, String trab_seguro, String trab_sist_pen, String trab_f_ingreso, double trab_sueldo, int trab_hijos, String user_credencial, String user_password, String user_rol) {
        super(user_credencial, user_password, user_rol);
        this.trab_cod = trab_cod;
        this.trab_nombre = trab_nombre;
        this.trab_apellido = trab_apellido;
        this.trab_nacimiento = trab_nacimiento;
        this.trab_sexo = trab_sexo;
        this.trab_email = trab_email;
        this.trab_dir = trab_dir;
        this.trab_dir_distr = trab_dir_distr;
        this.trab_dir_prov = trab_dir_prov;
        this.trab_seguro = trab_seguro;
        this.trab_sist_pen = trab_sist_pen;
        this.trab_f_ingreso = trab_f_ingreso;
        this.trab_sueldo = trab_sueldo;
        this.trab_hijos = trab_hijos;
    }

    public int getTrab_cod() {
        return trab_cod;
    }

    public void setTrab_cod(int trab_cod) {
        this.trab_cod = trab_cod;
    }

    public String getTrab_nombre() {
        return trab_nombre;
    }

    public void setTrab_nombre(String trab_nombre) {
        this.trab_nombre = trab_nombre;
    }

    public String getTrab_apellido() {
        return trab_apellido;
    }

    public void setTrab_apellido(String trab_apellido) {
        this.trab_apellido = trab_apellido;
    }

    public String getTrab_nacimiento() {
        return trab_nacimiento;
    }

    public void setTrab_nacimiento(String trab_nacimiento) {
        this.trab_nacimiento = trab_nacimiento;
    }

    public String getTrab_sexo() {
        return trab_sexo;
    }

    public void setTrab_sexo(String trab_sexo) {
        this.trab_sexo = trab_sexo;
    }

    public String getTrab_email() {
        return trab_email;
    }

    public void setTrab_email(String trab_email) {
        this.trab_email = trab_email;
    }

    public String getTrab_dir() {
        return trab_dir;
    }

    public void setTrab_dir(String trab_dir) {
        this.trab_dir = trab_dir;
    }

    public String getTrab_dir_distr() {
        return trab_dir_distr;
    }

    public void setTrab_dir_distr(String trab_dir_distr) {
        this.trab_dir_distr = trab_dir_distr;
    }

    public String getTrab_dir_prov() {
        return trab_dir_prov;
    }

    public void setTrab_dir_prov(String trab_dir_prov) {
        this.trab_dir_prov = trab_dir_prov;
    }

    public String getTrab_seguro() {
        return trab_seguro;
    }

    public void setTrab_seguro(String trab_seguro) {
        this.trab_seguro = trab_seguro;
    }

    public String getTrab_sist_pen() {
        return trab_sist_pen;
    }

    public void setTrab_sist_pen(String trab_sist_pen) {
        this.trab_sist_pen = trab_sist_pen;
    }

    public String getTrab_f_ingreso() {
        return trab_f_ingreso;
    }

    public void setTrab_f_ingreso(String trab_f_ingreso) {
        this.trab_f_ingreso = trab_f_ingreso;
    }

    public double getTrab_sueldo() {
        return trab_sueldo;
    }

    public void setTrab_sueldo(double trab_sueldo) {
        this.trab_sueldo = trab_sueldo;
    }

    public int getTrab_hijos() {
        return trab_hijos;
    }

    public void setTrab_hijos(int trab_hijos) {
        this.trab_hijos = trab_hijos;
    }
    
}
