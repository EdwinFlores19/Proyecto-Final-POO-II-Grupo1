/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author WILLIAM
 */
public class trabajador_Array {
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Trabajador.txt";

    private ArrayList<Trabajador> trabajador_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Trabajador tra1=new Trabajador();
                tra1.setDni(partes[0]);
                tra1.setNombre(partes[1]);
                tra1.setF_nacimiento(partes[2]);
                tra1.setSexo(partes[3]);
                tra1.setEmail(partes[4]);
                tra1.setDireccion(partes[5]);
                tra1.setD_distrito(partes[6]);
                tra1.setD_provincia(partes[7]);
                tra1.setSueldo(Double.parseDouble(partes[8]));
                tra1.setSist_pensiones(partes[9]);
                tra1.setF_ingreso(partes[10]);
                tra1.setN_hijos(Integer.parseInt(partes[11]));
                tra1.setS_salud(partes[12]);
                tra1.setRol_t(partes[13]);
                

                trabajador_a.add(tra1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Trabajador busqueda_credencial(String credencial) {
        for (int i = 0; i < trabajador_a.size(); i++) {
            if (trabajador_a.get(i).getDni().equals(credencial)) {
                return trabajador_a.get(i);
            }
        }
        Trabajador verror = new Trabajador();
        verror.setDni("");
        return verror;
    }

    public void grabar_archivo(Trabajador obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getDni()+","+obj.getNombre()+","+obj.getF_nacimiento()+","+obj.getSexo()+","+
                    obj.getEmail()+","+obj.getDireccion()+","+obj.getD_distrito()+","+obj.getD_provincia()+
                    ","+obj.getSueldo()+","+obj.getSist_pensiones()+","+obj.getF_ingreso()+","+obj.getN_hijos()+","+
                    obj.getS_salud()+","+obj.getRol_t());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */

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
        for (int i = 0; i < rows(); i++) {
            if (obj.getDni()== get(i).getDni()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Trabajador obj) {
        trabajador_a.remove(posicion(obj));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Trabajador obj:trabajador_a)
            {
               pw.println(obj.getDni()+","+obj.getNombre()+","+obj.getF_nacimiento()+","+obj.getSexo()+","+
                    obj.getEmail()+","+obj.getDireccion()+","+obj.getD_distrito()+","+obj.getD_provincia()+
                    ","+obj.getSueldo()+","+obj.getSist_pensiones()+","+obj.getF_ingreso()+","+obj.getN_hijos()+","+
                    obj.getS_salud()+","+obj.getRol_t()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
   }
}


