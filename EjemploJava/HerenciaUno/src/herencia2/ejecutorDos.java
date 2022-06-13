/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class ejecutorDos {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        e.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();
        System.out.println("Ingrese nombre del Estudiante");
        estudiante.establecerNombresEstudiante(e.nextLine());
        System.out.println("Ingrese apellido del Estudiante");
        estudiante.establecerApellidoEstudiante(e.nextLine());
        System.out.println("Ingrese identificacion del Estudiante");
        estudiante.establecerIdentificacionEstudiante(e.nextLine());
        System.out.println("Ingrese la edad del estudiante");
        estudiante.establecerEdadEstudiante(e.nextInt());
        System.out.println("Ingrese el costo del credito del estudiante");
        estudiante.establecerCostoCredito(e.nextDouble());
        System.out.println("Ingrese el numero de asignaturas del estudiante");
        estudiante.establecerNumeroCreditos(e.nextInt());
        estudiante.calcularMatriculaPresencial();
        System.out.println("");
        System.out.printf("%s\n", estudiante);
    }

}
