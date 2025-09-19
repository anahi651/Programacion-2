
package punto1;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //instancia titular
        Titular titular = new Titular("Maria Gutierrez", "36589696");
        //instancia Pasaporte creando Foto
        Pasaporte pasaporte = new Pasaporte("1012568", "12/09/2025", "FotoTitular1.jpg", "jpg");
        
        // establece la relación bidireccional
        pasaporte.setTitular(titular);

        System.out.println("Titular del pasaporte: " + titular);
        System.out.println("Pasaporte del titular: " + pasaporte);
        
    }

}
