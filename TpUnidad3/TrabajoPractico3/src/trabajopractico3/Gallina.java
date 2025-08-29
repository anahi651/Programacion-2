/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajopractico3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    
    public void  ponerHuevo(){
        huevosPuestos++;
        
    }
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("ID:"+idGallina+"\n"+"Edad:"+edad+"\n"+"Huevos:" +huevosPuestos);
         
    }

}

