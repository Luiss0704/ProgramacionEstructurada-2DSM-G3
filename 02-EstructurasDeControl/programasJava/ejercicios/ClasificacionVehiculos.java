package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;
import java.util.Queue;

public class ClasificacionVehiculos {
    public static void main(String[] args) {
        //  Declaración de variables
        int anioVehiculo = 0, anioActual = 2026, resp = 1;
        String menu = "", opcion = "", tipoDeVehiculo = "", verificacion = "";
        double nivelEmisiones = 0;
        boolean repetir = false;

        //  Escribir el menú
        menu = "=====  TIPO DE VEHÍCULO =====\n" +
                "1) Particular\n" +
                "2) Carga\n" +
                "3) Público\n" +
                "Elige una opción (número):";


        //  Ejecutar y repetir o no repetir el programa dependiendo de la elección del usuario
        do {
            //  Solicitar el año del vehículo
            do {
                repetir = false;
                anioVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del vehículo:", "Clasificación de vehículos para verificación", JOptionPane.QUESTION_MESSAGE));
                if (anioVehiculo > anioActual || anioVehiculo < 1993) {
                    JOptionPane.showMessageDialog(null, "Ingrese datos válidos, el año del vehículo debe estar entre 1993 y el año actual", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);


            // Solicitar el tipo de vehículo
            do {
                repetir = false;
                opcion = JOptionPane.showInputDialog(null, menu, "Clasificación de vehículos para verificación", JOptionPane.QUESTION_MESSAGE);

                switch (opcion) {
                    case "1":
                        tipoDeVehiculo = "Particular";
                        break;

                    case "2":
                        tipoDeVehiculo = "Carga";
                        break;

                    case "3":
                        tipoDeVehiculo = "Público";
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "¡Elija una opción válida!", "Error", JOptionPane.ERROR_MESSAGE);
                        repetir = true;
                }           //  Cierre del switch
            } while (repetir == true);


            //  Solicitar nivel de emisiones
            do {
                repetir = false;
                nivelEmisiones = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nivel de emisiones contaminantes de su vehículo:", "Clasificación de vehículos para verificación", JOptionPane.QUESTION_MESSAGE));
                if (nivelEmisiones < 0) {
                    JOptionPane.showMessageDialog(null, "El número de emisiones contaminantes debe ser mayor o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);


            if (tipoDeVehiculo.equals("Particular") && nivelEmisiones <= 50) {
                verificacion = "APROBADA";
            } else if (tipoDeVehiculo.equals("Carga") && nivelEmisiones <= 70) {
                verificacion = "APROBADA";
            } else if (tipoDeVehiculo.equals("Público") && nivelEmisiones <= 60) {
                verificacion = "APROBADA";
            } else {
                verificacion = "RECHAZADA";
            }

            if (anioVehiculo < 2005) {
                verificacion = "Vehículo antiguo, requiere revisión especial.";
            }


            //  Mostrar resultados
            JOptionPane.showMessageDialog(null, "Año del vehículo: " + anioVehiculo + "\nTipo de vehículo: " + tipoDeVehiculo + String.format("\nNivel de emisiones contaminantes: %.2f", nivelEmisiones) + "\n\nResultado de la verificación: " + verificacion, "Resultados", JOptionPane.INFORMATION_MESSAGE);


            //  Solicitar al usuario si desea o no repetir el programa
        resp = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "Clasificación de vehículos para verificación", JOptionPane.YES_NO_OPTION);
        } while (resp == 0);
    }
}
