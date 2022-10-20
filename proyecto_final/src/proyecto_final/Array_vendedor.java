package proyecto_final;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Array_vendedor {

    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Vendedor.txt";

    private final ArrayList<Vendedor> vendedor_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Vendedor ven1 = new Vendedor();
                ven1.setCodigo(Integer.parseInt(partes[0]));
                ven1.setNombre(partes[1]);
                ven1.setDni(partes[2]);
                ven1.setContrasena(partes[3]);
                ven1.setRol(partes[4]);

                vendedor_a.add(ven1);

            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Vendedor busqueda_codigo(int codigo) {
        for (int i = 0; i < vendedor_a.size(); i++) {
            if (vendedor_a.get(i).getCodigo() == codigo) {
                return vendedor_a.get(i);
            }
        }
        return null;
    }

    public Vendedor busqueda_dni(String dni) {
        for (int i = 0; i < vendedor_a.size(); i++) {
            if (vendedor_a.get(i).getDni().equals(dni)) {
                return vendedor_a.get(i);
            }
        }
        Vendedor verror = new Vendedor();
        verror.setContrasena("error");
        return verror;
    }

    public void grabar_archivo(Vendedor obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getCodigo() + "," + obj.getNombre() + "," + obj.getDni() + "," + obj.getContrasena() + ","
                    + obj.getRol());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */
    public int Correlativo() {
        if (vendedor_a.isEmpty()) {
            return 1;
        } else {
            return vendedor_a.get(vendedor_a.size() - 1).getCodigo() + 1;
        }
    }

    public Vendedor get(int pos) {
        return vendedor_a.get(pos);
    }

    public int rows() {
        return vendedor_a.size();
    }

    public void agregar(Vendedor obj) {
        vendedor_a.add(obj);
    }

    public int posicion(Vendedor obj) {
        for (int i = 0; i < rows(); i++) {
            if (obj.getCodigo() == get(i).getCodigo()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Vendedor obj) {
        vendedor_a.remove(posicion(obj));
    }
}
/*
 * public static void guardar(int id,String nombre,String termin,String nomA){
 * try{
 * FileWriter f= new FileWriter(nomA,true);
 * BufferedWriter b=new BufferedWriter(f);
 * PrintWriter pw=new PrintWriter(b);
 * 
 * pw.print(id+","+nombre+","+termin);
 * pw.print("\n");
 * pw.flush();
 * pw.close();
 * 
 * JOptionPane.showMessageDialog(null, "Se ha inscrito correctamente");
 * 
 * }
 * catch(Exception e){
 * System.out.println(e);
 * }
 * }
 */
