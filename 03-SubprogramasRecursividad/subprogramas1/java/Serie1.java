import  javax.swing.JOptionPane;

public class Serie1 {
    public static double calcularSerie (int n){
        double x = solicitarX();
        int deno1 = 3;
        int deno2 = 1;
        double s = 0.0;

        for (int i = 1; i <= n ; i++) {
            s += Math.pow(x,3.0 / deno1) / deno2;     // s+=Math.pow(x, 3.0 /deno1) /deno2;
            deno1 = deno1 + 3;                    // deno1 += 3;
            deno2 = deno2 + 2;                     // deno2 += 2;
        }
        return s;
    }

    public static double solicitarX() {
        boolean sentinel = true;
        double x = 0.0;

        do {
            try {
                x = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número:"));
                sentinel = false;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un número");
            }

        } while (sentinel);


        return x;
    }

    public static int solicitarN() {
        boolean sentinel = true;
        int n = 0;

        do {
            try {
                String info = JOptionPane.showInputDialog("Ingresa el valor de N:");
                if (info == null){
                    JOptionPane.showMessageDialog(null, "Proceso Cancelado");
                }
                n = Integer.parseInt(info);
                if(n <= 0){
                    JOptionPane.showMessageDialog(null, "Ingresa un valor mayor a 0");
                } else{
                    sentinel = false;
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El valor debe ser un número");
            }
        } while (sentinel);

        return  n;
    }
}