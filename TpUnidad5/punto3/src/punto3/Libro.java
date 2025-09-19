/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;//Asociacion 1:1 
    private Editorial editorial; //Agregación 1:1
    
   //constructor 

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }



    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + '}';
    }
    

}

