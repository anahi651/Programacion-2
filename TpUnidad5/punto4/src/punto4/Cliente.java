/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto4;

public class Cliente {
private String nombre;
private String dni;
private TarjetaDeCredito tarjetaDeCredito;//referencia relacion bidireccional 

// constructor 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
// Evita un bucle infinito y asegura la consistencia de la relacion bidireccional
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente()!= this){
            tarjetaDeCredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }

}

