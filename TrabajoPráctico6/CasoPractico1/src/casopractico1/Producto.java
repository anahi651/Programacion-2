/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package casopractico1;

public class Producto {
    private String ID;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto Categoria;

    public Producto(String ID, String nombre, double precio, int cantidad, CategoriaProducto Categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.Categoria = Categoria;
    }
// se utiliza en metodo buscar producto por id 
    public String getID() {
        return ID;
    }

    public CategoriaProducto getCategoria() {
        return Categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

//se sobrescribe para que metodo listar producto no devuelva direccion de memoria sino los datos listados    
    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", Categoria=" + Categoria + '}';
    }

 
    
    
    
    
    

}

