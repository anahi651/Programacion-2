/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package figurasgeométricas;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double altura,double base) {
        super(nombre);
        this.altura=altura;
        this.base= base;
    }

    @Override
    public double calcularArea() {
      return base*altura;
    }

}

