package Clases;

public class Cliente extends Usuario {
    private int cli_cod;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_sexo;  /*M - Masculino | F - Femenino | O - Otros*/
    private String cli_nacimiento;
    private String cli_dir;
    private String cli_dir_distr;
    private String cli_dir_prov;
    private String cli_email;

    public Cliente(String user_credencial, String user_password, String user_rol) {
        super(user_credencial, user_password, user_rol);
    }
    
    public Cliente(int cli_cod, String cli_nombre, String cli_apellido, String cli_sexo, String cli_nacimiento, String cli_dir, String cli_dir_distr, String cli_dir_prov, String cli_email, String user_credencial, String user_password, String user_rol) {
        super(user_credencial, user_password, user_rol);
        this.cli_cod = cli_cod;
        this.cli_nombre = cli_nombre;
        this.cli_apellido = cli_apellido;
        this.cli_sexo = cli_sexo;
        this.cli_nacimiento = cli_nacimiento;
        this.cli_dir = cli_dir;
        this.cli_dir_distr = cli_dir_distr;
        this.cli_dir_prov = cli_dir_prov;
        this.cli_email = cli_email;
    }

    public int getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(int cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_sexo() {
        return cli_sexo;
    }

    public void setCli_sexo(String cli_sexo) {
        this.cli_sexo = cli_sexo;
    }

    public String getCli_nacimiento() {
        return cli_nacimiento;
    }

    public void setCli_nacimiento(String cli_nacimiento) {
        this.cli_nacimiento = cli_nacimiento;
    }

    public String getCli_dir() {
        return cli_dir;
    }

    public void setCli_dir(String cli_dir) {
        this.cli_dir = cli_dir;
    }

    public String getCli_dir_distr() {
        return cli_dir_distr;
    }

    public void setCli_dir_distr(String cli_dir_distr) {
        this.cli_dir_distr = cli_dir_distr;
    }

    public String getCli_dir_prov() {
        return cli_dir_prov;
    }

    public void setCli_dir_prov(String cli_dir_prov) {
        this.cli_dir_prov = cli_dir_prov;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }
    
}
