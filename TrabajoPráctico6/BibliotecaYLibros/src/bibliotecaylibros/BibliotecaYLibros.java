
package bibliotecaylibros;

import java.util.ArrayList;


public class BibliotecaYLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // se crea biblioteca
       Biblioteca biblioteca = new Biblioteca("Central");
    // Se crean autores  
       Autor autor1 = new Autor("01","Gabriel Garcia Marquez","Colombiana");
       Autor autor2 = new Autor("02","Jorge Luis Borges","Argentina");
       Autor autor3 = new Autor("A1", "Antoine de Saint-Exupery", "Francesa");
    //Agregan libros a la biblioteca asociado a autores
      biblioteca.agregarLibro("147896", "El amor en los tiempos de colera", 1985, autor1);
      biblioteca.agregarLibro("248967", "El Aleph", 1949 , autor2);
      biblioteca.agregarLibro("257898", "El principito", 1943, autor3);
      biblioteca.agregarLibro("267895", "Cien años de Soledad", 1967,autor1 );
      biblioteca.agregarLibro("274589","Ficciones",1944,autor2);
      
      // Listamos todos los libros con su información y la del autor.
      biblioteca.listarLibros();
      
      //Buscamos un libro por su ISBN y mostrar su información.
      
      Libro buscado=biblioteca.buscarLibroPorIsbn("147896");
        buscado.mostrarInfo();
        
        //Filtrar y mostrar los libros publicados en un año específico.
        
        ArrayList<Libro> lista = biblioteca.filtrarLibrosPorAnio(1985);
        for (Libro libro : lista) {
            libro.mostrarInfo();
        }
       
      // Eliminar un libro por su ISBN y listar los libros restantes.
      
      biblioteca.eliminarLibro("274589");
      biblioteca.listarLibros();
      
      // Mostrar la cantidad total de libros en la biblioteca.
      biblioteca.obtenerCantidadLibros();
      // Listar todos los autores de los libros disponibles en la biblioteca.
      biblioteca.mostrarAutoresDisponibles();
      
      
      
       
       


        
    }

}
