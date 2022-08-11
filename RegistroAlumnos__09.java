/* 
* @author:Erick14911
* Programa que pide registrar un numero determinado de alumnos y registrar su calificacion
* Al final imprime el promedio grupal
*/
import java.util.Scanner;

//Tarea1
public class RegistroAlumnos_09{
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
     Scanner in=new Scanner(System.in);
     System.out.println("¿Cuantos Alumnos registraras?  ");
     int numero=in.nextInt();   
     double nota;
     double promedio=0;
     double suma=0;
     for(int i=0;i<numero;i++){
         System.out.print(i+1+" - Alumno, nota = ");
         nota=in.nextDouble();
         suma+=nota;
         promedio=suma/numero;
        }
         System.out.println("El promedio Grupal es = "+ promedio);

  }
}
