public class ExcepcionConFinally {
    public static void main(String[] args) {
        int x = 10, y = 0, z = 0;

        try {
            z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

        System.out.println("Fin del programa");
    }
}
