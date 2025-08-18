
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double precioProducto, precioFinal;
        char categoria;
        int A,B,C;
        A=10;
        B=15;
        C=20;
        int descuento = 0;
        
         System.out.print("Ingrese el precio del producto: ");
         precioProducto= Double.parseDouble(input.nextLine());
         
         System.out.print("Ingrese la categoría del producto (A, B o C):");
         categoria = input.nextLine().charAt(0);
         
         switch (categoria) {
            case 'A':
            case 'a': 
            descuento=A; 
            break;
            
            case'B':
            case'b':
            descuento=B;
            break;
            
            case'C':
            case'c':
            descuento=C;
            break;
            
            default:
            System.out.println("Categoría no válida.");
        }
            precioFinal = precioProducto - (precioProducto * descuento / 100.0);
            System.out.println("Descuento aplicado: " + descuento + "%");
            System.out.println("Precio final: " + precioFinal);
         
    }

}
