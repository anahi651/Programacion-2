/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; //referencia bidireccional 
  //constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
   // set relacion bidireccional

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && computadora. getPropietario()!= this){
            computadora.setPropietario(this);
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }


}

