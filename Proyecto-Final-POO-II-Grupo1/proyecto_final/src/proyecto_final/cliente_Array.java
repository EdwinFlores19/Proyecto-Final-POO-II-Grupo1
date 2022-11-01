/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

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
public class cliente_Array {

    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Cliente.txt";

    private ArrayList<Cliente> cliente_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Cliente cliente1 = new Cliente();
                cliente1.setDocumento(partes[0]);
                cliente1.setNombre(partes[1]);
                cliente1.setApellido(partes[2]);
                cliente1.setF_nacimiento(partes[3]);
                cliente1.setSexo(partes[4]);
                cliente1.setEmail(partes[5]);
                cliente1.setDireccion(partes[6]);
                cliente1.setD_distrito(partes[7]);
                cliente1.setD_provincia(partes[8]);

                cliente_a.add(cliente1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /*    public Usuario busqueda_codigo(int codigo) {
        for (int i = 0; i < usuario_a.size(); i++) {
            if (usuario_a.get(i).getId()== codigo) {
                return usuario_a.get(i);
            }
        }
        return null;
    }*/
    public Cliente busqueda_credencial(String credencial) {
        for (int i = 0; i < cliente_a.size(); i++) {
            if (cliente_a.get(i).getDocumento().equals(credencial)) {
                return cliente_a.get(i);
            }
        }
        Cliente cliente1=new Cliente();
        cliente1.setDocumento("");
        return cliente1;
    }

    public void grabar_archivo(Cliente obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getDocumento()+","+obj.getNombre()+","+obj.getApellido()
            +","+obj.getF_nacimiento()+","+obj.getSexo()+","+obj.getEmail()+","+
                    obj.getDireccion()+","+obj.getD_distrito()+","+obj.getD_provincia());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */
    /*public int Correlativo() {
        if (usuario_a.isEmpty()) {
            return 1;
        } else {
            return usuario_a.get(usuario_a.size() - 1).getId() + 1;
        }
    }*/

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
        for (int i = 0; i < rows(); i++) {
            if (obj.getDocumento() == get(i).getDocumento()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Cliente obj) {
        cliente_a.remove(posicion(obj));
    }

    public void grabarModificareliminar() {
        try {
            FileWriter f = new FileWriter(nom, false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for (Cliente obj : cliente_a) {
                pw.println(obj.getDocumento()+","+obj.getNombre()+","+obj.getApellido()
            +","+obj.getF_nacimiento()+","+obj.getSexo()+","+obj.getEmail()+","+
                    obj.getDireccion()+","+obj.getD_distrito()+","+obj.getD_provincia());
            }

            pw.flush();
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
