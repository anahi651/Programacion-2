
package punto3;


public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //creamos autor
         Autor autor1= new Autor("Gabriel Garcia Marquez","Colombiano");
         //creamos el objeto contenido Editorial
         Editorial editorial1= new Editorial("Planeta","Corrientes 1350");
         //creamos libro
         Libro libro1 =new Libro("Cronica de una muerte anunciada","12568-5898-522",editorial1);
         //Establecer la relación unidireccional con setter 
         libro1.setAutor(autor1);
        //Mostramos relacion
        System.out.println(libro1);
    }

}
