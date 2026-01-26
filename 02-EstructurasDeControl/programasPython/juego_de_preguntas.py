# Declaración de variables
q1 = ""
q2 = ""
q3 = ""

# Bienvenida
print(
    "¡Bienvenido al juego de preguntas!\n"
    "Este juego consta de 3 preguntas.\n"
    "Si contestas correctamente las 3, ganas.\n"
    "Si fallas una, el juego termina.\n"
    "¡Comencemos!\n"
)

# Pregunta 1
q1 = input("¿Es Australia más ancha que la luna? (s/n): ").lower()
if q1 == "s":  # Respuesta correcta
    print("¡Así es!\nAustralia es más ancha que la Luna, ya que el diámetro\nde Australia de este a oeste es de casi 4,000 km, mientras\nque el diámetro de la Luna es de aproximadamente 3,474 km.")

    # Pregunta 2
    q2 = input(
        "En una cámara de vacío hay un vaso lleno de\n"
        "agua, si se enciende la cámara, entonces\n"
        "¿El agua va a hervir? (s/n): "
    ).lower()

    if q2 == "s":  # Respuesta correcta
        print("¡Así es!\nAl encender la cámara de vacío, se elimina el\naire del entorno, lo que reduce drásticamente la\npresión atmosférica sobre la superficie del agua,\npor lo que esta comienza a hervir.")

        # Pregunta 3
        q3 = input("¿La Gran Muralla China es visible desde la Luna a simple vista? (s/n): ").lower()

        if q3 == "s":  # Respuesta incorrecta
            print("¡INCORRECTO! La respuesta era \"NO\"")
        else:  # Respuesta correcta
            print("¡Así es!\nEs un mito popular que ha sido desmentido por\nastronautas y científicos, ya que la muralla es\ndemasiado estrecha y se mimetiza con su entorno,\naunque podría ser discernible con equipos ópticos\npotentes desde la órbita terrestre baja.")
            print("🎉ㅤ¡FELICIDADES, HAS GANADO EL JUEGO!ㅤ🎉")
    else:
        print("\n¡INCORRECTO! La respuesta correcta era \"SÍ\"\n")
else:
    print("\n¡INCORRECTO! La respuesta correcta era \"SÍ\"\n")
