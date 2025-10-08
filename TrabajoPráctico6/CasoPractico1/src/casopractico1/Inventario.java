/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package casopractico1;

import java.util.ArrayList;

public class Inventario {
 private ArrayList<Producto>productos;
 
//constructor instancia la coleccion
    public Inventario() {
        this.productos = new ArrayList<>();
        
    }
 //método agregar producto
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
        
    }
  //metodo listar productos
    
      public void listarProductos(){
        for (Producto producto : productos){  
            System.out.println(producto);
        }
    }
   //metodo buscar productos por id 
    public Producto buscarProductoPorId(String id) {
    int i=0;
    Producto encontrado=null;
    while(i<productos.size()&&!this.productos.get(i).getID().equals(id)){
        i++;
    }
    if(i<productos.size()){
        encontrado=this.productos.get(i);
    }
    return encontrado;
}

    //metodo eliminar producto 
    public Producto eliminarProducto(String id){
    Producto eliminar=buscarProductoPorId(id);
    if(eliminar!=null){
     this.productos.remove(eliminar);    
    }
    return eliminar;
    }
    
    //actualizarStock(String id, int nuevaCantidad)busca producto con el metodo buscarProductoPorId sino es null actualiza cant
    public Producto actualizarStock(String id, int nuevaCantidad){
    Producto actualizar=buscarProductoPorId(id); 
    if(actualizar!=null){
    actualizar.setCantidad(nuevaCantidad);
        
    }
    return actualizar;
    }
   //metodo filtrar por categoria
    public ArrayList<Producto>filtrarPorCategoria(CategoriaProducto categoria){
     ArrayList<Producto>filtrados= new ArrayList<>();// lista para que guarde los productos filtrados
        for (Producto producto : productos) {
            if(producto.getCategoria()==categoria)
                filtrados.add(producto);
        }
        return filtrados;
    }
            
     public void obtenerTotalStock() {
         int total = 0;
         for (Producto producto : productos) {
             System.out.println(producto.getNombre() + ": " + producto.getCantidad() + " unidades");
             total += producto.getCantidad();
    }
         System.out.println("Total general de stock: " + total);
}           
    
    //
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayor.getCantidad()) {
                mayor = producto;
        }
    }
        return mayor;
}

  
    public ArrayList<Producto>filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto>filtrados=new ArrayList<>();
        for (Producto producto: productos){
            if(producto.getPrecio()>min && producto.getPrecio()<max)
            filtrados.add(producto);
      
        }
        return filtrados;

        
    }
     
     public void mostrarCategoriasDisponibles(){
            for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        } 
      
     }
       
            
            
    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }



}

