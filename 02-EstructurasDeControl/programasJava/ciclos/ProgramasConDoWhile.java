/* *
 * En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
 * la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su
 * compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que
 * cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento;
 * si es amarilla un 25% y si es blanca no obtendrá descuento.
 * */

package mx.edu.uttt.ciclos;
import javax.swing.JOptionPane;

public class ProgramasConDoWhile {
    public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = false;

        do {
            opcion = obtenerMenu();
            switch (opcion) {
                case "1": {
                    JOptionPane.showMessageDialog(null, calcularResultados());
                    break;
                }

                case "2": {
                    JOptionPane.showMessageDialog(null, "¿Soy tu segunda opción :'(?", "Opción 2", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

                case "3":{
                    JOptionPane.showMessageDialog(null, "Holi", "Opción 3", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

                case "4":{
                    JOptionPane.showMessageDialog(null, "I'll be back", "Opción 4", JOptionPane.INFORMATION_MESSAGE);
                    sentinel = false;
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    sentinel = true;
                }
            }
        } while (sentinel);

    }           //  Cierre del main



    public static String obtenerMenu() {
        String menu = "=====  PROGRAMAS DO - WHILE =====\n" +
                "1) Bolitas de descuento\n" +
                "2) Opción 2\n" +
                "3) Opción 3\n" +
                "4) Salir\n" +
                "Elige una opción (número):";

        String opcion = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);

        return opcion;
    }           //  Cierre de obtenerMenu()



    public static String elegirBolitaColor() {
        int bolitaElegida = -1;
        String opcion = "";
        String[] elegirBolita = {"Roja", "Amarilla", "Blanca"};
        boolean sentinel = false;

        do {
            sentinel = false;
            bolitaElegida = JOptionPane.showOptionDialog(null, "Elija el color de la bolita que se agarró: ", "Bolita", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elegirBolita, elegirBolita[0]);
            switch (bolitaElegida) {
                case 0: {           //  Bolita Roja
                    opcion = "1";
                    break;
                }

                case 1: {           //  Bolita Amarilla
                    opcion = "2";
                    break;
                }

                case 2: {           //  Bolita Blanca
                    opcion = "3";
                    break;
                }

                default: {
                    opcion = "-1";
                    //  JOptionPane.showMessageDialog(null, "Opción no válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    sentinel = true;
                }
            }
        } while (sentinel);

        return opcion;
    }



    public static String calcularResultados() {
        String salida = "", bolita = "", colorBola = "";
        double descuento = 0.0, total = 0.0, importe = 0.0, totalDelDia = 0.0, totalDescuentos = 0.0;
        int i = 1;
        boolean sentinel = true;

        do {

            do {
                importe = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el importe (ó  -1  para salir):", "Importe", JOptionPane.QUESTION_MESSAGE));
            } while (importe <= 0 && importe != -1);

            if(importe == -1) {
                JOptionPane.showMessageDialog(null, "Has terminado el problema", "Saliendo...", JOptionPane.INFORMATION_MESSAGE);
                sentinel = false;
            } else {
                bolita = elegirBolitaColor();

                if (bolita.equals("1")) {
                    colorBola = "ROJA";
                    descuento = importe * 0.4;
                    total = importe - descuento;

                    totalDescuentos += descuento;
                    totalDelDia += total;
                } else if (bolita.equals("2")) {
                    colorBola = "AMARILLA";
                    descuento = importe * 0.25;
                    total = importe - descuento;

                    totalDescuentos += descuento;
                    totalDelDia += total;
                } else{
                    colorBola = "BLANCA";
                    descuento = 0.0;
                    total = importe - descuento;

                    totalDescuentos += descuento;
                    totalDelDia += total;
                }

                salida += "CLIENTE" + i + String.format(":\nImporte:  $%.2f", importe) + "\nBola " + colorBola + String.format("\nDescuento:  $%.2f", descuento) + String.format("\nTotal a pagar:  $%.2f", total) + "\n\n";
                i++;
            }

        } while (sentinel);

        salida += String.format("\nTotal de pagos:  $%.2f", totalDelDia) + String.format("\nTotal de descuentos:  $%.2f", totalDescuentos);


        return salida;
    }

}           //  Cierre de la clase