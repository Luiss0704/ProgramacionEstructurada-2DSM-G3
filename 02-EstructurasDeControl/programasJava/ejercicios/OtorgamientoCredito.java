package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class OtorgamientoCredito {
    public static void main(String[] args) {
        //  Declaración de variables
        int respuesta = 1, antiguedadLaboral = 0;
        double ingresoMensual = 0;
        String opcion = "", historialCrediticio = "", credito = "", mensajeAdicional = "";
        boolean repetir = false;

        do {
            JOptionPane.showMessageDialog(null, "¡Bienvenido al Banco Papois! A continuación\nle pediremos algunos datos para validar su\nsolicitud de crédito", "BANCO PAPOIS", JOptionPane.INFORMATION_MESSAGE);
            //  Solicitar el ingreso mensual
            do {
                repetir = false;
                ingresoMensual = Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba su ingreso mensual (solo números): $", "Ingreso mensual", JOptionPane.QUESTION_MESSAGE));
                //  La siguiente línea sirve para que el valor del ingreso mensual se corte en 2 decimales e ignore todos los que siguen
                ingresoMensual = ((int)(ingresoMensual * 100)) / 100.0;
                if (ingresoMensual <= 0) {
                    JOptionPane.showMessageDialog(null, "El ingreso mensual debe ser mayor a $0", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);

            //  Solicitar la antigüedad laboral
            do {
                repetir = false;
                antiguedadLaboral = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su antigüedad laboral en años:", "Antigüedad laboral", JOptionPane.QUESTION_MESSAGE));
                if (antiguedadLaboral < 0) {
                    JOptionPane.showMessageDialog(null, "La antigüedad laboral debe ser mayor o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);

            //  Solicitar el historial crediticio
            do {
                repetir = false;
                opcion = JOptionPane.showInputDialog(null, menu(), "Historial crediticio", JOptionPane.QUESTION_MESSAGE);
                switch (opcion) {
                    case "1":
                        historialCrediticio = "Bueno";
                        break;

                    case "2":
                        historialCrediticio = "Regular";
                        break;

                    case "3":
                        historialCrediticio = "Malo";

                    default:
                        JOptionPane.showMessageDialog(null, "Elija una opción válida (escriba solo el número de la opción)", "Error", JOptionPane.ERROR_MESSAGE);
                        repetir = true;
                }
            } while (repetir == true);


            //  Determinar qué crédito se le dará al usuario
            if (ingresoMensual >= 12000 && antiguedadLaboral >= 2 && !historialCrediticio.equals("Malo")) {
                credito = "APROBADO";
                //  Determinar si el usuario es candidato a tener un crédito premium
                if (ingresoMensual > 25000) {
                    mensajeAdicional = "Cliente candidato a crédito premium.";
                } else {
                    mensajeAdicional = "No aplica";
                }
            } else if (ingresoMensual >= 8000 && antiguedadLaboral >= 1 && historialCrediticio.equals("Regular")) {
                credito = "CONDICIONADO";
                mensajeAdicional = "No aplica";
            } else {
                credito = "RECHAZADO";
                mensajeAdicional = "No aplica";
            }


            //  Resultados
            JOptionPane.showMessageDialog(null, String.format("Ingresos mensuales:  $%.2f", ingresoMensual) + "\nAntigüedad laboral: " + antiguedadLaboral + " años\nHistorial crediticio: " + historialCrediticio + "\n\nCrédito " + credito + "\nMensaje adicional: " + mensajeAdicional, "Resultado de la evaluación", JOptionPane.INFORMATION_MESSAGE);


            //  Solicitar al usuario si desea o no repetir el programa
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "BANCO PAPOIS", JOptionPane.YES_NO_OPTION);
        } while (respuesta == 0);           //  Cierre del programa

    }           //  Cierre del main




    //  Crear el menú
    public static String menu() {
        //  Escribir el menú del historial crediticio
        String menu = "===  HISTORIAL CREDITICIO  ===\n" +
                "1) Bueno\n" +
                "2) Regular\n" +
                "3) Malo\n" +
                "Elige una opción (número):";

        return menu;
    }           //  Cierre del menú

}           //  Cierre de la clase
