/*
* Solicita un número entero positivo y determina si es primo.
* */

package mx.edu.uttt.ejerciciospaquetec;
import javax.swing.JOptionPane;

public class PackCNumeroPrimo {
    public static void main(String[] args) {
        //  Declaración de variables
        int num = 0;
        boolean numPrimo, repetir = true;

        do {
            //  Solicitar número
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero positivo\n(Para salir ingrese 0):", "Número primo", JOptionPane.QUESTION_MESSAGE));
            //  Bandera
            numPrimo = true;

            //  Si el número es menor a 2, el número no es primo
            if (num < 2) {
                //  Si el número es menor que 2 y diferente de 0, muestra el mensaje de que el número no es primo
                if (num != 0) {
                    JOptionPane.showMessageDialog(null, num + " no es un número primo.\nIngrese otro número.", "Número no primo", JOptionPane.ERROR_MESSAGE);
                    numPrimo = false;
                } else {
                    //  Si el número es igual a 0, el programa termina
                    return;
                }
            } else {
                //  Con este ciclo se buscará un divisor para el número ingresado
                for (int i = 2; i * i <= num; i++) {
                    //  Determina si la división es exacta
                    if (num % i == 0) {
                        //  Si la división es exacta, el número no es primo y directamente se sale del ciclo
                        numPrimo = false;
                        break;
                    }
                }
            }

            //  Mostrar resultados
            if (numPrimo) {
                JOptionPane.showMessageDialog(null, num + " es un número primo.", "Número primo", JOptionPane.INFORMATION_MESSAGE);
            } else if (!numPrimo && num > 1) {
                JOptionPane.showMessageDialog(null, num + " no es un número primo.\nIngrese otro número.", "Número no primo", JOptionPane.ERROR_MESSAGE);
            }

        } while (repetir);
    }
}
