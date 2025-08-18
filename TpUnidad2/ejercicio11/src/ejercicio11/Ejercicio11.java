
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    static double descuento ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double producto;
        
        System.out.print("Ingrese el precio del producto: ");
        producto= Double.parseDouble(input.nextLine());
        
         calcularDescuentoEspecial(producto);
      
    
    }
     static void calcularDescuentoEspecial(double precio){
         descuento=0.10;
         double descuentoAplicado=precio*descuento;
         double precioFinal=precio-descuentoAplicado;
         System.out.println("El descuento especial aplicado es: "+descuentoAplicado);
         System.out.println("El precio final con descuento es:"+precioFinal);
                 
     }
}
