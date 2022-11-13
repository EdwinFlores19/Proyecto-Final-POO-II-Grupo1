package proyecto_final;

public class Productos {
    int p_id;
    String nombre;
    String color;
    String tamaño;
    int unidades;
    int stock;
    double costo;
    double precio;
    String f_ingreso;
    String f_vencimiento;

    public Productos() {
    }

    public Productos(int p_id, String nombre, String color, String tamaño, int unidades, int stock, double costo, double precio, String f_ingreso, String f_vencimiento) {
        this.p_id = p_id;
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.unidades = unidades;
        this.stock = stock;
        this.costo = costo;
        this.precio = precio;
        this.f_ingreso = f_ingreso;
        this.f_vencimiento = f_vencimiento;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public String getF_vencimiento() {
        return f_vencimiento;
    }

    public void setF_vencimiento(String f_vencimiento) {
        this.f_vencimiento = f_vencimiento;
    }
    
    
    
    
            
            
}
