
package escuela;
import escuela.Alumno;

import java.util.Scanner;

public class Califica{

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

        Alumno estudiante1=new Alumno(nombre,calMatematicas,calHistoria,calEspañol);
        estudiante1.Promedio();
        System.out.println(estudiante1.Aprueba());
     
}
}

