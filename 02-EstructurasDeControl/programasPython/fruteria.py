# Declaración de variables
precio_por_kilo = 0.0
numero_kilos = 0.0
subtotal = 0.0
descuento = 0.0
precio_total = 0.0

# Entrada de datos 
precio_por_kilo = float(input("Ingrese el precio por kilo: "))
numero_kilos = float(input("Ingrese el numero de kilos de fruta: "))

if numero_kilos >= 0 & numero_kilos <= 2:    # 0 a 2 kg (0% de descuento)
    subtotal = precio_por_kilo * numero_kilos
    descuento = subtotal * 0
    precio_total = subtotal - descuento

    print(f"Número de kilos: {numero_kilos} kg\nPrecio por kilo: ${precio_por_kilo}\nSubtotal: ${subtotal}\nDescuento: ${descuento}\nTotal a pagar: ${precio_total}")
elif numero_kilos > 2 & numero_kilos <= 5:    # +2 a 5 kg (10% de descuento)
    subtotal = precio_por_kilo * numero_kilos
    descuento = subtotal * 0.1
    precio_total = subtotal - descuento

    print(f"Número de kilos: {numero_kilos} kg\nPrecio por kilo: ${precio_por_kilo}\nSubtotal: ${subtotal}\nDescuento: ${descuento}\nTotal a pagar: ${precio_total}")
elif numero_kilos > 5 & numero_kilos <= 10:    # +5 a 10 kg (15% de descuento)
    subtotal = precio_por_kilo * numero_kilos
    descuento = subtotal * 0.15
    precio_total = subtotal - descuento

    print(f"Número de kilos: {numero_kilos} kg\nPrecio por kilo: ${precio_por_kilo}\nSubtotal: ${subtotal}\nDescuento: ${descuento}\nTotal a pagar: ${precio_total}")
elif numero_kilos > 10:    # +10 kg (20% de descuento)
    subtotal = precio_por_kilo * numero_kilos
    descuento = subtotal * 0.2
    precio_total = subtotal - descuento

    print(f"Número de kilos: {numero_kilos} kg\nPrecio por kilo: ${precio_por_kilo}\nSubtotal: ${subtotal}\nDescuento: ${descuento}\nTotal a pagar: ${precio_total}")