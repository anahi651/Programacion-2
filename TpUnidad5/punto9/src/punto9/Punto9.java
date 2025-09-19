
package punto9;


public class Punto9 {


    public static void main(String[] args) {
       //creamos los objetos de forma independiente 
       
       Profesional profesional1 = new Profesional("Julieta Aciar","Dermatologia");
       Paciente paciente1= new Paciente ("Juan Manuel Mansilla","Osde");
       CitaMedica cita1= new CitaMedica("17/09/2025","10:00 AM");
       
       //Establecemos las relaciones unidireccionales con seter 
       //cita->paciente
       cita1.setPaciente(paciente1);
       //cita->profesional
       cita1.setProfesional(profesional1);
       
       // se muestran relaciones con metodo tostring en citaMedica 
       
        System.out.println(cita1);
       
       
    }

}
