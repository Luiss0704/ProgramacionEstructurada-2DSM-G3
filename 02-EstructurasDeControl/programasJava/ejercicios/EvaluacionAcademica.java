package mx.edu.uttt.estructurasdecontrol;
import javax.swing.JOptionPane;

public class EvaluacionAcademica {
    public static void main(String[] args) {
        // Declaración de variables
        double calif1 = 0, calif2 = 0, califProyecto = 0, promedio = 0;
        int resp = 1, nAlumnos = 0, i = 0;
        String salida = "", estatus = "", mensAd = "";


        //  Repetir el programa con base en la elección del usuario
        do {
            JOptionPane.showMessageDialog(null, "¡Bienvenid@ al programa de evaluación!", "Bienvenid@", JOptionPane.INFORMATION_MESSAGE);
            nAlumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos alumnos desea evaluar?", "Alumnos", JOptionPane.QUESTION_MESSAGE));
            //  Validar cantidad de alumnos
            if (nAlumnos > 0) {
                JOptionPane.showMessageDialog(null, "Las calificaciones deben ingresarse en el formato de 0 a 100", "¡ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);

                //  Ciclo para repetir el número de alumnos
                for (i = 1; i <= nAlumnos; i++) {
                    promedio = 0;

                    //  Repetir la entrada de la calificación 1
                    do {
                        calif1 = 0;
                        calif1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificación del primer parcial:   ", "Alumno " + i, JOptionPane.QUESTION_MESSAGE));
                        //  Validar calificación 1
                        if (calif1 >= 0 && calif1 <= 100) {

                            //  Repetir la entrada de la calificación 2
                            do {
                                calif2 = 0;
                                calif2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificación del segundo parcial:   ", "Alumno " + i, JOptionPane.QUESTION_MESSAGE));
                                //  Validar calificación 1
                                if (calif2 >= 0 && calif2 <= 100) {

                                    //  Repetir la entrada de la calificación del proyecto final
                                    do {
                                        califProyecto = 0;
                                        califProyecto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificación del proyecto final:   ", "Alumno " + i, JOptionPane.QUESTION_MESSAGE));
                                        //  Validar calificación del proyecto final
                                        if (califProyecto >= 0 && califProyecto <= 100) {
                                            promedio = (calif1 + calif2 + califProyecto) / 3;

                                            //  APROBADO
                                            if (promedio >= 70) {
                                                estatus = "APROBADO";
                                                //  Validar si se muestra mensaje adicional
                                                if (promedio >= 95) {
                                                    mensAd = "Alumno con excelencia académica";
                                                    salida += "Alumno " + i + ":\n" + String.format("Promedio final: %.2f", promedio) + "\nEstatus: " + estatus + "\nMensaje adicional: " + mensAd + "\n\n";
                                                } else {
                                                    salida += "Alumno " + i + ":\n" + String.format("Promedio final: %.2f", promedio) + "\nEstatus: " + estatus + "\n\n";
                                                }


                                            //  EXTRAORDINARIO
                                            } else if (promedio >= 50) {
                                                estatus = "EXTRAORDINARIO";
                                                salida += "Alumno " + i + ":\n" + String.format("Promedio final: %.2f", promedio) + "\nEstatus: " + estatus + "\n\n";


                                            //  REPROBADO
                                            } else if (promedio < 50) {
                                                estatus = "REPROBADO";
                                                salida += "Alumno " + i + ":\n" + String.format("Promedio final: %.2f", promedio) + "\nEstatus: " + estatus + "\n\n";
                                            }


                                        } else {        //  Mensaje de error al pedir la calificación del proyecto final
                                            JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 100", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } while (califProyecto > 100 || califProyecto < 0);


                                } else {        //  Mensaje de error al pedir la segunda calificación
                                    JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 100", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } while (calif2 > 100 || calif2 < 0);


                        } else {        //  Mensaje de error al pedir la primera calificación
                            JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 100", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (calif1 > 100 || calif1 < 0);
                }

                JOptionPane.showMessageDialog(null, salida, "Resultados", JOptionPane.INFORMATION_MESSAGE);
                salida = "";


            } else {        //  Mensaje de error al pedir la cantidad de alumnos
                JOptionPane.showMessageDialog(null, "El número de alumnos debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            }


            resp = JOptionPane.showConfirmDialog(null, "¿Desea repetir el programa?", "Evaluaciones", JOptionPane.YES_NO_OPTION);
        } while (resp == 0);
    }
}