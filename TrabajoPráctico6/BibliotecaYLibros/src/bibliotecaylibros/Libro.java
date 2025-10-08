/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bibliotecaylibros;

public class Libro {
private String isbn;
private String titulo;
private int anioPublicacion;
private Autor autor;

//constructor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
//mostrarInfo() → Muestra título, ISBN, año y autor.
    
        public void mostrarInfo(){
        System.out.println("Informacion del Libro:\n isbn:"+isbn+"\n Titulo: "+titulo+"\n Año publicación:"+anioPublicacion);
        System.out.println("Autor:");
        autor.mostrarInfo();
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
        
 


    
    
}

