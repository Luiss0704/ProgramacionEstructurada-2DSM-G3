# Entrada de datos - Solicitar calificaciones
calif1 = float(input("Introduce la primera calificación: "))
calif2 = float(input("Introduce la segunda calificación: "))
calif3 = float(input("Introduce la tercera calificación: "))

# Proceso - Calcular promedio
promedio = (calif1 + calif2 + calif3) / 3

# Estructura selectiva simple
if promedio >= 7:
    print("APROBADO")
else :
    print("REPROBADO")