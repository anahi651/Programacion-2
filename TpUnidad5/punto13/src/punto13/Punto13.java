
package punto13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alejandra Delgado", "aDelgado@gmail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("ABC123XYZ", usuario1);
        
    }

}
