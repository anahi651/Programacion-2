
package e.commerce;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface PagoConDescuento extends Pago {
    
   double aplicarDescuento(double monto, double porcentaje);


   
   
}
