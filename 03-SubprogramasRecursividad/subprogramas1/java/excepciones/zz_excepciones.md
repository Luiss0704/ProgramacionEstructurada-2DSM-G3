# Manejo de Excepciones en Java

> Una excepción es un error que ocurre durante la ejecución del programa y que interrumpe el flujo normal


**Ejemplos comunes:**

- Dividir entre 0
- Convertir un "Hola" a número
- Acceder a una posición inexistente de un arreglo

## Estructura básica

```java
try {
    // Código que puede generar error
} catch (TipoDeExcepcion e) {
    // Código que maneja el error
} finally {
    // (OPCIONAL) código que siempre se ejecuta
}
```


## Tipo de excepciones


1. Checked (Obligatorias)
Java Obliga a manejarlas
Ejemplos:

- IOException
- SQLException

ㅤ

2. Unchecked (RuntimeException)
- ArithmeticException
- NullPointerException
- NumberFormatException

ㅤ

**División entre cero**
```java
package mx.edu.uttt.subprogramas.excepciones;
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
```

ㅤ

**Múltiples catch**
```java
package mx.edu.uttt.subprogramas.excepciones;
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

```

ㅤ

**Excepción con finally**
```java
package mx.edu.uttt.subprogramas.excepciones;

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
```

ㅤ

**Manejo de Throw: Lanzar Exception Throw**
```java
package mx.edu.uttt.subprogramas.excepciones;

public class LanzarExceptionThrow {
    public static void main(String[] args) {
        int edad = 5;

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        System.out.println("Edad válida");
    }
}
```