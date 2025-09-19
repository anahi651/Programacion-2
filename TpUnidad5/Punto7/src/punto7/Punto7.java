
package punto7;


public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creacion de objeto contenido motor
        
        Motor motorA = new Motor("2 tiempos","004");
        
        //creamos el objeto contenedor 
        
        Vehiculo vehiculo1= new Vehiculo("AXY 645 586","Corolla",motorA);
        
        //Utilizamos relacion de agregacion usamos metodo toString para mostrar motor
        System.out.println(vehiculo1);
         //Creacion de objeto conductor
         Conductor conductor1= new Conductor("Juan Perez","Licencia Juan Perez");
         //Se establece relacion bidireccional 
         
         
        vehiculo1.setConductor(conductor1);
        
       // Verificar la relación desde ambos lados
       System.out.println("Vehiculo: " +vehiculo1);
       System.out.println("Condutor del Vehiculo: " + vehiculo1.getConductor());
       System.out.println("Vehiculo asociado al condutor: " + conductor1.getVehiculo());
    }

}
