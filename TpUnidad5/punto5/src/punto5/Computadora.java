/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto5;

public class Computadora {
private String marca;
private String numeroSerie;
private PlacaMadre placaMadre;//composicion
private Propietario propietario;// bidireccional 




//constructor que crea placa madre

    public Computadora(String marca, String numeroSerie,String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre= new PlacaMadre(modelo, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario!= null && propietario.getComputadora()!= this){
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + '}';
    }

}

