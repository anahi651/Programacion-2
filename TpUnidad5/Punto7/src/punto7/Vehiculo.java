/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto7;

public class Vehiculo {
private String patente;
private String modelo;
private Motor motor;// Agregacion 1:1
private Conductor conductor;// Atributo por relacion bidireccional 

//constructor con atributo a clase motor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
// set para relacion bidireccional con validacion para evitar bucle 
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }







}

