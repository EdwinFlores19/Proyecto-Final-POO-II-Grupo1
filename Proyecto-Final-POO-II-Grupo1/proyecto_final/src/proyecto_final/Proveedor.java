package proyecto_final;

public class Proveedor {
    private String ruc;
    private String raz_social;
    private String direccion;
    private String nom_contact1;
    private String nom_contact2;
    private String website;
    private String surcursal;

    public Proveedor() {}

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRaz_social() {
        return raz_social;
    }

    public void setRaz_social(String raz_social) {
        this.raz_social = raz_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNom_contact1() {
        return nom_contact1;
    }

    public void setNom_contact1(String nom_contact1) {
        this.nom_contact1 = nom_contact1;
    }

    public String getNom_contact2() {
        return nom_contact2;
    }

    public void setNom_contact2(String nom_contact2) {
        this.nom_contact2 = nom_contact2;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSurcursal() {
        return surcursal;
    }

    public void setSurcursal(String surcursal) {
        this.surcursal = surcursal;
    }
    
}