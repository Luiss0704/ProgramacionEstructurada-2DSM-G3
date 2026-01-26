package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class Fruteria {
    public static void main(String[] args) {
        double precioPorKilo, numKilos, subtotal, descuento, precioTotal;
        int resp;
        do {
            do {
                precioPorKilo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio por kilo:", "Frutería", JOptionPane.QUESTION_MESSAGE));
                if (precioPorKilo <= 0) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar datos válidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (precioPorKilo <= 0);


            do {
                numKilos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número de kilos de fruta:", "Frutería", JOptionPane.QUESTION_MESSAGE));
                if (numKilos < 0) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar datos válidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (numKilos < 0);

            if (numKilos >= 0 && numKilos <= 2) {
                subtotal = precioPorKilo * numKilos;
                descuento = (subtotal * 0);
                precioTotal = subtotal - descuento;

                JOptionPane.showMessageDialog(null, "Número de kilos: " + numKilos + " kg\nPrecio por kilo:  $" + precioPorKilo + "\nSubtotal:  $" + subtotal + "\nDescuento:  $" + descuento + "\nTotal a pagar:  $" + precioTotal, "Frutería", JOptionPane.INFORMATION_MESSAGE);
            } else if (numKilos > 2 && numKilos <= 5) {
                subtotal = precioPorKilo * numKilos;
                descuento = (subtotal * 0.1);
                precioTotal = subtotal - descuento;

                JOptionPane.showMessageDialog(null, "Número de kilos: " + numKilos + " kg\nPrecio por kilo:  $" + precioPorKilo + "\nSubtotal:  $" + subtotal + "\nDescuento:  $" + descuento + "\nTotal a pagar:  $" + precioTotal, "Frutería", JOptionPane.INFORMATION_MESSAGE);
            } else if (numKilos > 5 && numKilos <= 10) {
                subtotal = precioPorKilo * numKilos;
                descuento = (subtotal * 0.15);
                precioTotal = subtotal - descuento;

                JOptionPane.showMessageDialog(null, "Número de kilos: " + numKilos + " kg\nPrecio por kilo:  $" + precioPorKilo + "\nSubtotal:  $" + subtotal + "\nDescuento:  $" + descuento + "\nTotal a pagar:  $" + precioTotal, "Frutería", JOptionPane.INFORMATION_MESSAGE);
            } else if (numKilos > 10) {
                subtotal = precioPorKilo * numKilos;
                descuento = (subtotal * 0.2);
                precioTotal = subtotal - descuento;

                JOptionPane.showMessageDialog(null, "Número de kilos: " + numKilos + " kg\nPrecio por kilo:  $" + precioPorKilo + "\nSubtotal:  $" + subtotal + "\nDescuento:  $" + descuento + "\nTotal a pagar:  $" + precioTotal, "Frutería", JOptionPane.INFORMATION_MESSAGE);
            }

            resp = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "Frutería", JOptionPane.YES_NO_OPTION);
        } while (resp == 0);
    }
}
