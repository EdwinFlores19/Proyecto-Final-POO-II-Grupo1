package Clases;

public class Proveedor {
    private int prov_cod;
    private String prov_ruc;
    private String prov_raz_soc;
    private String prov_dir;
    private String prov_nom_contact_1;
    private String prov_nom_contact_2;
    private String prov_website;
    private String prov_surcursal;

    public Proveedor() {}
    
    public Proveedor(String prov_ruc, String prov_raz_soc, String prov_dir, String prov_nom_contact_1, String prov_nom_contact_2, String prov_website, String prov_surcursal, int prov_cod) {
        this.prov_ruc = prov_ruc;
        this.prov_raz_soc = prov_raz_soc;
        this.prov_cod = prov_cod;
        this.prov_dir = prov_dir;
        this.prov_nom_contact_1 = prov_nom_contact_1;
        this.prov_nom_contact_2 = prov_nom_contact_2;
        this.prov_website = prov_website;
        this.prov_surcursal = prov_surcursal;
    }

    public int getProv_cod() {
        return prov_cod;
    }

    public void setProv_cod(int prov_cod) {
        this.prov_cod = prov_cod;
    }

    public String getProv_ruc() {
        return prov_ruc;
    }

    public void setProv_ruc(String prov_ruc) {
        this.prov_ruc = prov_ruc;
    }

    public String getProv_raz_soc() {
        return prov_raz_soc;
    }

    public void setProv_raz_soc(String prov_raz_soc) {
        this.prov_raz_soc = prov_raz_soc;
    }

    public String getProv_dir() {
        return prov_dir;
    }

    public void setProv_dir(String prov_dir) {
        this.prov_dir = prov_dir;
    }

    public String getProv_nom_contact_1() {
        return prov_nom_contact_1;
    }

    public void setProv_nom_contact_1(String prov_nom_contact_1) {
        this.prov_nom_contact_1 = prov_nom_contact_1;
    }

    public String getProv_nom_contact_2() {
        return prov_nom_contact_2;
    }

    public void setProv_nom_contact_2(String prov_nom_contact_2) {
        this.prov_nom_contact_2 = prov_nom_contact_2;
    }

    public String getProv_website() {
        return prov_website;
    }

    public void setProv_website(String prov_website) {
        this.prov_website = prov_website;
    }

    public String getProv_surcursal() {
        return prov_surcursal;
    }

    public void setProv_surcursal(String prov_surcursal) {
        this.prov_surcursal = prov_surcursal;
    }
    
    
}
