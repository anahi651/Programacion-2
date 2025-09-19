/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package punto13;

public class GeneradorQR {
    

    // Dependencia de creación
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario); // asociación establecida por setter
        System.out.println("Codigo QR generado: " + codigo);
    }

}

