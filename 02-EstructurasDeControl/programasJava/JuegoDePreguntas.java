/*
 *En un juego de preguntas a las que se responde sí o no gana quien responde correctamente las 3 preguntas. Si se responde mal a cualquiera de ellas, ya no se pregunta la siguiente y termina el juego.
 *Las 3 preguntas son (Ejemplos):
 *   1. ¿Colón descubrió América?
 *   2. ¿La independencia de México fue en el año 1810?
 *   3. ¿"The doors" fue un grupo de rock americano?
 */

package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class JuegoDePreguntas {
    public static void main(String[] args) {
        // Declaración de variables
        int q1, q2, q3, resp = 1;

        // Ciclo para reiniciar el juego
        do {
            // Bienvenida
            JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de preguntas!\nEste juego consta de 3 preguntas, si contestas\ncorrectamente las 3 preguntas ganas el juego,\nsi pierdes en una de ellas, el juego termina y\nse cierra.\n¡Comencemos!", "Trivia", JOptionPane.INFORMATION_MESSAGE);

            // Entradas de datos
            // Pregunta 1
            q1 = JOptionPane.showConfirmDialog(null, "¿Es Australia más ancha que la luna?", "PREGUNTA 1", JOptionPane.YES_NO_OPTION);
            if (q1 == 0) {      // Respuesta correcta
                JOptionPane.showMessageDialog(null, "¡Así es!\nAustralia es más ancha que la Luna, ya que el diámetro\nde Australia de este a oeste es de casi 4,000 km, mientras\nque el diámetro de la Luna es de aproximadamente 3,474 km.", "¡CORRECTO!", JOptionPane.INFORMATION_MESSAGE);


                // Pregunta 2
                q2 = JOptionPane.showConfirmDialog(null, "En una cámara de vacío hay un vaso lleno de\nagua, si se enciende la cámara, entonces\n¿El agua va a hervir?", "PREGUNTA 2", JOptionPane.YES_NO_OPTION);
                if (q2 == 0) {      // Respuesta correcta
                    JOptionPane.showMessageDialog(null, "¡Así es!\nAl encender la cámara de vacío, se elimina el\naire del entorno, lo que reduce drásticamente la\npresión atmosférica sobre la superficie del agua,\npor lo que esta comienza a hervir.", "¡CORRECTO!", JOptionPane.INFORMATION_MESSAGE);


                    //Pregunta 3
                    q3 = JOptionPane.showConfirmDialog(null, "¿La Gran Muralla China es visible desde la Luna a simple vista?", "PREGUNTA 3", JOptionPane.YES_NO_OPTION);
                    if (q3 == 0) {      // Respuesta incorrecta
                        JOptionPane.showMessageDialog(null, "¡No es así! La respuesta era \"NO\"", "¡INCORRECTO!", JOptionPane.ERROR_MESSAGE);
                    } else {        // Respuesta correcta
                        JOptionPane.showMessageDialog(null, "¡Así es!\nEs un mito popular que ha sido desmentido por\nastronautas y científicos, ya que la muralla es\ndemasiado estrecha y se mimetiza con su entorno,\naunque podría ser discernible con equipos ópticos\npotentes desde la órbita terrestre baja.", "¡CORRECTO!", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "🎉ㅤ¡FELICIDADES, HAS GANADO EL JUEGO!ㅤ🎉", "Trivia", JOptionPane.INFORMATION_MESSAGE);

                        resp = JOptionPane.showConfirmDialog(null, "¿Deseas volver a jugar?", "Trivia", JOptionPane.YES_NO_OPTION);
                    }       // Pregunta 3


                } else {        // Respuesta incorrecta
                    JOptionPane.showMessageDialog(null, "¡No es así! La respuesta era \"SÍ\"", "¡INCORRECTO!", JOptionPane.ERROR_MESSAGE);
                }           // Pregunta 2


            } else {        // Respuesta incorrecta
                JOptionPane.showMessageDialog(null, "¡No es así! La respuesta era \"SÍ\"", "¡INCORRECTO!", JOptionPane.ERROR_MESSAGE);
            }        // Pregunta 1


        } while (resp == 0);
    }
}
