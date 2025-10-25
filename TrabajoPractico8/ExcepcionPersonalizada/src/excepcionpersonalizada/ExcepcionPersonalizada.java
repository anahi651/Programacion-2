
package excepcionpersonalizada;


 
public class ExcepcionPersonalizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            validarEdad(130);
        } 
        catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
     public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no es valida. Debe estar entre 0 y 120 años.");
        } else {
            System.out.println("Edad válida: " + edad);
        }
     }
}
