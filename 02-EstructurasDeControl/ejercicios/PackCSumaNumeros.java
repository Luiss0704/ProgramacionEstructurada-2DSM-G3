/* *
 * Solicita números enteros hasta que el usuario ingrese un número negativo. Muestra la
 * suma total y cuántos números válidos se ingresaron.
 * */

package mx.edu.uttt.ejerciciospaquetec;
import javax.swing.JOptionPane;

public class PackCSumaNumeros {
    public static void main(String[] args) {
        //  Declaración de variables
        int n = 0, suma = 0;

        //  Bienvenida
        JOptionPane.showMessageDialog(null, "¡Bienvenido! En este programa podrá ingresar\nnúmeros enteros positivos y se irán sumando", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

        //  Ciclo que irá sumando los números que ingrese el usuario
        while (n >= 0) {
            //  Solicitar número(s)
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero positivo\n(para salir ingrese un número entero negativo):", "Suma de enteros positivos", JOptionPane.QUESTION_MESSAGE));
            if (n >= 0) {
                //  Acumular los números ingresados
                suma += n;
            }
        }

        //  Imprimir el resultado
        JOptionPane.showMessageDialog(null, "La suma total de los números es: " + suma, "Suma de enteros positivos", JOptionPane.INFORMATION_MESSAGE);
    }
}