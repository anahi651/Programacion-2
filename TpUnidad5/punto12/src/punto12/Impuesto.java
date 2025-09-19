/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;//asociacion unidireccional 
    
    //constructor 

    public Impuesto(double monto) {
        this.monto = monto;
    }


    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
    

}

