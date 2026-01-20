package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaración de variables
        double c1 = 11.0, c2 = 0.0, c3 = 11.0, prom;

        // Solicitar calificaciones
        // Ciclo para validar la primera entrada de datos
        while (c1 < 0.0 || c1 > 10.0) {
            c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera calificación:", "Calificación 1", JOptionPane.QUESTION_MESSAGE));
            if(c1 < 0  || c1 > 10) {        // If para mostrar un error y repetir el ciclo
                JOptionPane.showMessageDialog(null, "¡Dato no válido!", "ERROR", JOptionPane.ERROR_MESSAGE);
                c1 = 11.0;
            }
        }

        // Ciclo para validar la segunda entrada de datos
        while (c2 < 0.0 || c2 > 10.0) {
            c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda calificación:", "Calificación 2", JOptionPane.QUESTION_MESSAGE));
            if(c2 < 0  || c2 > 10) {        // If para mostrar un error y repetir el ciclo
                JOptionPane.showMessageDialog(null, "¡Dato no válido!", "ERROR", JOptionPane.ERROR_MESSAGE);
                c2 = 11.0;
            }
        }

        // Ciclo para validar la tercera entrada de datos
        while (c3 < 0.0 || c3 > 10.0) {
            c3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera calificación:", "Calificación 3", JOptionPane.QUESTION_MESSAGE));
            if(c3 < 0  || c3 > 10) {        // If para mostrar un error y repetir el ciclo
                JOptionPane.showMessageDialog(null, "¡Dato no válido!", "ERROR", JOptionPane.ERROR_MESSAGE);
                c3 = 11.0;
            }
        }

        // Calcular promedio
        prom = (c1 + c2 + c3) / 3;

        // Mostrar el promedio y determinar si el alumno aprueba o reprueba
        if (prom >= 7) {     // Inicio del if
           JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nAlumno APROBADO", "APROBADO", JOptionPane.INFORMATION_MESSAGE);
        } else {       // Inicio del else
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nAlumno REPROBADO", "REPROBADO", JOptionPane.ERROR_MESSAGE);
        }       // Fin de la estructura de selección
    }
}
