/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package universidadprofesorcurso;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    
    
    //constructor instancia la coleccion

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
  
    //metodo agrega profesor
    
    public void agregarProfesor(Profesor p){
        if (!profesores.contains(p)) {
            this.profesores.add(p);
        }
        
    }
    
    //metodo agregar curso
    public void agregarCurso(Curso c){
        if (!cursos.contains(c)) {
        this.cursos.add(c);
        }  
    }
    
    public Profesor buscarProfesorPorId(String id) {
    int i=0;
    Profesor encontrado=null;
    while(i<profesores.size()&&!this.profesores.get(i).getId().equals(id)){
        i++;
    }
    if(i<profesores.size()){
        encontrado=this.profesores.get(i);
    }
    return encontrado;
}

    
    public Curso buscarCursoPorCodigo(String codigo) {
    int i=0;
    Curso encontrado=null;
    while(i<cursos.size()&&!this.cursos.get(i).getCodigo().equals(codigo)){
        i++;
    }
    if(i<cursos.size()){
        encontrado=this.cursos.get(i);
    }
    return encontrado;
}
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
       Curso curso=buscarCursoPorCodigo(codigoCurso);
       Profesor profesor=buscarProfesorPorId(idProfesor);
       if(curso!= null && profesor != null){
           curso.setProfesor(profesor);
       }
    }
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
    }
}

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
    }
}
    
    public Curso eliminarCurso(String codigo){
    Curso eliminar=buscarCursoPorCodigo( codigo);
    if(eliminar!=null && cursos.contains(eliminar)){
     cursos.remove(eliminar);
     if(eliminar.getProfesor()==eliminar.getProfesor()){
         eliminar.setProfesor(null);
     }
    }
    return eliminar;
    }

   public Profesor eliminarProfesor(String id){
    Profesor eliminar = buscarProfesorPorId(id);
    if (eliminar != null){
        // Romper relación con todos los cursos que dictaba
        for (Curso curso : new ArrayList<>(eliminar.getCursos())) {
            curso.setProfesor(null);
        }
        // Quitar el profesor de la universidad
        profesores.remove(eliminar);
    }
    return eliminar;
}

}

