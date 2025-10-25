
package usotrywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UsoTryWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String ruta = "C:\\Users\\anahi\\OneDrive\\Documentos\\archivo_preba.txt"; 

        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } 
        catch (IOException e) {
            System.out.println(" Error al leer el archivo: " + e.getMessage());
        }
    }

}
