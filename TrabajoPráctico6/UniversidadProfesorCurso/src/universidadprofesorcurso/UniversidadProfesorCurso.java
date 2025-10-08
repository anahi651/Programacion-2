
package universidadprofesorcurso;


public class UniversidadProfesorCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Universidad univ = new Universidad("UTN");
        
        Profesor prof1 = new Profesor("P001", "Laura Gómez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Carlos Ruiz", "Programación");
        Profesor prof3 = new Profesor("P003", "Sofía Díaz", "Historia");
        
        Curso curso1 = new Curso("C101", "Álgebra I");
        Curso curso2 = new Curso("C102", "Programación I");
        Curso curso3 = new Curso("C103", "Historia Argentina");
        Curso curso4 = new Curso("C104", "Estructura de Datos");
        Curso curso5 = new Curso("C105", "Matemática");
        
        //Agregar profesores y cursos a la universidad.
        univ.agregarProfesor(prof1);
        univ.agregarProfesor(prof2);
        univ.agregarProfesor(prof3);
        
        univ.agregarCurso(curso1);
        univ.agregarCurso(curso2);
        univ.agregarCurso(curso3);
        univ.agregarCurso(curso4);
        univ.agregarCurso(curso5);
        
        //3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        univ.asignarProfesorACurso("C101", "P001");
        univ.asignarProfesorACurso("C102", "P002");
        univ.asignarProfesorACurso("C103", "P003");
        univ.asignarProfesorACurso("C104", "P002");
        univ.asignarProfesorACurso("C105", "P001");
        
        //4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("-------Cursos con su profesor--------");
        univ.listarCursos();
        System.out.println("--------Profesor con sus cursos--------");
        univ.listarProfesores();
        
        
        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
         System.out.println("-------Cambio de profesor--------");
         univ.asignarProfesorACurso("C101", "P002");
         univ.listarProfesores();
         
         //6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
         System.out.println("----Eliminar curso-----");
         univ.eliminarCurso("C103");
         Profesor busqueda=univ.buscarProfesorPorId("P003");
         System.out.println(busqueda);
         //7. Remover un profesor 
         System.out.println("---Remover profesor----");
         univ.eliminarProfesor("P001");
         univ.listarProfesores();
         
         //Mostrar un reporte: cantidad de cursos por profesor.
          System.out.println("---- REPORTE: Cantidad de cursos por profesor ----");
           for (Profesor p : univ.getProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }

         
         
        
    }

}
