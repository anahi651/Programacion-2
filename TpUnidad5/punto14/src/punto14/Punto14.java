
package punto14;


public class Punto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Video de Viaje", "15");
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto1);
    }

}
