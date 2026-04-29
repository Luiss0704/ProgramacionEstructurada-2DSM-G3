#Subprogramas en Java


1. ¿Qué es una función en Java?\
En Java una función se llama **método**

Un `método` es un bloque de código que:
- Realiza una tarea específica.
- Puede recibir datos (parámetros).
- Puede devolver un resultado.
- Puede reutilizarse

\
2. Estructura de un método
```java
 modificador static tipoDeRetorno nombreDelMetodo(parametros){
 // Cuerpo del método
 return valor;  // Si aplica
 }
```
\
Ejemplo:
```java
 public static int sumarNumeros(int a, int b){
 // Cuerpo del método
 return a + b;
 }
```

<br>

3. ¿Por qué utilizar métodos estáticos?\
Porque el método `main` es estático

\
Un método estático:
- Pertenece a la clase.
- No necesita crear un objeto.
- Se invoca directamente.