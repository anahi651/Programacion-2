
package e.commerce;

public class ECommerce {

    
    public static void main(String[] args) {
        Producto yerba = new Producto("Yerba",5000.50);
        Producto azucar = new Producto("Azucar",2500.50);
        Producto cafe= new Producto("cafe",10000);
        Cliente c1 =new Cliente("Juan Perez");
        Pedido pedido01= new Pedido("Iniciado",c1);
        
        pedido01.agregarProducto(cafe);
        pedido01.agregarProducto(azucar);
        
        double monto=pedido01.calcularTotal();
       
        TarjetaCredito visa =new TarjetaCredito();
        double montoFinal=visa.aplicarDescuento(monto, 10);
        visa.procesarPago(montoFinal);
        
        pedido01.cambiarEstado("Procesado, pago exitoso");
        c1.cambiarEstado("Su pedido ya fue procesado");
        
        

        
        
        
    }

}
