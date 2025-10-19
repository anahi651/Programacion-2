/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package empleadopoliformismo;

public class EmpleadoTemporal extends Empleado {
     private final double sueldoBase = 700000;
     
    public EmpleadoTemporal(String legajo) {
        super(legajo);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
   

    


}

