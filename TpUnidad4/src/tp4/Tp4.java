
package tp4;


public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia varios objetos usando ambos constructores.
        Empleado em1 =new Empleado (10,"Ana Baez","Administrativa",850000.20);
        Empleado em2 =new Empleado (11,"Analia Benitez","Tester",950000);
        Empleado em3 =new Empleado (12,"Angel Mertinez","Desarrollador",980000);
        Empleado em4 =new Empleado ("Juan Perez","Analista");
        Empleado em5 =new Empleado ("Marcos Aguilar","Desarrollador");
        Empleado em6 =new Empleado ("Mirian Seco","Administrativa");
        
        //información de cada empleado con toString().
        System.out.println("Informacion de cada empleado con toString().");
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println(em4);
        System.out.println(em5);
        System.out.println(em6);
        //Se Aplica  métodos actualizarSalario()
        em2.actualizarSalario(10);
        em4.actualizarSalario(1000.0);
        
        //información de cada empleado con salario actualizado.
        System.out.println("Informacion de cada empleado con salario actualizado.");
        System.out.println(em2);
        System.out.println(em4);
    
        //total de empleados
        
        System.out.println("Total de empleados: "+Empleado.getTotalEmpleados());
        
        
        
        
        
        
        
        
        
    }
       

}
