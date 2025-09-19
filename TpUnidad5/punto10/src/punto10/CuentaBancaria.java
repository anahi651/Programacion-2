/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // composicion
    private Titular titular;// asociacion bidireccional
    
    //constructor 

    public CuentaBancaria(String cbu, double saldo,String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad= new ClaveSeguridad(codigo, ultimaModificacion);//se crea internamente 
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular!= null && titular.getCuentaBancaria()!= this){
            titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + '}';
    }
    
    

}

