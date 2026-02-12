/*
  *Una compañía de seguros tiene contratados a n vendedores.
  * Cada uno hace tres ventas a la  semana. Su política de pagos es
  * que un vendedor recibe un sueldo base y un 10% extra por
  * comisiones de sus ventas. El gerente de su compañía desea
  * saber cuánto dinero obtendrá en la semana cada vendedor por
  * concepto de comisiones por las tres ventas realizadas, y
  * cuanto tomando en cuenta su sueldo base y sus comisiones.
 */


package mx.edu.uttt.ciclos;
import javax.swing.JOptionPane;

public class ProgramasConWhile {
    public static void main(String[] args) {
        // Declaración de variables
        final double PORCENTAJE = 0.1;
        double sueldoBase = 0.0, v1 = 0.0, v2 = 0.0, v3 = 0.0, comision = 0.0, total = 0.0, totalSuma = 0.0;
        int numTrabajadores = 0;
        String salida = "", menu = "", opcion = "";
        boolean sentinel = true;

        do {
            // Mostrar el menú
            opcion = JOptionPane.showInputDialog(null, crearMenu(), "Menú de opciones", JOptionPane.QUESTION_MESSAGE);

            // Ejecutar la opción ingresada
            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    numTrabajadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de trabajadores:",  "Vendedores", JOptionPane.QUESTION_MESSAGE));
                    //  Validación del número de trabajadores
                    if( numTrabajadores > 0) {
                        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el sueldo base:", "Sueldo", JOptionPane.QUESTION_MESSAGE));
                        //  Validación del sueldo base
                        if(sueldoBase > 0.0) {
                            salida = "=====  NÓMINA  =====\n";
                            int i = 1;
                            while (i <= numTrabajadores) {
                                v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 1:", "Vendedor " + i, JOptionPane.QUESTION_MESSAGE));
                                v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 2:", "Vendedor " + i, JOptionPane.QUESTION_MESSAGE));
                                v3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la venta 3:", "Vendedor " + i, JOptionPane.QUESTION_MESSAGE));

                                //  Validación de las ventas y mensaje de error
                                if (v1 <= 0 || v2 <= 0 || v3 <= 0) {
                                    JOptionPane.showMessageDialog(null, "Una o más de las ventas no son válidas", "Error", JOptionPane.ERROR_MESSAGE);
                                    continue;
                                } else {
                                    //  Construcción
                                    comision = (v1 + v2 + v3) * PORCENTAJE;
                                    total = sueldoBase + comision;
                                    salida += "Vendedor " + i + "\nSueldo base: $" + sueldoBase + "\nComisión: $" + comision + "\nTotal: $" + total + "\n\n";
                                    totalSuma += total;
                                }

                                i++;
                            }       //  Cierre del while

                            salida += "\nTotal de deducciones: $" + totalSuma;
                            JOptionPane.showMessageDialog(null, salida, "", JOptionPane.INFORMATION_MESSAGE);

                        } else {        //  Cierre de validación de sueldo base y comienzo del mensaje de error
                            JOptionPane.showMessageDialog(null, "El sueldo base tiene que ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                        }       //  Cierre del mensaje de error en la validación del sueldo base

                    } else {        //  Cierre de validación de número de trabajadores y comienzo del mensaje de error
                        JOptionPane.showMessageDialog(null, "El número de trabajadores debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                    }       //  Cierre del mensaje de error en la validación del número de trabajadores
                    break;

                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;

                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;

                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null, "Opcion salir");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
            }
        }while (sentinel == true);;

    }


    public static String crearMenu() {
        // Creación de la cadena de texto para las opciones del menú
        String menu = "=====  MENÚ CICLO WHILE =====\n" +
        "1) Vendedores\n" +
        "2) Opción 2\n" +
        "3) Opción 3\n" +
        "4) Salir\n" +
        "Elige una opción (número):";

        return menu;
    }
}
