
package trabajopractico3;


public class TrabajoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.
        Estudiante a= new Estudiante();
       a.setNombre("Maria");
       a.setApellido("Gutierrez");
       a.setCurso("Estadistica");
       a.setCalificacion(6);
       System.out.println(a.mostrarInfo());
       a.SubirCalificacion(2);
       System.out.println("Aumento de calificacion:" + a.getCalificacion());
       a.bajarCalificacion(1);
       System.out.println("Disminucion de calificacion:"+a.getCalificacion());
       
        
        System.out.println("Registro Mascotas");
     
        
        Mascota uno =new Mascota();
        uno.setNombre("Fido");
        uno.setEdad(2);
        uno.setEspecie("Perro");
        System.out.println(uno.mostrarInfo());
        uno.cumplirAnios();
        System.out.println( "Edad: "+uno.getEdad());
    
       System.out.println("Encapsulamiento con la Clase Libro");
       Libro b =new Libro();
       b.setTitulo("Rayuela");
       b.setAutor("Julio Cortazar");
       b.setAnioPublicacion(1963);
       System.out.println("Titulo:"+b.getTitulo()+"\n"+"Autor:" + b.getAutor()+"\n"+"Año:"+b.getAnioPublicacion());
       b.setAnioPublicacion(2028);
       System.out.println("Titulo:"+b.getTitulo()+"\n"+"Autor:" + b.getAutor()+"\n"+"Año:"+b.getAnioPublicacion());
       
       
       
        System.out.println("Gestion de Gallinas en Granja Digital");
        Gallina ax = new Gallina();
        Gallina bx = new Gallina();
        
        ax.setIdGallina(1);
        bx.setIdGallina(2);
        
        ax.setEdad(1);
        bx.setEdad(2);
        
        ax.setHuevosPuestos(300);
        bx.setHuevosPuestos(320);
        // Estado inicial
        ax.mostrarEstado();
        bx.mostrarEstado();
        // Ponen huevos
        ax.ponerHuevo();
        bx.ponerHuevo();
        
        ax.mostrarEstado();
        bx.mostrarEstado();
        // Envejecen
        ax.envejecer();
        bx.envejecer();
        
        ax.mostrarEstado();
        bx.mostrarEstado();
        
        System.out.println("Simulacion de Nave Espacial");
        
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Apolo");
        nave.setCombustible(50);
        
        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(30);
        nave.recargarCombustible(50);
        nave.avanzar(30);
       
    }
   
    
    

}
