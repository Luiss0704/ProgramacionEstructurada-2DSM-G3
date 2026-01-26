import math

menu = ""
opcion = ""
valor1 = 0.0
valor2 = 0.0

menu = (
    "=====  MENÚ DE OPERACIONES  =====\n"
    "1) Suma\n"
    "2) Resta\n"
    "3) Multiplicación\n"
    "4) División\n"
    "5) Módulo\n"
    "6) Potencia\n"
    "7) Raíz cuadrada\n"
    "Elige una opción (sólo números): "
)

opcion = input(menu)

if opcion == "1":  # Suma
    valor1 = float(input("Introduce el primer valor: "))
    valor2 = float(input("Introduce el segundo valor: "))
    print(f"La suma es: {valor1} + {valor2} = {valor1 + valor2}")

elif opcion == "2":  # Resta
    valor1 = float(input("Introduce el primer valor: "))
    valor2 = float(input("Introduce el segundo valor: "))
    print(f"La resta es: {valor1} - {valor2} = {valor1 - valor2}")

elif opcion == "3":  # Multiplicación
    valor1 = float(input("Introduce el primer valor: "))
    valor2 = float(input("Introduce el segundo valor: "))
    print(f"La multiplicación es: {valor1} x {valor2} = {valor1 * valor2}")

elif opcion == "4":  # División
    valor1 = float(input("Introduce el primer valor: "))
    valor2 = 0.0
    while valor2 == 0.0:
        valor2 = float(input("Introduce el segundo valor: "))
        if valor2 == 0.0:
            print("ERROR: No se puede dividir entre 0")
    print(f"La división es: {valor1} ÷ {valor2} = {valor1 / valor2}")

elif opcion == "5":  # Módulo
    valor1 = float(input("Introduce el primer valor: "))
    valor2 = 0.0
    while valor2 == 0.0:
        valor2 = float(input("Introduce el segundo valor: "))
        if valor2 == 0.0:
            print("ERROR: No se puede dividir entre 0")
    print(f"El módulo es: {valor1} % {valor2} = {valor1 % valor2}")

elif opcion == "6":  # Potencia
    valor1 = 0.0
    while valor1 == 0.0:
        valor1 = float(input("Introduce el primer valor: "))
        if valor1 == 0.0:
            print("ERROR: El primer valor no puede ser 0")

    valor2 = 0.0
    while valor2 == 0.0:
        valor2 = float(input("Introduce el segundo valor: "))
        if valor2 == 0.0:
            print("ERROR: El segundo valor no puede ser 0")

    print(f"La potencia es: {valor1} ^ {valor2} = {math.pow(valor1, valor2)}")

elif opcion == "7":  # Raíz cuadrada
    valor1 = -1.0
    while valor1 < 0.0:
        valor1 = float(input("Introduce el valor: "))
        if valor1 < 0.0:
            print("ERROR: No se puede calcular la raíz de un número negativo")
    print(f"La raíz cuadrada es: √{valor1} = {math.sqrt(valor1)}")

else:
    print("ERROR: Opción inválida. Terminando el programa.")
