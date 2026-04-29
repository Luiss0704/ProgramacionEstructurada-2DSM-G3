# Recursividad y casos (general y base)


## Recursividad
**Definición**: Es una función que se invoca a sí misma para resolver un subproblema del mismo tipo, hasta que llega a una solución conocida.

<br>

## Caso Base (Condición de parada)
- **¿Qué es?** El escenario más simple que no requiere más cálculos.
- **Función:** Detener las llamadas para evitar un desbordamiento de memoria `(Stack Overflow)`.
- **Ejemplo:**

```java
if (n == 0) return 1;
```


## Caso General (Paso recursivo)
- **¿Qué es?** La instrucción donde la función se invoca a sí misma.
- **Regla de oro:** El argumento debe modificarse para acercarse obligatoriamente al Caso Base.
- **Ejemplo:**

```java
return n * factorial(n - 1);
```

<br><br>

## `¡Algo a tomar en cuenta!`
- **Consumo de Memoria:** Cada llamada recursiva añade un marco a la pila (stack). Si la recursión es muy profunda *(ej. 10,000 llamadas)*, el programa colapsará, cosa que un bucle `while` no haría.
- **La trampa del *no progreso*:** Si en el Caso General se hace `return funcion(n)` en lugar de `n-1` (o cualquier reducción), se crea un bucle infinito.
- **Falta de validación:** Si tu caso base espera `n == 0` pero el usuario mete un `-1`, tu lógica nunca se detendrá. **Siempre** usa comparaciones de seguridad como `n <= 0`.