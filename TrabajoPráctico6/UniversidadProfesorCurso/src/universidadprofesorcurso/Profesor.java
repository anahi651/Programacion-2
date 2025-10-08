/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package universidadprofesorcurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
     private List<Curso> cursos = new ArrayList<>();
//constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    // Mantener coherencia bidireccional
    public void agregarCurso(Curso c) {
        if (c == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
//Quita el curso y sincroniza el lado del curso
    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    //Muestra códigos y nombres.
    public void listarCursos(){
        if(cursos.isEmpty()){
            System.out.println("El profesor no tiene cursos asignados");
        }else{
            System.out.println("Cursos:"+ nombre+":");
            for (Curso c : cursos) {
                System.out.println("   - " + c.getCodigo() + ": " + c.getNombre());   
            }
        }
    }
    
    //Imprime datos del profesor y cantidad de cursos.
    public void mostrarInfo(){
        System.out.println("Profesor: "+nombre);
        System.out.println("Id: "+id);
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Cantidad de cursos: "+cursos.size());
         if (!cursos.isEmpty()) {
        System.out.println("Cursos que dicta:");
        for (Curso c : cursos) {
            System.out.println("  - " + c.getNombre() + " (" + c.getCodigo() + ")");
        }
        } else {
        System.out.println("Este profesor no tiene cursos asignados.");
        }
        }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }
    
}



