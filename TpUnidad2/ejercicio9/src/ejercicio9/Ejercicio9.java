
package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double producto,peso,costoEnvio, total;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        producto=Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso=Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona= input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: "+ costoEnvio);
        
        total = calcularTotalCompra(producto, costoEnvio);
        System.out.println("El total a pagar es: "+ total);
                
    }
        static double calcularTotalCompra(double precioProducto, double costoEnvio){
            double total;
            total=precioProducto+costoEnvio;
            return total;
        }
    
    
    
    
    
            
        static double calcularCostoEnvio(double peso, String zona){
             double costo = 0; 
            if (zona.equalsIgnoreCase("Nacional")) {
                costo=peso*5;
            }else if(zona.equalsIgnoreCase("Internacional")){
                costo=peso*10;
            }
            return costo;
        }
    
    
    
    
    
   
    }
    
    

