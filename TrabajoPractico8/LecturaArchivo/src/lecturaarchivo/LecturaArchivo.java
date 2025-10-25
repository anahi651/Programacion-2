
package lecturaarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        File archivo = new File("C:\\Users\\anahi\\Documentos\\archivo_prueba.txt");
        
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            System.out.println(" Contenido del archivo:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("️ Error: el archivo no existe o la ruta es incorrecta.");
        } 
        catch (IOException e) {
            System.out.println("️ Error al leer el archivo: " + e.getMessage());
        }
    }
}


