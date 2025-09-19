/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;// composicion 1:1
    
    //constructor crea objeto contenido firmaDigital

    public Documento(String titulo, String contenido, String codigoHash, String fecha,Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital= new FirmaDigital(codigoHash,fecha, usuario);
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }


    
    

}

