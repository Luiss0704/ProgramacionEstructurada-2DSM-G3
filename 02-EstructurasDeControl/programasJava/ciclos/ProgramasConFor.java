/*
 * 1. Calcular el promedio de un alumno que tiene
 * n calificaciones en la materia de programación.
*/

package mx.edu.uttt.ciclos;
import javax.swing.JOptionPane;

public class ProgramasConFor {
    public static void main(String[] args) {
        String menu = "", opcion = "";
        boolean sentinel = true;
        int n = 0;
        double promedio = 0.0, calif = 0.0;

        // Creación de la cadena de texto para las opciones del menú
        menu = "=====  MENÚ  PROGRAMAS CON FOR  =====\n" +
                "1) Calcular promedio\n" +
                "2) Opción 2\n" +
                "3) Opción 3\n" +
                "4) Salir\n" +
                "Elige una opción (número):";

        do {
            // Mostrar el menú
            opcion = JOptionPane.showInputDialog(null, menu, "Menú de opciones", JOptionPane.QUESTION_MESSAGE);

            // Ejecutar la opción ingresada
            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    // Solicitar la cantidad de calificaciones
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de calificaciones:", "Calcular promedio", JOptionPane.QUESTION_MESSAGE));
                    if (n > 0) {            // Validar que n sea mayor a 0
                        promedio = 0.0;         // Igualar el promedio a 0 para que no se guarde el valor cada vez que el usuario entre a este caso
                        for (int i = 1; i <= n; i++) {
                            // Solicitar la calificación
                            calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificación " + i + ":"));

                            // Validar la calificación ingresada
                            if (calif >= 0.0 && calif <= 10.0) {
                                promedio += calif;          // Acumular las calificaciones
                            } else {
                                JOptionPane.showMessageDialog(null, "La calificación debe estar en un rango de entre 0 y 10", "Error", JOptionPane.ERROR_MESSAGE);
                                i -= 1;
                                continue;
                            }
                        }

                        // Calcular promedio
                        promedio /= n;

                        // Mostrar el promedio de calificaciones y verificar si el alumno está reprobado
                        if (promedio >= 7) {
                            JOptionPane.showMessageDialog(null, "El promedio es de " + promedio + "\n¡APROBADO!", "Promedio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El promedio es de " + promedio + "\n¡REPROBADO!", "Promedio", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {            // Mensaje de error si n es menor o igual a 0
                        JOptionPane.showMessageDialog(null, "El número de calificaciones debe ser mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

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
        }while (sentinel == true);

    }
}
