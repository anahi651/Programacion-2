/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto1;

public class Pasaporte {
        private String numero;
    private String fechaEmision;
    private Foto foto;//Atrbuto de tipo objeto relacion composicion 
    private Titular titular;//Atributo de tipo objeto Relacion bidireccional 
    
    
// constructor que crea internamente la instancia de foto relacion composicion
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato);
    }

    
    //set con validación para relación bidireccional 
    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular!= null && titular.getPasaporte()!= this){
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }


}

