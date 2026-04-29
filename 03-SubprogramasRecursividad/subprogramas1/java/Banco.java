import javax.swing.JOptionPane;

public class Banco {
    public static void iniciar() {
        menu();
    }


    static double saldo = 0.0;


    public static double consultarSaldo() {
        return saldo;
    }


    public static double depositar(double monto) {
        saldo += monto;
        return saldo;
    }


    public static boolean validarMontoPositivo(double monto) {
        return (monto > 0) ? true : false;
    }


    public static double solicitarMonto() {
        double monto = 0.0;
        //mensajeDeposito(monto);
        while (true) {

            try {
                monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el monto a depositar:", "Depósito", JOptionPane.QUESTION_MESSAGE));

                if (validarMontoPositivo(monto)) {
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "El numero debe ser Positivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El saldo debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return monto;

    }


    public static double retirar(double monto) {
        saldo -= monto;
        return saldo;
    }

    public static boolean validarSaldoSuficiente(double montoRetirar) {
        return (saldo >= montoRetirar) ? true : false;
    }


    public static void menu() {
        String menu = "", opcion = "";
        boolean salir = true;
        double monto = 0.0;

        menu = "====  MENÚ  ====\n" +
                "1. Consultar saldo\n" +
                "2. Depositar\n" +
                "3. Retirar\n" +
                "4. Salir\n" +
                "Elija una opción:";

        while (salir) {
            opcion = JOptionPane.showInputDialog(null, menu, "BANCO", JOptionPane.QUESTION_MESSAGE).toUpperCase();

            switch (opcion) {
                case "1":
                case "A":
                    JOptionPane.showMessageDialog(null, "Tu saldo es de $" + consultarSaldo(), "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, depositar(solicitarMonto()));
                    break;

                case "3":
                case "C":
                    monto = solicitarMonto();
                    if (validarSaldoSuficiente(monto)) {
                        JOptionPane.showMessageDialog(null, "¡Retiro satisfactorio! Tu nuevo saldo es $" + retirar(monto), "Retiro", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No tienes saldo suficiente", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "4":
                case "D":
                case "S":
                    salir = false;
                    break;

                default:
            }
        }
    }
}
