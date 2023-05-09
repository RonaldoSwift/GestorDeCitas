
package gestordecitas;

import Entidades.Cita;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.List;

public class GestorDeCitas {

    public List<Cita> citasEnElSistema;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null); //Centra el formulario
        framePrincipal.setVisible(true);
    }
    
}
