/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajopractico3;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int combustibleNecesario = distancia * 2;
        if (combustibleNecesario > combustible) {
            System.out.println("No hay suficiente combustible para avanzar.");
        } else {
            combustible -= combustibleNecesario;
            System.out.println("La nave avanzo " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > 100) {
            combustible = 100;
            System.out.println("El tanque se ha llenado al maximo (100).");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + "  Combustible: " + combustible);
    }
}
