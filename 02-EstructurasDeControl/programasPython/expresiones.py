
""" En esta parte del código se van a declarar varios tipos de variables """

# Expresiones aritméticas
suma = 3 + 5
resta = 10 - 12
multi = 34 * 23
div = 10 / 2
divEntera = 15 // 2     # División entera
mod = 10 % 2
potencia = 4 ** 2       # Potencia

"""
salida = f"La suma es: {suma}"
print(salida)

salida = "La 'resta' es: " + str(resta)
print(salida)

salida = 'La "multiplicación" es:'
print(salida, multi)
"""

# Interpolación de Strings

salida = f"""
===== Expresiones Aritméticas =====
La suma es: {suma}
La resta es: {resta}
La multiplicación es: {multi}
La división es: {div}
La división entera es: {divEntera}
El módulo es: {mod}
La potencia es: {potencia}
        """

print(salida)