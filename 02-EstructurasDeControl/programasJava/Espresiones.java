
package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
            // Declaración de variables
            /*
            * En esta parte del código
            * se van a declarar varios
            * tipos de variables
            */

            String salida = "";
            int suma, resta, multi, div, mod, area;
            double potencia, resultado;

            // Expresiones aritméticas
            suma = 3 + 5;
            resta = 10 - 12;
            multi = 34 * 23;
            div = 10 / 2;
            mod = 10 % 2;
            potencia = Math.pow(10,2);

            salida = "===== Expresiones aritméticas =====" +
                           "\nLa suma es: " + suma +
                           "\nLa resta es: " + resta +
                           "\nLa multiplicación es: " + multi +
                           "\nLa división: " + div +
                           "\nLa potencia es: " + potencia +
                           "\nEl módulo es: " + mod;

            JOptionPane.showMessageDialog(null, salida, "Expresiones aritméticas", JOptionPane.INFORMATION_MESSAGE);
    }
}
