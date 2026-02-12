package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class ConsumoElectrico {
    public static void main(String[] args) {
        //  Declaración de variables
        double consumo = 0, costoPorKilowatt = 0, subtotal = 0, total = 0, recargo = 0;
        String opcion = "", menu = "", mensAd = "", tipoDeTarifa = "";
        int resp = 1;

        //  Escribir el menú
        menu = "=====  TIPO DE TARIFA =====\n" +
                "1) Básica\n" +
                "2) Intermedia\n" +
                "3) Alta\n" +
                "Elige una opción (número):";

        //  Ejecutar y repetir o no repetir el programa con base en la elección del usuario al final
        do {
            //  Bienvenida
            JOptionPane.showMessageDialog(null, "¡Bienvenido al servicio de electricidad! Aquí podrá\nconsultar cuánto tiene que pagar por su consumo", "Servicio de electricidad", JOptionPane.INFORMATION_MESSAGE);

            //  Ejecutar y repetir la entrada del valor del consumo de kWh en caso de ser errónea
            do {
                consumo = 0;
                consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su consumo mensual\nen kilowatts - hora (kWh):", "Consumo", JOptionPane.QUESTION_MESSAGE));
                //  La siguiente línea sirve para que el valor de consumo se corte en 2 decimales e ignore todos los que siguen
                consumo = ((int)(consumo * 100)) / 100.0;

                //  Validación de la entrada de consumo
                if (consumo < 0) {
                    JOptionPane.showMessageDialog(null, "El consumo eléctrico debe ser mayor o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                }           //  Cierre de la validación de la entrada del consumo de kWh
            } while (consumo < 0);          //  Cierre del do-while de la entrada del consumo de kWh

            //  Ejecutar y repetir el menú de opciones en caso de que se ingrese un valor no válido
            do {
                opcion = JOptionPane.showInputDialog(null, menu, "Menú de tipos de tarifas", JOptionPane.QUESTION_MESSAGE);
                switch (opcion) {
                    //  Tarifa básica
                    case "1":
                        subtotal = 0;
                        recargo = 0;
                        total = 0;
                        tipoDeTarifa = "Básica";
                        costoPorKilowatt = 0.85;
                        subtotal = consumo * costoPorKilowatt;
                        //  Si el consumo es mayor que 250 kWh, se hará un recargo del 12%
                        if (consumo > 250){
                            recargo = subtotal *0.12;
                            total = subtotal + recargo;
                        } else {
                            total += subtotal;
                        }
                        break;          //  Termina el caso 1 (tarifa básica)

                    //  Tarifa intermedia
                    case "2":
                        subtotal = 0;
                        recargo = 0;
                        total = 0;
                        tipoDeTarifa = "Intermedia";
                        costoPorKilowatt = 1.25;
                        subtotal = consumo * costoPorKilowatt;
                        //  Si el consumo está entre 300 y 500 kWh, se hará un recargo del 10%
                        if (consumo >= 300 && consumo <= 500) {
                            recargo = subtotal * 0.1;
                            total = subtotal + recargo;
                        } else if (consumo > 500) {         //  Si el consumo es mayor que 500 kWh, se hará un recargo del 18%
                            recargo = subtotal * 0.18;
                            total = subtotal + recargo;
                        } else {
                            total += subtotal;
                        }
                        break;          //  Termina el caso 2 (tarifa intermedia)

                    //  Tarifa alta
                    case "3":
                        subtotal = 0;
                        recargo = 0;
                        total = 0;
                        tipoDeTarifa = "Alta";
                        costoPorKilowatt = 2.10;
                        subtotal = consumo * costoPorKilowatt;
                        //  Si el consumo es mayor que 400 kWh, se hará un recargo del 25%
                        if (consumo > 400) {
                            recargo = subtotal * 0.25;
                            total = subtotal + recargo;
                        } else {
                            total += subtotal;
                        }
                        break;          //  Termina el caso 3 (tarifa alta)

                    //  Opción inválida
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opción válida", "Error", JOptionPane.ERROR_MESSAGE);

                }       //  Cierre del switch

                //  Si el valor de la opción es diferente de "1", "2", "3" o está vacío, el menú se repetirá
            } while ((!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3")) || opcion == null);        //  Cierre del do-while del menú de tarifas

            //  Si el total a pagar es más de $1,500 se mostrará el mensaje "Consumo elevado: se recomienda ahorro de energía."
            if (total > 1500) {
                mensAd = "Consumo elevado: se recomienda ahorro de energía.";
            } else if (consumo < 100) {         // Si el consumo de kWh es menor que 100 kWh, se mostrará el mensaje "Usuario con consumo eficiente."
                mensAd= "Usuario con consumo eficiente.";
            } else {        //  Si no se cumple ninguna de las dos condiciones, el mensaje que se mostrará será "No aplica."
                mensAd = "No aplica.";
            }       //  Cierre de condiciones

            //  Impresión de resultados
            JOptionPane.showMessageDialog(null, "Tipo de tarifa: " + tipoDeTarifa + String.format("\nConsumo registrado: %.2f", consumo) + " kWh\n" + String.format("Costo por kWh:  $%.2f", costoPorKilowatt) + String.format("\nSubtotal:  $%.2f", subtotal) + String.format("\nRecargos aplicados:  $%.2f", recargo) + String.format("\nTotal a pagar:  $%.2f", total) + "\nMensajes adicionales: " + mensAd, "Resultados", JOptionPane.INFORMATION_MESSAGE);


            //  Solicitar al usuario si desea repetir el programa
            resp = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "Servicio de electricidad", JOptionPane.YES_NO_OPTION);
        } while (resp == 0);        //  Cierre de do-while y fin del programa si el usuario así lo decide
    }
}