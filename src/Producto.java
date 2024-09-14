public class Producto {

    //ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    //CONSTRUCTOR
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public void actualizarStock(int stock) {
        if (stock >= 1) {
            this.stock = stock;
        }else{
            System.out.println("NO SE PERMITE ACTUALIZAR, NO HAY STOCK");
        }
    }

    public double calcularPrecioTotal() {
        return precio * stock;
    }
    
    public Producto(String nombre, double precio, int stock){
        this.nombre =nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //GETTER Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}





    

