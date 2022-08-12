/*
 * @author:Erick14911
 * Escuela_11
 * Clase:Uso_Clases_11 - Funcion:main - Paquete:escuela
 * 
 * Clase: Representacion abstracta de un conjunto de objetos
 * OBJETO:instancia de una clase;
 * IDENTIFICADOR-identificador, 
 * ESTADO-valor de sus atributos 
 * PRIVATE-Uso solo en la clase
 * PROTECTED-Uso solo en el paquete
 * CONTRUCTOR:inicializa el estado del objeto
 * METODOS:funciones del objeto
 * HERENCIA: hija extends padre
 * SUPER:
 *      Constructor:super();
 *      Metodo:     super.metodo();
 *      Atributo:   super.atributo;
 */
package escuela;
import escuela.Alumno_11;

import java.util.Scanner;

public class Uso_Clases_11{

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

