package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class SistemaDeCobro {
    public static void main(String[] args) {
        //  Declaración de variables
        int respuesta = 1, opcionCliente = 0, opcionMetodoPago = 0;
        double montoTotal = 0.0, descuento = 0.0, totalPagar = 0.0, impuesto = 0.0, descuentoAcumulable = 0.0, montoTrasDescuento = 0.0;
        String tipoCliente = "", metodosPago = "";
        boolean repetir = false;

        //Arreglos para las opciones de los botones en los JOptionPane.showOptionDialog
        String[] arregloMetodosDePago = {"Efectivo", "Tarjeta"},
                arregloTipoDeCliente = {"Normal", "Miembro", "Empleado"};

        do {
            //  Resetear variables para que no se acumulen por toda la eternidad por si el usuario repite el programa
            descuentoAcumulable = 0.0;
            impuesto = 0.0;

            //  Bienvenida
            JOptionPane.showMessageDialog(null, "¡Bienvenido a 309 Store!", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

            //  Solicitar el monto a pagar
            do {
                repetir = false;
                montoTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto total a pagar: $", "Monto total a pagar", JOptionPane.QUESTION_MESSAGE));
                //  La siguiente línea sirve para que el valor del monto total a pagar se corte en 2 decimales e ignore todos los que siguen
                montoTotal = ((int)(montoTotal * 100)) / 100.0;
                //  Validar la entrada del monto total a pagar
                if (montoTotal <= 0) {
                    JOptionPane.showMessageDialog(null, "El monto total a pagar debe de ser mayor a $0", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);


            //  Solicitar el tipo de cliente
            do {
                repetir = false;
                opcionCliente = JOptionPane.showOptionDialog(null, "Elija el tipo de cliente:", "Tipo de cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, arregloTipoDeCliente, arregloTipoDeCliente[0]);
                switch (opcionCliente) {
                    case 0:
                        tipoCliente = "Normal";
                        break;

                    case 1:
                        tipoCliente = "Miembro";
                        break;

                    case 2:
                        tipoCliente = "Empleado";
                        break;

                    //  Si cierra la ventana le muestra un error
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione una de las tres opciones", "Error", JOptionPane.ERROR_MESSAGE);
                        repetir = true;
                }
            } while (repetir == true);


            //  Solicitar la forma de pago
            do {
                repetir = false;
                opcionMetodoPago = JOptionPane.showOptionDialog(null, "Elija un método de pago:", "Método de pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, arregloMetodosDePago, arregloMetodosDePago[0]);

                if (opcionMetodoPago == 0) {            //  Forma de pago: Efectivo
                    metodosPago = "Efectivo";
                } else if (opcionMetodoPago == 1) {             //  Forma de pago: Tarjeta
                    metodosPago = "Tarjeta";
                } else {                //  Validar que si cierra la ventana, le muestre un error
                    JOptionPane.showMessageDialog(null, "Seleccione una de las dos opciones", "Error", JOptionPane.ERROR_MESSAGE);
                    repetir = true;
                }
            } while (repetir == true);


            //  Validar si el cliente tiene descuento por ser miembro o empleado
            if (tipoCliente.equals("Miembro")) {
                descuentoAcumulable += 0.1;
            } else if (tipoCliente.equals("Empleado")) {
                descuentoAcumulable += 0.2;
            }

            //  Acumular el descuento del 5% si se paga en efectivo
            if (metodosPago.equals("Efectivo")) {
                descuentoAcumulable += 0.05;
            }

            //  Calcular el descuento
            descuento = montoTotal * descuentoAcumulable;
            //  Aplicar el descuento
            montoTrasDescuento = montoTotal - descuento;

            //  Si se van a pagar más de $5,000 se aplicará un impuesto del 8%
            if (montoTrasDescuento > 5000) {
                impuesto = montoTrasDescuento * 0.08;
            }

            //  Calcular el total a pagar aplicando los descuentos y el impuesto
            totalPagar = montoTrasDescuento + impuesto;


            //  Resultados
            JOptionPane.showMessageDialog(null, String.format("Subtotal:  $%.2f", montoTotal) + String.format("\nDescuentos aplicados:  -$%.2f", descuento) + String.format("\nImpuestos aplicados:  +$%.2f", impuesto) + String.format("\nTotal a pagar:  $%.2f", totalPagar), "Resultados", JOptionPane.INFORMATION_MESSAGE);


            //  Solicitar al usuario si desea repetir o no el programa
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "309 Store", 0);
        } while (respuesta == 0);
    }           //  Cierre del main

}           //  Cierre de la clase