
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
          int edad;
          
         System.out.print("Ingrese su edad: ");
         edad=Integer.parseInt(input.nextLine());
        
         if ( edad < 12) {
             System.out.println("Eres un Niño.");
             
        }else if( edad<=17){
             System.out.println("Eres un Adolescente.");  
             
        }else if(edad <=59){
             System.out.println("Eres un Adulto.");  
                
        }else{
             System.out.println("Eres un Adulto mayor");
        }
        
        
    }

}
