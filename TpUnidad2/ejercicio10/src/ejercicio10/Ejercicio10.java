
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stock,vendida,recibida, nuevoStock;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stock=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        vendida=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        recibida=Integer.parseInt(input.nextLine());
        
        nuevoStock=actualizarStock(stock,vendida,recibida);
        
        System.out.println("El nuevo stock del producto es: "+ nuevoStock);
        
        
    }
       static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
           
           return stockActual - cantidadVendida + cantidadRecibida;
           
       }
}
