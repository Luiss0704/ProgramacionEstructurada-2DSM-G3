/*
* Solicita el número de alumnos de un grupo y registra si cada uno
* está Presente (P) o Ausente (A). Muestra el porcentaje de asistencia.
* */

package mx.edu.uttt.ejerciciospaquetec;
import javax.swing.JOptionPane;

public class PackCPorcentajeAsistencia {
    public static void main(String[] args) {
        //  Declaración de variables
        int alumnos = 0, asistencia = 0, presentes = 0, ausentes = 0;
        double porcentajePresentes = 0.0, porcentajeAusentes = 0.0;
        //  Arreglo para los botones
        String[] opcionAsistencia = {"Presente", "Ausente"};

        //  Solicitar número de alumnos
        alumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de alumnos:", "Asistencia", JOptionPane.QUESTION_MESSAGE));

        //  Ciclo para ir recorriendo alumno por alumno
        for (int i = 1; i <= alumnos; i++) {
            //  Solicitar la asistencia del alumno (presente o ausente)
            asistencia = JOptionPane.showOptionDialog(null, "Alumno " + i, "Asistencia", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionAsistencia, opcionAsistencia[0]);
            //  Contar alumnos presentes y ausentes
            if (asistencia == 0) {
                presentes++;
            } else if (asistencia == 1) {
                ausentes++;
            }
        }

        //  Calcular porcentajes de alumnos presentes y de alumnos ausentes
        porcentajePresentes = ((double) presentes / alumnos) * 100;
        porcentajeAusentes = ((double) ausentes / alumnos) * 100;

        //  Mostrar resultados
        JOptionPane.showMessageDialog(null, "Total de alumnos: " + alumnos +
                "\nPresentes: " + presentes +
                String.format("\nPorcentaje de alumnos presentes: %.1f", porcentajePresentes) +
                "%\nAlumnos ausentes: " + ausentes +
                String.format("\nPorcentaje de alumnos ausentes: %.1f", porcentajeAusentes) + "%",
                "RESULTADOS", JOptionPane.INFORMATION_MESSAGE);

    }
}
