
package ejercicio12;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        
    double precios[]={199.99,299.5,149.75,399.0,89.99};
    
        System.out.println("Precios originales:");
        
        mostrarPrecios(precios);
         
        precios[2]=129.99;
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
    }
    
         public static void mostrarPrecios(double[]precios){
            for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("Precio: $" + precio);
        }   
         }
    
        
    }
    

