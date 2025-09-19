
package punto5;


public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de objeto contedor computadora la placa madre se crea dentro
        Computadora computadora1= new Computadora("hp","2365-9869-633","15fc003","111111");
        //mostramos la relacion 
        System.out.println(computadora1);
        //creamos el Propietario
        Propietario propietarioAnalia =new Propietario("Analia Benitez","39685789");
        // Establecer la relación bidireccional
        propietarioAnalia.setComputadora(computadora1);
        //mostramos propietario con toString y vemos relacion con computadora 
        System.out.println(propietarioAnalia);
    }

}
