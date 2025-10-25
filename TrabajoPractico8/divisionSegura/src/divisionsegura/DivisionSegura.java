
package divisionsegura;

import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numeroUno, numeroDos;
        int resultado; 

        try {
            System.out.print("Ingrese el primer número: ");
            numeroUno = sc.nextInt();

            System.out.print("Ingrese el segundo número (divisor): ");
            numeroDos = sc.nextInt();

         
            resultado =  numeroUno / numeroDos;

            System.out.println("Resultado: " + resultado);
        }
        
        catch (ArithmeticException ex) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }
}


