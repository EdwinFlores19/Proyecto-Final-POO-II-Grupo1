package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cliente_Array {

    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Clientes.txt";

    private final ArrayList<Cliente> cliente_a = new ArrayList();

    /* Métodos main */
    public void cliente_ini() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Cliente clien1 = new Cliente();
                clien1.setCli_dni(partes[0]);
                clien1.setCli_nombre(partes[1]);
                clien1.setCli_apellido(partes[2]);
                clien1.setCli_nacimiento(partes[3]);
                clien1.setCli_sexo(partes[4]);
                clien1.setCli_email(partes[5]);
                clien1.setCli_dir(partes[6]);
                clien1.setCli_dir_distr(partes[7]);
                clien1.setCli_dir_prov(partes[8]);

                cliente_a.add(clien1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Cliente buscar_cliente_cod(int codigo) {
        for (int i = 0; i < cliente_a.size(); i++) {
            if (cliente_a.get(i).getCli_dni().equals(codigo)) {
                return cliente_a.get(i);
            }
        }
        return null;
    }

    public Cliente buscar_cliente_dni(String dni) {
        for (int i = 0; i < cliente_a.size(); i++) {
            if (cliente_a.get(i).getCli_dni().equals(dni)) {
                return cliente_a.get(i);
            }
        }
        Cliente cerror = new Cliente();
        cerror.setCli_nombre("error");
        return cerror;
    }

    public void grabar_arch_cliente(Cliente obj) {
        try {
            FileWriter fw = new FileWriter(nom, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(obj.getCli_cod() + "," + obj.getCli_dni() + "," + obj.getCli_nombre() + ","
                    + obj.getCli_apellido() + ","
                    + obj.getCli_nacimiento() + "," + obj.getCli_sexo() + "," + obj.getCli_email() + ","
                    + obj.getCli_dir() + "," + obj.getCli_dir_distr() + "," + obj.getCli_dir_prov());
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
        if (cliente_a.isEmpty()) {
            return 1;
        } else {
            return cliente_a.get(cliente_a.size() - 1).getCli_cod() + 1;
        }
    }

    public Cliente get(int pos) {
        return cliente_a.get(pos);
    }

    public int rows() {
        return cliente_a.size();
    }

    public void agregar(Cliente obj) {
        cliente_a.add(obj);
    }

    public int posicion(Cliente obj) {
        for (int i = 0; i < cliente_a.size(); i++) {
            if (obj.getCli_cod() == cliente_a.get(i).getCli_cod()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Cliente obj) {
        cliente_a.remove(obj);
    }
}
