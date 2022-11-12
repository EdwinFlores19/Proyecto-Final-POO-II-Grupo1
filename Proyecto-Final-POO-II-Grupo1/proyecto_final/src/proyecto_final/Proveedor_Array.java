package proyecto_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proveedor_Array {

    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Proveedores.txt";

    private final ArrayList<Proveedor> proveedor_a = new ArrayList();

    /*Metodos Main*/
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Proveedor prod1 = new Proveedor();
                prod1.setRuc(partes[0]);
                prod1.setRaz_social(partes[1]);
                prod1.setDireccion(partes[2]);
                prod1.setNom_contact1(partes[3]);
                prod1.setNom_contact2(partes[4]);
                prod1.setWebsite(partes[5]);
                prod1.setSurcursal(partes[6]);

                proveedor_a.add(prod1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Proveedor busqueda_proveedor(String ruc) {
        for (int i = 0; i < proveedor_a.size(); i++) {
            if (proveedor_a.get(i).getRuc().equals(ruc)) {
                return proveedor_a.get(i);
            }
        }
        return null;
    }

    public void grabar_archivo(Proveedor obj) {
        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getRuc() + "," + obj.getRaz_social() + "," + obj.getDireccion() + "," + obj.getNom_contact1() + "," + obj.getNom_contact2() + "," + obj.getWebsite() + "," + obj.getSurcursal());
            pw.print("\n");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }
    /* Metodos auxiliares */
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
        for (int i = 0; i < rows(); i++) {
            if (obj.getRuc().equals(get(i).getRuc())) {
                return i;
            }
        }
        return -1;
    }
    
    public void remove(Proveedor obj) {
        proveedor_a.remove(posicion(obj));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Proveedor obj : proveedor_a) {
                pw.print(obj.getRuc() + "," + obj.getRaz_social() + "," + obj.getDireccion() + "," + obj.getNom_contact1() + "," + obj.getNom_contact2() + "," + obj.getWebsite() + "," + obj.getSurcursal());
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
