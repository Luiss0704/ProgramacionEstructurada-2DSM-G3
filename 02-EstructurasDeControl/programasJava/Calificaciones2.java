package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class Calificaciones2 {
    public static void main(String[] args) {
        // Declaración de variables
        double c1, c2, c3, prom;
        final int NUM_CALIF = 3;

        // Entrada de datos
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la primera calificación:", "Cálculo de promedio", JOptionPane.QUESTION_MESSAGE));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la segunda calificación:", "Cálculo de promedio", JOptionPane.QUESTION_MESSAGE));
        c3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la tercera calificación:", "Cálculo de promedio", JOptionPane.QUESTION_MESSAGE));

        // Proceso: Cálculo del promedio
        prom = (c1 + c2 + c3) / NUM_CALIF;

        // Comparación con estructura selectiva doble
        if (prom >= 7) {
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nAPROBADO", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.2f", prom) + "\nREPROBADO", "Resultado", JOptionPane.ERROR_MESSAGE);
        }       // Cierre If-else

    }       // Cierre main
}       // Cierre clase