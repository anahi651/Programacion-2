
package empleadopoliformismo;

import java.util.ArrayList;


public class EmpleadoPoliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Empleado>empleados=new ArrayList<>();
      EmpleadoPlanta JuanGutierrez= new EmpleadoPlanta("101258",5);
      EmpleadoPlanta MarcosPerez= new EmpleadoPlanta("101879",1);
      EmpleadoTemporal MariaLopez= new EmpleadoTemporal("202258");
      EmpleadoTemporal MartaSeco= new EmpleadoTemporal("202587");
      
      empleados.add(JuanGutierrez);
      empleados.add(MarcosPerez);
      empleados.add(MariaLopez);
      empleados.add(MartaSeco);
      
      for(Empleado empleado: empleados){
          System.out.println("Legajo:"+ empleado.getLegajo());
          System.out.println("Sueldo:"+ empleado.calcularSueldo());
                if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
      }
    }

}
