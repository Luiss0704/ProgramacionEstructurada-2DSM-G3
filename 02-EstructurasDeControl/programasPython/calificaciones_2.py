calif1 = 0.0
calif2 = 0.0
calif3 = 0.0

calif1 = float(input("Ingrese la primera calificación: "))
calif2 = float(input("Ingrese la segunda calificación: "))
calif3 = float(input("Ingrese la tercera calificación: "))

promedio = (calif1 + calif2 + calif3) / 3

if promedio >= 7:
    print("APROBADO")
else:
    print("REPROBADO")