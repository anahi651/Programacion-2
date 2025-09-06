/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp4;

public class Empleado {
private int id;
private String nombre;
private String puesto;
private double salario;
private static int totalEmpleados;
private static int contador=100;

  //constructor recibe todos los atributos como parámetros.Incrementa totalEmpleados.

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados ++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

//constructor recibe solo nombre y puesto, asignando un id automático y un salario por defecto.Incrementa totalEmpleados.     
    public Empleado( String nombre, String puesto) {
        totalEmpleados ++;
        contador++;
        this.id=contador;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800000.0;
    }
//Metodo actualizarSalario recibe un porcentaje de aumento.
    
    public void actualizarSalario(int porcentaje){
        salario=(salario*porcentaje/100)+salario;
        
    }
    
//Metodo actualizarSalario recibe cantidad fija a aumentar.
    public void actualizarSalario(double cantidadFija){
        salario=salario+ cantidadFija;
    }
    
//Método toString():muestra id, nombre, puesto y salario
    
@Override
    public String toString(){
        return "id: "+ this.id + " Nombre: "+this.nombre+" Puesto: "+this.puesto+ " Salario: "+this.salario;
    }
    
 //Método estático mostrarTotalEmpleados():
    
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
//Métodos Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

}

