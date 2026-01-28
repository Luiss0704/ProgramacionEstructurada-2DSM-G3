package mx.edu.uttt.ciclos;
import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        double numero = 0.0;
        int cont = 0;

        int i = 1;
        while (i <= numero) {
            if (numero % 2 == 0) {
                cont++;
            }
            i++;
        }

        if(cont > 2) {
            JOptionPane.showMessageDialog(null, "No es primo");
        } else {
            JOptionPane.showMessageDialog(null, "Es primo");
        }
    }
}
