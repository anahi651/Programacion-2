/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package empleadopoliformismo;

public abstract class Empleado {
    private String legajo;
   

    public Empleado(String legajo) {
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }


    public abstract double calcularSueldo();
        
    
    

}

