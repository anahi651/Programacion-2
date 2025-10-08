/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package universidadprofesorcurso;

public class Curso {
private String codigo;
private String nombre;
private Profesor profesores;
// constructor
        public Curso(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
        
//Asigna/cambia el profesor sincronizando ambos lados

        public void setProfesor(Profesor profesor) {
        // Si es el mismo profesor, no hacer nada
        if (this.profesores == profesor) {
            return;
        }

        // Si tenía un profesor anterior, eliminarse de él
        if (this.profesores != null) {
            this.profesores.eliminarCurso(this);
        }

        // Establecer nuevo profesor
        this.profesores = profesor;

        // Añadirse al nuevo profesor si no es nulo
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }

    public Profesor getProfesor() {
        return profesores;
    }
      
    //Muestra código, nombre y nombre del profesor (si tiene).
    public void mostrarInfo(){
        System.out.println("Curso"+nombre);
        System.out.println("Codigo:"+codigo);
        if(profesores!=null){
            System.out.println("Profesor: "+ profesores.getNombre());
        }else{
            System.out.println("Profesor sin asignar.");
        }
    }

}

