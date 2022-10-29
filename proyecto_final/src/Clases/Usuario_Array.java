package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Usuario_Array {
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Usuarios.txt";
    
    private final ArrayList<Usuario> usuario_a = new ArrayList();
    
    /* Métodos main */
    public void trabajador_ini() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Usuario user1 = new Usuario(partes[0], partes[1], partes[2]);
                usuario_a.add(user1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Usuario buscar_user_credencial(String credencial) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getUser_credencial().equals(credencial)) {
                return usuario_a.get(i);
            }
        }
        return null;
    }
    
    public Usuario buscar_user_pass(String pass) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getUser_password().equals(pass)) {
                return usuario_a.get(i);
            }
        }
        Usuario uerror = new Usuario("000000000", "error", "error");
        return uerror;
    }
    
    public void grabar_arch_usuario(Usuario obj) {
        try {
            FileWriter fw = new FileWriter(nom, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(obj.getUser_credencial() + "," + obj.getUser_password() + "," + obj.getUser_rol());
            pw.print("\n");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void grabarModificareliminar() {
        try {
            FileWriter f = new FileWriter(nom, false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for (Usuario obj : usuario_a) {
                pw.println(obj.getUser_credencial() + "," + obj.getUser_password() + "," + obj.getUser_rol());
            }
            pw.print("\n");
            pw.flush();
            pw.close();
            b.close();
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /* Métodos auxiliares */
    public Usuario get(int pos) {
        return usuario_a.get(pos);
    }

    public int rows() {
        return usuario_a.size();
    }

    public void agregar(Trabajador obj) {
        usuario_a.add(obj);
    }

    public void remove(Trabajador obj) {
        usuario_a.remove(obj);
    }
}
