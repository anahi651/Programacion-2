/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;//Asociación 1:1
    private Mesa mesa;//Agregación 1:1
    
    
    //constructor recibe el objeto contenido mesa ya creado

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void mostrarCliente() {
       if (cliente != null) {
           System.out.println("Reserva: Fecha "+fecha+" Hora:"+hora+" Cliente: "+ cliente);
       }else{
           System.out.println("Reserva: Fecha"+fecha+"Hora:"+hora+ " No se encuentra asignada a un cliente");   
       }
       }
    
    public void MostrarMesa() {
        System.out.println("Reserva: Fecha "+fecha+" Hora:"+hora+" Mesa numero: " +mesa);
                }
}


