/*
 * @author:Erick14911
 * Escuela_11
 * Clase:Califica_11 - Funcion:main - Paquete:escuela
 * 
 */
package escuela;
import escuela.Alumno_11;

import java.util.Scanner;

public class Califica_11{

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String nombre;
        double calMatematicas;
        double calHistoria;
        double calEspañol;

        System.out.println("¿Nombre?");
        nombre=in.nextLine();
        System.out.println("¿Calificacion de Matematicas?");
        calMatematicas=in.nextDouble();
        System.out.println("¿Calificacion de Español?");
        calEspañol=in.nextDouble();
        System.out.println("¿Calificacion de Historia?");
        calHistoria=in.nextDouble();

//      Declaracion de Objeto de la clase 'Alumno'
        Alumno_11 estudiante1=new Alumno_11(nombre,calMatematicas,calHistoria,calEspañol);
        estudiante1.Promedio();
        System.out.println(estudiante1.Aprueba());
     
}
}

