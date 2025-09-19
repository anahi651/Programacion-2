
package punto4;


public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de objeto cliente y tarjeta
        
        Cliente cliente1= new Cliente("Juana Alvarez", "36987586");
        //Creacion objeto contenido banco 
        Banco banco1= new Banco("La Nacion","27-586962589-23");
        
        TarjetaDeCredito tarjeta1= new TarjetaDeCredito("3695-6987-68896","14/02/2028",banco1);
        // Establecer la relación bidireccional
        cliente1.setTarjetaDeCredito(tarjeta1);
        
        //Mostramos cliente
        System.out.println(cliente1);
    }

}
