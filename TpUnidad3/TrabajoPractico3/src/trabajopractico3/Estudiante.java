/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajopractico3;

public class Estudiante {
 private String nombre;
 private String apellido;
 private double calificacion;
 private String curso;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String mostrarInfo() {
        return "Nombre: "+ nombre + "\n"+"Apellido: "+ apellido + "\n"+"Calificacion: "+calificacion +"\n"+"Curso: "+curso;
    }
    public void SubirCalificacion (double puntos){
        double calificacionNueva;
        calificacionNueva= calificacion+puntos;
        if(calificacionNueva>10){
            calificacionNueva=10;
        }
        calificacion = calificacionNueva;
    }
    public void bajarCalificacion(double puntos){
        double calificacionNueva;
        calificacionNueva= calificacion-puntos;
        if(calificacionNueva<0){
             calificacionNueva=0;
    }
    
        calificacion = calificacionNueva;
    }
}

