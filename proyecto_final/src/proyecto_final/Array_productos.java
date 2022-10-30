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
public class Array_productos {
    
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Producto.txt";
    
    private final ArrayList<Productos> productos_a = new ArrayList();
    
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Productos pro1 = new Productos();
                pro1.setP_id(Integer.parseInt(partes[0]));
                pro1.setNombre(partes[1]);
                pro1.setColor(partes[2]);
                pro1.setTamaño(partes[3]);
                pro1.setUnidades(Integer.parseInt(partes[4]));
                pro1.setStock(Integer.parseInt(partes[5]));
                pro1.setCosto(Double.parseDouble(partes[6]));
                pro1.setPrecio(Double.parseDouble(partes[7]));
                pro1.setF_ingreso(partes[8]);
                pro1.setF_vencimiento(partes[9]);

                productos_a.add(pro1);

            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Productos busqueda_codigo(int codigo) {
        for (int i = 0; i < productos_a.size(); i++) {
            if (productos_a.get(i).getP_id()== codigo) {
                return productos_a.get(i);
            }
        }
        
        return null;
    }
    
   /* public Productos busqueda_marca(String marca) {
        for (int i = 0; i < productos_a.size(); i++) {
            if (productos_a.get(i).get().equals(marca)) {
                return productos_a.get(i);
            }
        }
        return null;
    }*/

    public void grabar_archivo(Productos pro) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(pro.getP_id()+","+pro.getNombre()+","+pro.getColor()+","+pro.getTamaño()+","+pro.getUnidades()+","+pro.getStock()
            +","+pro.getCosto()+","+pro.getPrecio()+","+pro.getF_ingreso()+","+pro.getF_vencimiento());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }
    
    public int Correlativo() {
        if (productos_a.isEmpty()) {
            return 1;
        } else {
            return productos_a.get(productos_a.size() - 1).getP_id()+ 1;
        }
    }

    public Productos get(int pos) {
        return productos_a.get(pos);
    }

    public int rows() {
        return productos_a.size();
    }

    public void agregar(Productos pro) {
        productos_a.add(pro);
    }

    public int posicion(Productos pro) {
        for (int i = 0; i < rows(); i++) {
            if (pro.getP_id()== get(i).getP_id()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Productos pro) {
        productos_a.remove(posicion(pro));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Productos pro:productos_a)
            {
               pw.println(pro.getP_id()+","+pro.getNombre()+","+pro.getColor()+","+pro.getTamaño()+","+pro.getUnidades()+","+pro.getStock()
            +","+pro.getCosto()+","+pro.getPrecio()+","+pro.getF_ingreso()+","+pro.getF_vencimiento()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( Exception e ){
            System.out.println(e);
        }
    }
   
}
