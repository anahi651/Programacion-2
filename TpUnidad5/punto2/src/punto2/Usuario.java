/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto2;

public class Usuario {
private String nombre;
private String dni;
private Celular celular;//Bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
//setters con validación para mantener la coherencia de la relación bidireccional
    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario()!= this){
            celular.setUsuario(this);
        }
        
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }
   
}

