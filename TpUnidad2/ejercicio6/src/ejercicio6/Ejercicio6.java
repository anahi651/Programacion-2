
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, positivos,negativos,cero;
        positivos=0;
        negativos=0;
        cero=0;        
       
        
        for (int i = 1; i <= 10; i++) {
          System.out.print("Ingrese el número "+i+": ");
          num = Integer.parseInt(input.nextLine());
            if (num>0) {
              positivos++;
         
            }else if(num<0){
                negativos++;
            }else{
                cero++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos:"+positivos);
        System.out.println("Negativos:"+negativos);
        System.out.println("Ceros:"+cero);
         
    }

}
