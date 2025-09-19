
package punto10;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos el objeto contenedor cuentaBancaria proporcionando los datos necesarios para crear internamente la clave
        CuentaBancaria cuenta1 = new CuentaBancaria("235869856912578958888",100000.0,"cfg256","16/09/2025");
        
        System.out.println(cuenta1);//muestra cuenta bancaria con calve aun sin titular
        
        
        //Creamos titular
        Titular titular1= new Titular("Ana Martinez","36589741");
        
        // Establecer la relación bidireccional
        cuenta1.setTitular(titular1);
        
        //Mostramos la relacion desde ambos lados 
         System.out.println(cuenta1);//muestra cuenta bancaria con clave y titular
         System.out.println("Titular:"+titular1+"Cuenta Bancaria asociada"+titular1.getCuentaBancaria());
    }

}
