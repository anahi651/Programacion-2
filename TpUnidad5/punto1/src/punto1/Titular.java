/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto1;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;//Relacion bidireccional 
//constructor titular
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    
    
//setter con validación para mantener la coherencia relacion bidireccional
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte!=null && pasaporte.getTitular()!= this){
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}

