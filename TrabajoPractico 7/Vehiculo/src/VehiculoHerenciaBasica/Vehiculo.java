/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package VehiculoHerenciaBasica;
//superclase
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Vehiculo:\n"+"Marca: "+marca+"\nModelo: " +modelo);
    }

}

