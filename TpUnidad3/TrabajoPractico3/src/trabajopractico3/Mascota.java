package trabajopractico3;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String mostrarInfo() {
        return "Nombre: "+ nombre + "\n"+"Especie: "+ especie + "\n"+"Edad: "+edad ;
    }
    
    public void cumplirAnios() {
    edad++;
    }
}

