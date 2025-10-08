/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bibliotecaylibros;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro>libros;              //atributo de la relacion composicion
    
    //contructor 

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    //metodo agregarLibro por relacion recibe los parametros para crear el item
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        libros.add(new Libro( isbn,  titulo,  anioPublicacion,  autor));
    }
    
    //metodo listar libros 
    public void listarLibros(){
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
        libro.mostrarInfo();
            
        }
    }
//buscarLibroPorIsbn(String isbn) devuelve la referencia al objeto libro buscadopor isbn
    
    public Libro buscarLibroPorIsbn(String isbn) {
    int i=0;
    Libro encontrado=null;
    while(i<libros.size()&&!this.libros.get(i).getIsbn().equals(isbn)){
        i++;
    }
    if(i<libros.size()){
        encontrado=this.libros.get(i);
    }
    return encontrado;
}
    //eliminarLibro(String isbn)
    public Libro eliminarLibro(String isbn){
    Libro eliminar=buscarLibroPorIsbn(isbn);
    if(eliminar!=null){
     this.libros.remove(eliminar);    
    }
    return eliminar;
    }
    
//obtenerobtenerCantidadLibros()
    public void obtenerCantidadLibros(){
        System.out.println("Total de Libros:"+libros.size());
    }

   //filtrarLibrosPorAnio(int anio)
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
    ArrayList<Libro>filtrados= new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion()==anio)
                filtrados.add(libro);
        }
            return filtrados;
        }
    
    public void mostrarAutoresDisponibles() {
        ArrayList<String> autores = new ArrayList<>();
        System.out.println("Autores disponibles:");
        for (Libro libro : libros) {
            String nombre = libro.getAutor().getNombre();
            if (!autores.contains(nombre)) {
                autores.add(nombre);
                System.out.println("- " + nombre);
        }
    }
}


}
