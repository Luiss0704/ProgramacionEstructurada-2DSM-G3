# Actividad 2 — Reporte de Buenas Prácticas y Documentación de Código

**Alumno:** Nieto Sánchez Luis Fernando Gabriel  
**Grupo:** 2DSM - G3  
**Fecha:** 14/01/2026   
**Unidad:** 2

## 1. Objetivo del reporte
- Investigar y sintetizar las normas esenciales de escritura de código para mejorar la mantenibilidad del software.

- Aprender a documentar procesos técnicos siguiendo estándares profesionales para facilitar el trabajo en equipo.

## 2. Buenas prácticas de codificación
### 2.1 Nombres de variables
- **Reglas:** En Java se utiliza la convención *camelCase*. Los nombres deben ser sustantivos claros para variables (ej. `saldoCuenta`) y verbos para métodos (ej. `calcularTotal`). Se deben evitar nombres de una sola letra a menos que sean contadores en bucles.

- **Ejemplo:** En lugar de `int d = 30;`, usar `int diasVencimientoFactura = 30;`.

### 2.2 Comentarios
- **Cuándo comentar:** Para explicar la intención detrás de una lógica compleja o advertir sobre consecuencias de modificar un bloque de código.

- **Qué evitar:** Comentarios que repiten lo que el código ya dice claramente. En Java, es preferible un nombre de método descriptivo que un comentario explicativo.

### 2.3 Estructura del código
- **Indentación:** Uso estándar de 4 espacios por nivel. En Java, la apertura de llaves `{` suele ir al final de la línea de declaración.

- **Modularidad:** Seguir el principio de Responsabilidad Única (SRP). Las clases y métodos deben tener una sola razón para cambiar.

- **Evitar duplicidad:** Centralizar la lógica repetida en métodos privados o clases de utilidad para facilitar cambios globales.

## 3. Documentación del código
### 3.1 Estándares
- **Estándar elegido:** **Javadoc**. Es el estándar oficial de la industria para Java.

- **Elementos recomendados:** Uso de etiquetas `@param` para describir argumentos, `@return` para el valor devuelto y `@throws` para las excepciones que puede lanzar el método.

### 3.2 Herramientas / enfoque
- **README / generadores / extensiones:** Uso de la herramienta `javadoc` (línea de comandos) para generar sitios web de documentación. En IDEs como IntelliJ o Eclipse, se usan plugins para autocompletar estas etiquetas.

- **Ventajas:** Permite que otros desarrolladores entiendan cómo usar tus clases sin necesidad de leer toda la implementación lógica.

## 4. Ejemplos prácticos
### 4.1 Antes / Después (Ejemplo 1)
**Antes:**
```java
public double oper(double p, double d) {
    return p - (p * d);
}
```

**Después**
```java
public double calcularPrecioConDescuento(double precioOriginal, double porcentajeDescuento) {
    return precioOriginal - (precioOriginal * porcentajeDescuento);
}
```

### 4.2 Antes / Después (Ejemplo 2)

**Antes:**
```Java
// Código amontonado y repetitivo
if (user.role.equals("admin")) {
    System.out.println("Acceso concedido");
    log.info("El admin entró");
} else {
    System.out.println("Acceso denegado");
}
```

**Después**
```Java
public void verificarAcceso(Usuario usuario) {
    if (esAdministrador(usuario)) {
        concederAcceso();
    } else {
        System.out.println("Acceso denegado");
    }
}

private boolean esAdministrador(Usuario usuario) {
    return usuario.getRole().equals("admin");
}
```

### 4.3 Ejemplo de documentación
```Java
/**
 * Realiza la división de dos números enteros.
 * * @param dividendo El número que será dividido.
 * @param divisor El número por el cual se divide.
 * @return El cociente de la división como un valor double.
 * @throws ArithmeticException Si el divisor es cero.
 */

public double dividir(int dividendo, int divisor) {
    if (divisor == 0) {
        throw new ArithmeticException("No se puede dividir por cero");
    }
    return (double) dividendo / divisor;
}
```

## 5. Recomendaciones finales

- **Escribir código para humanos:** Recordar que el código se lee muchas más veces de las que se escribe.

- **Consistencia:** Mantener el mismo estilo de nombrado y estructura en todo el proyecto de la unidad.

- **Refactorización:** No tener miedo a cambiar un nombre de variable si durante el desarrollo encontramos uno que explique mejor su función.

## 6. Fuentes consultadas

1. Sales, V. (2024, 9 octubre). Clean code: ¿cuáles son las buenas prácticas de programación? Sydle. https://www.sydle.com/es/blog/clean-code-602bef23da4d09680935509b

2. Digital Talent Agency. (2019, 17 abril). 10 buenas prácticas para programadores. https://dtagency.tech/10-buenas-practicas-para-programadores/

3. Orlibet Dun. (2024, 4 octubre). ¿Qué son las buenas prácticas de programación? La clave para un desarrollo eficiente. LinkedIn. https://es.linkedin.com/pulse/qué-son-las-buenas-prácticas-de-programación-la-clave-dun--tb3fe