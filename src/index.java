public class index {
    public static void main(String[] args) {
       
        Tienda tienda = new Tienda();

        Producto p1 = new Producto("Camiseta", 15.99, 20);
        Producto p2 = new Producto("Pantalon", 39.99, 10);
        Producto p3 = new Producto("Zapatos", 60.99, 5);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);

        Producto encontrado = tienda.buscarProductoPorNombre("Camiseta");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("NO SE PERMITE ACTUALIZAR, NO HAY STOCK");
        }

        double valorTotal = tienda.calcularValorTotalInventario();
        System.out.println("Valor total del stock: $" + valorTotal);

        System.out.println("Productos con stock bajo (limite 3):");
        tienda.mostrarProductosConStockBajo(3);

    }
}
