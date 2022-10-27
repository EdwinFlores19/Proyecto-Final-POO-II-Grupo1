package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Proveedor_Array {
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Proveedores.txt";

    private final ArrayList<Proveedor> proveedor_a = new ArrayList();

    /* Métodos main */
    public void proveedor_ini() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Proveedor prov1 = new Proveedor();
                prov1.setProv_ruc(partes[0]);
                prov1.setProv_raz_soc(partes[1]);
                prov1.setProv_dir(partes[2]);
                prov1.setProv_nom_contact_1(partes[3]);
                prov1.setProv_nom_contact_2(partes[4]);
                prov1.setProv_website(partes[5]);
                prov1.setProv_surcursal(partes[6]);

                proveedor_a.add(prov1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Proveedor buscar_proveedor_cod(int codigo) {
        for (int i = 0; i < proveedor_a.size(); i++) {
            if (proveedor_a.get(i).getProv_ruc().equals(codigo)) {
                return proveedor_a.get(i);
            }
        }
        return null;
    }

    public Proveedor buscar_proveedor_ruc(String ruc) {
        for (int i = 0; i < proveedor_a.size(); i++) {
            if (proveedor_a.get(i).getProv_ruc().equals(ruc)) {
                return proveedor_a.get(i);
            }
        }
        Proveedor perror = new Proveedor();
        perror.setProv_raz_soc("error");
        return perror;
    }

    public void grabar_arch_proveedor(Proveedor obj) {
        try {
            FileWriter fw = new FileWriter(nom, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(obj.getProv_cod() + "," + obj.getProv_ruc() + "," + obj.getProv_raz_soc() + ","
                    + obj.getProv_dir() + ","
                    + obj.getProv_nom_contact_1() + "," + obj.getProv_nom_contact_2() + "," + obj.getProv_website()
                    + "," + obj.getProv_surcursal());
            pw.print("\n");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /* Métodos auxiliares */
    public Proveedor get(int pos) {
        return proveedor_a.get(pos);
    }

    public int rows() {
        return proveedor_a.size();
    }

    public void agregar(Proveedor obj) {
        proveedor_a.add(obj);
    }

    public int posicion(Proveedor obj) {
        for (int i = 0; i < proveedor_a.size(); i++) {
            if (obj.getProv_cod() == proveedor_a.get(i).getProv_cod()) {
                return i;
            }
        }
        return -1;
    }

    public int Correlativo() {
        if (proveedor_a.isEmpty()) {
            return 1;
        } else {
            return proveedor_a.get(proveedor_a.size() - 1).getProv_cod() + 1;
        }
    }
}
