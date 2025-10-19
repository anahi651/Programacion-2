
package figurasgeométricas;

import java.util.ArrayList;


public class FigurasGeométricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura>figuras=new ArrayList<>();
        figuras.add(new Circulo("Circulo 1",10));
        figuras.add(new Circulo("Circulo 2",15));
        figuras.add(new Circulo("Circulo 3",20));
        figuras.add(new Rectangulo("Rectangulo 1",10,15));
        figuras.add(new Rectangulo("Rectangulo 2",15,20));
        figuras.add(new Rectangulo("Rectangulo 3",18,26));
        
        for (Figura figura:figuras){
            System.out.println("Area "+figura.getNombre()+":"+figura.calcularArea());
        }
    }

}
