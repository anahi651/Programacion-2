
package punto12;


public class Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Impuesto impuesto = new Impuesto(5000);
        Contribuyente contribuyente1= new Contribuyente("Marta Benitez","27-356987582-3");
        impuesto.setContribuyente(contribuyente1);//establecer la relacion
        
        Calculadora calculadora= new Calculadora();
        
        calculadora.calcular(impuesto);
        
        
    }

}
