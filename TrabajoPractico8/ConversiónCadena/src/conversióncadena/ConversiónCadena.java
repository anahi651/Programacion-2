
package conversióncadena;

import java.util.Scanner;


public class ConversiónCadena {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();

        
            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido correctamente: " + numero);
        }

  
        catch (NumberFormatException ex) {
            System.out.println("Error: el texto ingresado no es un número entero válido.");
        }

        finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }
    }


