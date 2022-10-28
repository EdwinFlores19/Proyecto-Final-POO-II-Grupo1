package Clases;

public class Usuario {  /*Login*/
    private String user_credencial;
    private String user_password;
    private String user_rol;

    public Usuario() {
    }

    
    public Usuario(String user_credencial, String user_password, String user_rol) {
        this.user_credencial = user_credencial;
        this.user_password = user_password;
        this.user_rol = user_rol;
    }


    public String getUser_credencial() {
        return user_credencial;
    }

    public void setUser_credencial(String user_credencial) {
        this.user_credencial = user_credencial;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_rol() {
        return user_rol;
    }

    public void setUser_rol(String user_rol) {
        this.user_rol = user_rol;
    }
    
    
}
