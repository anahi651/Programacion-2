
package punto2;


public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //creamos una instancia de bateria "objeto contenido"
        
        Bateria bateria1= new Bateria("Asj",70);
        
        //Creamos instancia de celular "Objeto contenedor"
        
        Celular celular1= new Celular(758965,"Sansung","S10",bateria1);
        
        System.out.println(celular1);
        
        //creamos instancia de Usuario
        Usuario usuario1= new Usuario("Ana","3578988");
        usuario1.setCelular(celular1);//  setter necesario para relacionar
        
        //mostramos usuario
        System.out.println(usuario1);
    }

}
