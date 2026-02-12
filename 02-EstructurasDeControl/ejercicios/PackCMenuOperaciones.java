/* *
* Muestra un menú con opciones para sumar, restar y multiplicar dos números.
* El menú se repite hasta que el usuario decida salir.
* */

package mx.edu.uttt.ejerciciospaquetec;
import javax.swing.JOptionPane;

public class PackCMenuOperaciones {
    public static void main(String[] args) {
        //  Declaración de variables
        double n1 = 0.0, n2 = 0.0, suma = 0.0, resta = 0.0, multiplicacion = 0.0;
        int respuesta = 1, operacion = 0;
        //  Arreglo para los botones
        String[] botonesOperaciones = {"Sumar","Restar","Multiplicar"};

        do {
            //  Solicitar una operación
            operacion = JOptionPane.showOptionDialog(null, "Seleccione la operación que quiera realizar:", "MENÚ DE OPERACIONES", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesOperaciones, botonesOperaciones[0]);

            //  Solicitar números
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número:", botonesOperaciones[operacion], JOptionPane.QUESTION_MESSAGE));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:", botonesOperaciones[operacion], JOptionPane.QUESTION_MESSAGE));

            switch (operacion) {
                case 0:             //  Suma
                    suma = n1 + n2;
                    JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + suma, botonesOperaciones[operacion], JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 1:             //  Resta
                    resta = n1 - n2;
                    JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resta, botonesOperaciones[operacion], JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:             //  Multiplicación
                    multiplicacion = n1 * n2;
                    JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + multiplicacion, botonesOperaciones[operacion], JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

            //  Solicitar al usuario si desea repetir o no el programa
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "MENÚ DE OPERACIONES", JOptionPane.YES_NO_OPTION);
        } while (respuesta == 0);
    }
}
