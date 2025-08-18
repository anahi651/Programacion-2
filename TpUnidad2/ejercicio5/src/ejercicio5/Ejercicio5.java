
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, sumatoria;
        sumatoria=0;
        
        System.out.println("Ingrese un número (0 para terminar):");
        numero= Integer.parseInt(input.nextLine());  
        
        while (numero!=0) {            
       
            if (numero%2==0) {
                sumatoria+=numero;
            }
        System.out.println("Ingrese un número (0 para terminar):");
        numero= Integer.parseInt(input.nextLine()); 
        }
        System.out.println("La suma de los números pares es: "+ sumatoria);
    }

}
