package proyecto_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DetalleVentas_Array {
    String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "DetalleVentas.txt";

    private final ArrayList<DetalleVentas> detalle_a = new ArrayList();

    /* Metodos main */
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                DetalleVentas detalle1=new DetalleVentas();
                detalle1.setCodVenta(Integer.parseInt(partes[0]));
                detalle1.setCodProducto(Integer.parseInt(partes[1]));
                detalle1.setCantidad(Integer.parseInt(partes[2]));
                detalle1.setPrecioProducto(Float.parseFloat(partes[3]));
                detalle1.setImporteTotal(Float.parseFloat(partes[4]));
                
                detalle_a.add(detalle1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DetalleVentas busqueda_codigoVenta(int codigo) {
        for (int i = 0; i < detalle_a.size(); i++) {
            if (detalle_a.get(i).getCodVenta()== codigo) {
                return detalle_a.get(i);
            }
        }
        return null;
    }

    /*public DetalleVentas busquedaCliente(String docCliente) {
        for (int i = 0; i < ventas_a.size(); i++) {
            if (ventas_a.get(i).getDocCliente().equals(docCliente)) {
                return ventas_a.get(i);
            }
        }
        Ventas verror = new Ventas();
        verror.setDocCliente("");
        return verror;
    }*/

    public void grabar_archivo(DetalleVentas obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getCodVenta()+","+obj.getCodProducto()+","+obj.getCantidad()+","+obj.getPrecioProducto()
            +","+obj.getImporteTotal());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }

    /* Metodos auxiliares */
   /* public int Correlativo() {
        if (ventas_a.isEmpty()) {
            return 1;
        } else {
            return ventas_a.get(ventas_a.size() - 1).getCodigo()+ 1;
        }
    }*/

    public DetalleVentas get(int pos) {
        return detalle_a.get(pos);
    }

    public int rows() {
        return detalle_a.size();
    }

    public void agregar(DetalleVentas obj) {
        detalle_a.add(obj);
    }

    public int posicion(DetalleVentas obj) {
        for (int i = 0; i < rows(); i++) {
            if (obj.getCodVenta()== get(i).getCodVenta()) {
                return i;
            }
        }
        return -1;
    }

    public void remove(DetalleVentas obj) {
        detalle_a.remove(posicion(obj));
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(DetalleVentas obj:detalle_a)
            {
               pw.println(obj.getCodVenta()+","+obj.getCodProducto()+","+obj.getCantidad()+","+obj.getPrecioProducto()
            +","+obj.getImporteTotal()); 
            }
            
            pw.flush();
            pw.close();
        } catch ( IOException e ){
            System.out.println(e);
        }
   }
}
