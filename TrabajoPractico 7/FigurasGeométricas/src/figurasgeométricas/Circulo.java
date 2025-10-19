/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package figurasgeométricas;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo(String nombre,double radio) {
        super(nombre);
        this.radio=radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

}

