
package punto11;


public class Punto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("De musica ligera");
        Artista artista1 = new Artista("Soda Estereo", "rock");
        cancion1.setArtista(artista1);//establecer relacion
        
        Reproductor reproductor =new Reproductor();
        
        reproductor.reproducir(cancion1);
        
      
       
        
    }

}
