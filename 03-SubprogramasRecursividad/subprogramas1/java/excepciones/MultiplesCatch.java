import javax.swing.JOptionPane;

public class MultiplesCatch {
    public static void main(String[] args) {
        int numero, resultado;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            resultado = 10/numero;

            JOptionPane.showMessageDialog(null, "El resultado de 10 / " + numero + " es " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresaste un número válido");
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir entre 0");
        }
    }
}
