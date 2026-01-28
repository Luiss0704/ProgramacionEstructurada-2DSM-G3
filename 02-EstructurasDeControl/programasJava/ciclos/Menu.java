package mx.edu.uttt.ciclos;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String menu = "", opcion = "";
        boolean sentinel = true;

        // Creación de la cadena de texto para las opciones del menú
        menu = "=====  MENÚ =====\n" +
                        "1) Opción 1\n" +
                        "2) Opción 2\n" +
                        "3) Opción 3\n" +
                        "4) Salir\n" +
                        "Elige una opción (número):";

        do {
            // Mostrar el menú
            opcion = JOptionPane.showInputDialog(null, opcion, "Menú de opciones", JOptionPane.QUESTION_MESSAGE);

            // Ejecutar la opción ingresada
            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    JOptionPane.showMessageDialog(null, "Opcion 1");
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
                    JOptionPane.showMessageDialog(null, "Opcion 4");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
            }
        }while (sentinel == true);
    }
}
