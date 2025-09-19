/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto12;

public class Contribuyente {
    private String nombre;
    private String cuil;
    
    //constructor 

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
    }
    

}

