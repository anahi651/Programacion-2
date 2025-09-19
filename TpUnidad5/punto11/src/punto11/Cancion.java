/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto11;

public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional
   //constructor

    public Cancion(String titulo) {
        this.titulo = titulo;
       
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

        
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }

    
    
    
    
    
}

