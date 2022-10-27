/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author WILLIAM
 */
public class Usuario_Array {
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Usuario.txt";

    private final ArrayList<Usuario> usuario_a = new ArrayList();

    /* Métodos main */
    public void usuario_ini() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Usuario usu1 = new Usuario();
                usu1.setUser_credencial(partes[0]);
                usu1.setUser_password(partes[1]);
                usu1.setUser_rol(partes[2]);
             
                usuario_a.add(usu1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Usuario buscar_usuario_credencial(int codigo) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getUser_credencial().equals(codigo)) {
                return usuario_a.get(i);
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
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Trabajador obj:trabajador_a)
            {
               pw.println(obj.getTrab_cod() + "," + obj.getTrab_dni() + "," + obj.getTrab_nombre() + ","
                    + obj.getTrab_apellido() + ","
                    + obj.getTrab_nacimiento() + "," + obj.getTrab_sexo() + "," + obj.getTrab_email() + ","
                    + obj.getTrab_dir() + "," + obj.getTrab_dir_distr() + "," + obj.getTrab_dir_prov() + ","
                    + obj.getTrab_sueldo() + "," + obj.getTrab_sist_pen() + "," + obj.getTrab_f_ingreso() + ","
                    + obj.getTrab_hijos() + "," + obj.getTrab_seguro()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }
}
