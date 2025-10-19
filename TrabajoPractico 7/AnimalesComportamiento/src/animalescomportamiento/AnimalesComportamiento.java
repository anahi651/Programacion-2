
package animalescomportamiento;

import java.util.ArrayList;


public class AnimalesComportamiento {

    public static void main(String[] args) {
       Vaca v =new Vaca();
       Gato g =new Gato();
       Perro p= new Perro();
       
       ArrayList<Animal>animales=new ArrayList<>();
       
       animales.add(p);
       animales.add(g);
       animales.add(v);
       
       for(Animal animal: animales){
          animal.hacerSonido();
       }
       
    }

}
