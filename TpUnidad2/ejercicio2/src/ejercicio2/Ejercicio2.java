
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numeroUno,numeroDos,numeroTres;
        
      
      
        System.out.print("Ingrese el primer número: ");
        numeroUno=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        numeroDos=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer número: ");
        numeroTres=Integer.parseInt(input.nextLine());
        
          int mayor=numeroUno;
          
          if (numeroDos>mayor) {
              mayor = numeroDos;
            
        } if(numeroTres>mayor) {
            mayor=numeroTres;
        }
        System.out.println("El mayor es: " + mayor);
    }

}
