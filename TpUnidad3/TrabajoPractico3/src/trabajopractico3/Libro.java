/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabajopractico3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion <0 || anioPublicacion>2025){
            System.out.println("Ingrese un año valido");
        }else{
        this.anioPublicacion = anioPublicacion;
    }
    
    }

}

