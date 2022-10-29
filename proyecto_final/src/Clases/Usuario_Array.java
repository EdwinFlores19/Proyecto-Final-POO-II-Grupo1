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
    String nom = "Usuario.txt";

    private ArrayList<Usuario> usuario_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Usuario user1=new Usuario();
                user1.setId(Integer.parseInt(partes[0]));
                user1.setCredencial(partes[1]);
                user1.setPassword(partes[2]);
                user1.setRol(partes[3]);

                usuario_a.add(user1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Usuario busqueda_codigo(int codigo) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getId()== codigo) {
                return usuario_a.get(i);
            }
        }
        return null;
    }

    public Usuario busqueda_credencial(String credencial) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getCredencial().equals(credencial)) {
                return usuario_a.get(i);
            }
        }
        Usuario verror = new Usuario();
        verror.setCredencial("");
        return verror;
    }

    public void grabar_archivo(Usuario obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getId()+","+obj.getCredencial()+","+obj.getPassword()+","+obj.getRol());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */
    public int Correlativo() {
        if (usuario_a.isEmpty()) {
            return 1;
        } else {
            return usuario_a.get(usuario_a.size() - 1).getId()+ 1;
        }
    }

    public Usuario get(int pos) {
        return usuario_a.get(pos);
    }

    public int rows() {
        return usuario_a.size();
    }

    public void agregar(Usuario obj) {
        usuario_a.add(obj);
    }

    public int posicion(Usuario obj) {
        for (int i = 0; i < rows(); i++) {
            if (obj.getId()== get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Usuario obj) {
        usuario_a.remove(posicion(obj));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Usuario obj:usuario_a)
            {
               pw.println(obj.getId()+","+obj.getCredencial()+","+obj.getPassword()+","+obj.getRol()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }
}
