/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e.commerce;

public class Cliente implements Notificable{
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
        
        

    @Override
    public void cambiarEstado(String mensaje) {
        System.out.println("Notificacion cambio estado de pedido para"+nombre+mensaje);
    }

    public String getNombre() {
        return nombre;
    }
    
}

