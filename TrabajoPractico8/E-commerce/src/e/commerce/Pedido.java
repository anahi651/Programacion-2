/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e.commerce;

import java.util.ArrayList;

public class Pedido implements Pagable,Notificable {
    private ArrayList<Producto>productos;
    private String estado;
    private Cliente Cliente;

    public Pedido( String estado, Cliente Cliente) {
        this.productos = new ArrayList();
        this.estado = estado;
        this.Cliente = Cliente;
    }


    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    @Override
    public double calcularTotal() {
        double total=0;
      for(Producto producto:productos){
         total+= producto.getPrecio();
      }
        return total;
      
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        
        Cliente.cambiarEstado("Tu pedido cambió de estado: " + estado);
    }

    public String getEstado() {
        return estado;
    }
    

}

