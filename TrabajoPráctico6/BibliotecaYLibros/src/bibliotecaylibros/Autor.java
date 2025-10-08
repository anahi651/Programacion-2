/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bibliotecaylibros;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    
    //constructor

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    //mostrarInfo() → Muestra la información del autor en consola.
    
    public void mostrarInfo(){
        System.out.println("Informacion del autor:\n ID:"+id+"\n Nombre: "+nombre+"\n Nacionalidad:"+nacionalidad);
    }

 

}

