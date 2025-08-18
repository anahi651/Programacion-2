
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese su el año para verificar si es bisiesto: ");
        anio=Integer.parseInt(input.nextLine());
        
        if ( anio>0) {
          if ((anio%4==0 && anio%100!=0)||(anio%400==0)){
           System.out.println("El año "+ anio+ " es bisiesto.");
        } else {
            System.out.println("El año "+ anio+ " no es bisiesto.");
        }
        }else{
            System.out.println("Error: debe ingresar un número entero válido.");
        }

    }

}
