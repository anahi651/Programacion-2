/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto4;

public class TarjetaDeCredito {
    private String numero;
private String fechaVencimiento;
private Cliente cliente;//referencia relacion bidireccional 
private Banco banco; //referencia agregacion 

//constructor

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

// Evita un bucle infinito y asegura la consistencia de la relacion bidireccional

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente!= null && cliente.getTarjetaDeCredito()!= this){
            cliente.setTarjetaDeCredito(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +  ", banco=" + banco + '}';
    }

}

