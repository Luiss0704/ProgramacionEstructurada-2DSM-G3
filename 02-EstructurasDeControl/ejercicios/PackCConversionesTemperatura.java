/*
* Solicita el número de alumnos de un grupo y registra si cada uno
* está Presente (P) o Ausente (A). Muestra el porcentaje de asistencia.
* */

package mx.edu.uttt.ejerciciospaquetec;
import javax.swing.JOptionPane;

public class PackCConversionesTemperatura {
    public static void main(String[] args) {
        //  Declaración de variables
        double grados = 0.0, resultado = 0.0;
        int conversion = 0;
        //  Arreglo para los botones
        String[] escalaTemperatura = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};

        //  Solicitar una opción de conversión
        conversion = JOptionPane.showOptionDialog(null, "Elija la conversión que desea realizar:", "Conversión de temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escalaTemperatura, escalaTemperatura[0]);

        switch (conversion) {
            case 0:             //  Celsius a Fahrenheit
                //  Solicitar grados Celsius
                grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese grados Celsius:", escalaTemperatura[conversion], JOptionPane.QUESTION_MESSAGE));
                //  Convertir a grados Fahrenheit
                resultado = (grados * 1.8) + 32;
                //   Mostrar la conversión
                JOptionPane.showMessageDialog(null, String.format("%.1f", grados) + String.format(" °C  =  %.1f", resultado) + " °F", escalaTemperatura[conversion], JOptionPane.INFORMATION_MESSAGE);
                break;

            case 1:             //  Fahrenheit a Celsius
                //  Solicitar grados Fahrenheit
                grados = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese grados Fahrenheit:", escalaTemperatura[conversion], JOptionPane.QUESTION_MESSAGE));
                //  Convertir a grados Celsius
                resultado = (grados - 32) / 1.8;
                //   Mostrar la conversión
                JOptionPane.showMessageDialog(null, String.format("%.1f", grados) + String.format(" °F  =  %.1f", resultado) + " °C", escalaTemperatura[conversion], JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
