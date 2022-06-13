/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class ejecutorTres {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
        aplellidos
            cedula = entrada.nextLine()
        edad
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        Scanner e = new Scanner(System.in);
        e.useLocale(Locale.US);
        System.out.println("Ingrese 1 para crear un estudiante presencial"
                + "2 para un estudiante a distancia");
        int opcion = e.nextInt();
        e.nextLine();
        if ((opcion != 1) && (opcion != 2)) {
            System.out.println("Error, opción no válida.");
        } else {
            System.out.println("Ingrese nombre del estudiante");
            String nombre = e.nextLine();
            System.out.println("Ingrese apellido del estudiante");
            String apellido = e.nextLine();
            System.out.println("Ingrese cedula del estudiante");
            String cedula = e.nextLine();
            System.out.println("Ingrese edad del estudiante");
            int edad = e.nextInt();

            if (opcion == 1) {
                EstudiantePresencial estudiante = new EstudiantePresencial();
                estudiante.establecerNombresEstudiante(nombre);
                estudiante.establecerApellidoEstudiante(apellido);
                estudiante.establecerIdentificacionEstudiante(cedula);
                estudiante.establecerEdadEstudiante(edad);
                System.out.println("Ingrese el costo del credito del estudiante");
                estudiante.establecerCostoCredito(e.nextDouble());
                System.out.println("Ingrese el numero de creditos del estudiante");
                estudiante.establecerNumeroCreditos(e.nextInt());
                estudiante.calcularMatriculaPresencial();
                System.out.println(estudiante);
            }
            if (opcion == 2) {
                EstudianteDistancia estudiante = new EstudianteDistancia();
                estudiante.establecerNombresEstudiante(nombre);
                estudiante.establecerApellidoEstudiante(apellido);
                estudiante.establecerIdentificacionEstudiante(cedula);
                estudiante.establecerEdadEstudiante(edad);
                System.out.println("Ingrese el costo de la asignatura del estudiante");
                estudiante.establecerCostoAsignatura(e.nextDouble());
                System.out.println("Ingrese el numero de asignaturas del estudiante");
                estudiante.establecerNumeroAsginaturas(e.nextInt());
                estudiante.calcularMatriculaDistancia();
                System.out.println(estudiante);
            }
        }
    }

}
