
package punto8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos objeto contenido usuario
        Usuario usuarioNuevo= new Usuario("Juana Martinez", "MartinezJ@gmail.com");
        // Creamos objeto contenedor doumento que crea el objeto FirmaDigital
        Documento documento1 = new Documento("Contrato","contenido contrato","adf4589aaa568","14/09/2025",usuarioNuevo);
        //mostramos contrato con firma creada y usario agregado a firmaDigital
        System.out.println(documento1);
    }

}
