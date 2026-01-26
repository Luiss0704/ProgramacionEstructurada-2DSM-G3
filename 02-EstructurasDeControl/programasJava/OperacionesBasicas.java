package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class OperacionesBasicas {
    public static void main(String[] args) {
        // Declaración de variables
        String menu, opcion;
        double valor1, valor2;
        boolean potencia = true;

        // Crear un menú
        menu = "=====  MENÚ DE OPERACIONES  =====\n" + 
                        "1) Suma\n" + 
                        "2) Resta\n" + 
                        "3) Multiplicación\n" + 
                        "4) División\n" + 
                        "5) Módulo\n" + 
                        "6) Potencia\n" + 
                        "7) Raíz cuadrada\n" + 
                        "Elige una opción (sólo números):";

        // Elegir opción
        opcion = JOptionPane.showInputDialog(null, menu,"Menú de operaciones", JOptionPane.QUESTION_MESSAGE);

        // Aplicar opciones
        switch (opcion) {
            case "1":       // Suma
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "Suma", JOptionPane.QUESTION_MESSAGE));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "Suma", JOptionPane.QUESTION_MESSAGE));

                JOptionPane.showMessageDialog(null, "La suma de los valores es:\n" + valor1 + " + "  + valor2 + " = " + (valor1 + valor2), "SUMA", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "2":       // Resta
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "Resta", JOptionPane.QUESTION_MESSAGE));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "Resta", JOptionPane.QUESTION_MESSAGE));

                JOptionPane.showMessageDialog(null, "La resta de los valores es:\n" + valor1 + " - "  + valor2 + " = " + (valor1 - valor2), "RESTA", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "3":       // Multiplicación
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "Multiplicación", JOptionPane.QUESTION_MESSAGE));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "Multiplicación", JOptionPane.QUESTION_MESSAGE));

                JOptionPane.showMessageDialog(null, "La Multiplicación de los valores es:\n" + valor1 + " x "  + valor2 + " = " + (valor1 * valor2), "MULTIPLICACIÓN", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "4":       // División
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "División", JOptionPane.QUESTION_MESSAGE));
                valor2 = 0.0;
                while (valor2 == 0.0) {
                    valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "División", JOptionPane.QUESTION_MESSAGE));
                    if (valor2 == 0.0) {
                        JOptionPane.showMessageDialog(null, "El segundo valor no puede ser 0 (no se puede dividir entre 0)", "ERROR", JOptionPane.ERROR_MESSAGE);
                        valor2 = 0.0;
                    }
                }
                JOptionPane.showMessageDialog(null, "La división de los valores es:\n" + valor1 + " ÷ "  + valor2 + " = " + (valor1 / valor2), "DIVISIÓN", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "5":       // Módulo
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "Módulo", JOptionPane.QUESTION_MESSAGE));
                valor2 = 0.0;
                while (valor2 == 0.0) {
                    valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "Módulo", JOptionPane.QUESTION_MESSAGE));
                    if (valor2 == 0.0) {
                        JOptionPane.showMessageDialog(null, "El segundo valor no puede ser 0 (no se puede dividir entre 0)", "ERROR", JOptionPane.ERROR_MESSAGE);
                        valor2 = 0.0;
                    }
                }
                JOptionPane.showMessageDialog(null, "El módulo de los valores es:\n" + valor1 + " % "  + valor2 + " = " + (valor1 % valor2), "MÓDULO", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "6":       // Potencia
                valor1 = 0.0;
                while (valor1 == 0.0) {
                    valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer valor:", "Potencia", JOptionPane.QUESTION_MESSAGE));
                    if (valor1 != 0.0) {
                        valor2 = 0.0;
                        while (valor2 == 0.0) {
                            valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo valor:", "Potencia", JOptionPane.QUESTION_MESSAGE));
                            if (valor2 != 0.0) {
                                JOptionPane.showMessageDialog(null, "El resultado de la potencia es:\n" + valor1 + " ^ " + valor2 + " = " + Math.pow(valor1, valor2), "POTENCIA", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El segundo valor no puede ser igual a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                                valor2 = 0.0;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El primer valor no puede ser igual a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                        valor1 = 0.0;
                    }
                }
                break;

            case "7":       // Raíz cuadrada
                valor1 = -1.0;
                while (valor1 < 0.0) {
                    valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el valor:", "Raíz cuadrada", JOptionPane.QUESTION_MESSAGE));
                    if (valor1 >= 0.0) {
                        JOptionPane.showMessageDialog(null, "El resultado de la raíz cuadrada es:\n√ " + valor1 + " = " + Math.sqrt(valor1), "RAÍZ CUADRADA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede hacer una raíz cuadrada con un valor negativo", "ERROR", JOptionPane.ERROR_MESSAGE);
                        valor1 = -1.0;
                    }
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Se necesita ingresar un dato válido!\nTerminando el programa...", "ERROR", JOptionPane.ERROR_MESSAGE);

        }       // Cierre del switch
    }       // Cierre del main
}       // Cierre de la clase