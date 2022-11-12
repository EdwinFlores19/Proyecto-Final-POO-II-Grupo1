package proyecto_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventas_Array {
    
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "Ventas.txt";

    private final ArrayList<Ventas> ventas_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                Ventas venta1=new Ventas();
                venta1.setCodigo(Integer.parseInt(partes[0]));
                venta1.setFecha(partes[1]);
                venta1.setHora(partes[2]);
                venta1.setSubtotal(Float.parseFloat(partes[3]));
                venta1.setIgv(Float.parseFloat(partes[4]));
                venta1.setTotal(Float.parseFloat(partes[5]));
                venta1.setDocCliente(partes[6]);
                venta1.setDocVendedor(partes[7]);
                venta1.setTipoVenta(partes[8]);

                ventas_a.add(venta1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Ventas busqueda_codigo(int codigo) {
        for (int i = 0; i < ventas_a.size(); i++) {
            if (ventas_a.get(i).getCodigo()== codigo) {
                return ventas_a.get(i);
            }
        }
        return null;
    }

    public Ventas busquedaCliente(String docCliente) {
        for (int i = 0; i < ventas_a.size(); i++) {
            if (ventas_a.get(i).getDocCliente().equals(docCliente)) {
                return ventas_a.get(i);
            }
        }
        Ventas verror = new Ventas();
        verror.setDocCliente("");
        return verror;
    }

    public void grabar_archivo(Ventas obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getCodigo()+","+obj.getFecha()+","+obj.getHora()+","+obj.getSubtotal()+","+obj.getIgv()
            +","+obj.getTotal()+","+obj.getDocCliente()+","+obj.getDocVendedor()+","+obj.getTipoVenta());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */
    public int Correlativo() {
        if (ventas_a.isEmpty()) {
            return 1;
        } else {
            return ventas_a.get(ventas_a.size() - 1).getCodigo()+ 1;
        }
    }

    public Ventas get(int pos) {
        return ventas_a.get(pos);
    }

    public int rows() {
        return ventas_a.size();
    }

    public void agregar(Ventas obj) {
        ventas_a.add(obj);
    }

    public int posicion(Ventas obj) {
        for (int i = 0; i < rows(); i++) {
            if (obj.getCodigo()== get(i).getCodigo()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Ventas obj) {
        ventas_a.remove(posicion(obj));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(Ventas obj:ventas_a)
            {
               pw.println(obj.getCodigo()+","+obj.getFecha()+","+obj.getHora()+","+obj.getSubtotal()+","+obj.getIgv()
            +","+obj.getTotal()+","+obj.getDocCliente()+","+obj.getDocVendedor()+","+obj.getTipoVenta()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( IOException e ){
            System.out.println(e);
        }
   }
}

