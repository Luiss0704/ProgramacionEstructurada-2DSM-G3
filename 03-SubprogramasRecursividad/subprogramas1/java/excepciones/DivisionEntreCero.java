import javax.swing.JOptionPane;

public class DivisionEntreCero {
    public static void main(String[] args) {
        int num1, num2;
        double resultado;

        try {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));
            resultado = num1 / num2;

            JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println("Fin del programa");
    }
}
