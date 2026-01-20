package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        // Declaración de variables
        double c1, c2, c3, prom;

        // Solicitar calificaciones
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera calificación:", "Calificación 1", JOptionPane.QUESTION_MESSAGE));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda calificación:", "Calificación 2", JOptionPane.QUESTION_MESSAGE));
        c3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera calificación:", "Calificación 3", JOptionPane.QUESTION_MESSAGE));

        // Calcular promedio
        prom = (c1 + c2 + c3) / 3;

        // Mostrar el promedio y determinar si el alumno aprueba o reprueba
        if (prom > 7) {     // Inicio del if
           JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nAlumno APROBADO", "APROBADO", JOptionPane.INFORMATION_MESSAGE);
        } else {       // Inicio del else
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nAlumno REPROBADO", "REPROBADO", JOptionPane.ERROR_MESSAGE);
        }       // Fin de la estructura de selección
    }
}
