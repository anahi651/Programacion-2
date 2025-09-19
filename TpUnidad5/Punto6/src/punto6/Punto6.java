
package punto6;


public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea objeto contenido mesa
        Mesa mesa1= new Mesa(1,6);
        Mesa mesa2= new Mesa(5,4);
       //se crea reserva
       Reserva reserva1 =new Reserva("17/08/2025","22:00 HS",mesa1);
       Reserva reserva2 =new Reserva("15/08/2025","21:00 HS",mesa2);
       //se crea Cliente 
       Cliente cliente1= new Cliente ("Marcos Gutierrez","11-2569-8596");
       //se establece relación de asociacón 
       reserva1.setCliente(cliente1);
       //Utilizamos la relación asociacion
        reserva1.mostrarCliente();// ASIGNADA
        reserva2.mostrarCliente();//NO ASIGNADA
        //utilizamos la relacion agregacion
        reserva1.MostrarMesa();
        reserva2.MostrarMesa();
        
    }

}
