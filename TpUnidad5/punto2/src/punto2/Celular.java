/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto2;

public class Celular {
private int imei;
private String marca;
private String modelo;
private Bateria bateria; //Agregación 1:
private Usuario usuario;//Bidireccional

//constructor con objeto contenido que se agrega al constructor 

    public Celular(int imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

//setter con validación para mantener la coherencia de la relación.

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario!= null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }

}

