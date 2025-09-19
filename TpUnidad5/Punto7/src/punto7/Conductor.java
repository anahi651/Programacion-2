/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // atributo por relacion bidireccional 
//constructor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
 // set para relacion bidireccional con validacion para evitar bucle 

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this ){
            vehiculo.setConductor(this);
        }
    }
    
    
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + '}';
    }
    
    
    

}

