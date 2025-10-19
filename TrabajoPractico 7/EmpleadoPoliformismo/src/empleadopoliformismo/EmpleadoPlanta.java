/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package empleadopoliformismo;

public class EmpleadoPlanta extends Empleado{
     private final double sueldoBase = 800000;
    private int antiguedad;

    public EmpleadoPlanta(String legajo,int antiguedad) {
        super(legajo);
        this.antiguedad=antiguedad;
        
    }
   
    @Override
    public double calcularSueldo() {
        return sueldoBase+((sueldoBase*antiguedad)/100);


    }



}

