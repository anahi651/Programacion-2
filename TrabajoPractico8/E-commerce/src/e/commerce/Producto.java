/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e.commerce;

public class Producto implements Pagable {
private String nombre;
private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }



    @Override
    public double calcularTotal() {
     
    return precio;
     
    }

    public double getPrecio() {
        return precio;
    }

}

