/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato); // crea un Render
        render.setProyecto(proyecto);        // establece la relación
        System.out.println("Exportando video: " + render);
    }

}

