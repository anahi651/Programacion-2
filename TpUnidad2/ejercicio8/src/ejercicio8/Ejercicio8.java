
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double precioBase,impuesto,descuento, precio;
       
       
       System.out.print("Ingrese el precio base del producto: ");    
       precioBase=Double.parseDouble(input.nextLine());
       
       System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");    
       impuesto=Double.parseDouble(input.nextLine());
       
       System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");    
       descuento=Double.parseDouble(input.nextLine());
       
       impuesto = impuesto / 100;
       descuento = descuento / 100;
       
       precio=precioFinal(precioBase,impuesto,descuento);
       
       System.out.println("El precio final del producto es :"+ precio); 
       

    }//cierra el main 
    static double precioFinal(double precio, double impuesto,double descuento){
        return precio+(precio*impuesto)-(precio*descuento);
    }
    
    
    }
}//cierre de clase 
