package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trabajador_Array {

    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Trabajadores.txt";

    private final ArrayList<Trabajador> trabajador_a = new ArrayList();

    /* Métodos main */
    public void trabajador_ini() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Trabajador trab1 = new Trabajador();
                trab1.setTrab_dni(partes[0]);
                trab1.setTrab_nombre(partes[1]);
                trab1.setTrab_apellido(partes[2]);
                trab1.setTrab_nacimiento(partes[3]);
                trab1.setTrab_sexo(partes[4]);
                trab1.setTrab_email(partes[5]);
                trab1.setTrab_dir(partes[6]);
                trab1.setTrab_dir_distr(partes[7]);
                trab1.setTrab_dir_prov(partes[8]);
                trab1.setTrab_sueldo(Double.parseDouble(partes[9]));
                trab1.setTrab_sist_pen(partes[10]);
                trab1.setTrab_f_ingreso(partes[11]);
                trab1.setTrab_hijos(Integer.parseInt(partes[12]));
                trab1.setTrab_seguro(partes[13]);

                trabajador_a.add(trab1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Trabajador buscar_trabajador_cod(int codigo) {
        for (int i = 0; i < trabajador_a.size(); i++) {
            if (trabajador_a.get(i).getTrab_dni().equals(codigo)) {
                return trabajador_a.get(i);
            }
        }
        return null;
    }

    public Trabajador buscar_trabajador_dni(String dni) {
        for (int i = 0; i < trabajador_a.size(); i++) {
            if (trabajador_a.get(i).getTrab_dni().equals(dni)) {
                return trabajador_a.get(i);
            }
        }
        Trabajador cerror = new Trabajador();
        cerror.setTrab_nombre("error");
        return cerror;
    }

    public void grabar_arch_trabajador(Trabajador obj) {
        try {
            FileWriter fw = new FileWriter(nom, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(obj.getTrab_cod() + "," + obj.getTrab_dni() + "," + obj.getTrab_nombre() + ","
                    + obj.getTrab_apellido() + ","
                    + obj.getTrab_nacimiento() + "," + obj.getTrab_sexo() + "," + obj.getTrab_email() + ","
                    + obj.getTrab_dir() + "," + obj.getTrab_dir_distr() + "," + obj.getTrab_dir_prov() + ","
                    + obj.getTrab_sueldo() + "," + obj.getTrab_sist_pen() + "," + obj.getTrab_f_ingreso() + ","
                    + obj.getTrab_hijos() + "," + obj.getTrab_seguro());
            pw.print("\n");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /* Métodos auxiliares */
    public int Correlativo() {
        if (trabajador_a.isEmpty()) {
            return 1;
        } else {
            return trabajador_a.get(trabajador_a.size() - 1).getTrab_cod() + 1;
        }
    }

    public Trabajador get(int pos) {
        return trabajador_a.get(pos);
    }

    public int rows() {
        return trabajador_a.size();
    }

    public void agregar(Trabajador obj) {
        trabajador_a.add(obj);
    }

    public int posicion(Trabajador obj) {
        for (int i = 0; i < trabajador_a.size(); i++) {
            if (obj.getTrab_cod() == trabajador_a.get(i).getTrab_cod()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Trabajador obj) {
        trabajador_a.remove(obj);
    }
}
