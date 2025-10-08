
package casopractico1;


public class CasoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inventario inventario= new Inventario();
       // Creacion productos con diferentes categorías 
       Producto producto1= new Producto("001","Yerba",1050,200,CategoriaProducto.ALIMENTOS);
       Producto producto2= new Producto("112","Teve Led",150000.50,10,CategoriaProducto.ELECTRONICA);
       Producto producto3= new Producto("222","Mesa Jardin",105500.50,5,CategoriaProducto.HOGAR);
       Producto producto4= new Producto("333","Jean Dama",2000.50,12,CategoriaProducto.ROPA);
       Producto producto5= new Producto("025","Camisa hombre",2500.50,200,CategoriaProducto.ROPA);
       
       // se agregan productos a inventario
       inventario.agregarProducto(producto1);
       inventario.agregarProducto(producto2);
       inventario.agregarProducto(producto3);
       inventario.agregarProducto(producto4);
       inventario.agregarProducto(producto5);
       
       //Busqueda de producto por id
       
        System.out.println("Busqueda de producto por ID :"+inventario.buscarProductoPorId("001"));
        
        //Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("Productos filtrados categoria ROPA:"+inventario.filtrarPorCategoria(CategoriaProducto.ROPA));
        
        //Eliminar un producto por su ID 
        inventario.eliminarProducto("001");
        
        //listar productos
        System.out.println("Listado de productos:");
        inventario.listarProductos();
        
        //Actualizar el stock de un producto existente.
        inventario.actualizarStock("333", 15);
        
        //mostrar cantidad de stock
        System.out.println("Total de Stock:");
       inventario.obtenerTotalStock();
       
       //producto con mayor stock
       System.out.println("Producto con mayor Stock:"+inventario.obtenerProductoConMayorStock());
       
       //9. Filtrar productos con precios entre $1000 y $3000.
        
        System.out.println("Filtrar productos entre precio min y max:"+inventario.filtrarProductosPorPrecio(1000, 3000));
        
        
        //10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
        
       
       
      
 


       
       
       
    }

}
