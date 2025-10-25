/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package e.commerce;

public class TarjetaCredito implements PagoConDescuento {
    

      @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double descuento= monto*(porcentaje/100);
        return monto-descuento;
    }
 
    
   
  @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito");
        System.out.println("Monto final cobrado: $" + monto);
        System.out.println("Pago completado con exito");
    }



   

  

}

