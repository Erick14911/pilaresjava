/*
 * @author:Erick14911
 *  4 Ejercicios
 */
import java.util.*;
public class Basico05 {
    public static void main(String args[]) {
//Imprime todos los numeros del 1-100 divisibles entre 2 y3
        Scanner in=new Scanner(System.in);
        System.out.println("Numeros 1-100 divisibles entre 2 y 3: ");
        for(int i=1;i<=100;i++){
           double a=i%2;
           double b=i%3;
            if(a==0 || b==0)
            System.out.println(i);
            
  
        }
   

    }
}

import java.util.*;
public class Basico05 {
    public static void main(String args[]) {
//Resive una frecuencia e indica la más cercana
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa una frecuencia: ");
        double frecuencia=in.nextDouble();
//0-875-1075-1350- ...       
         if(frecuencia<=875)
         System.out.println("La estación sintonizada es la A");
         else if(frecuencia<=1075)
         System.out.println("La estación sintonizada es la B");
         else if(frecuencia<=1350)
         System.out.println("La estación sintonizada es la C");
         else System.out.println("La estación sintonizada es la D");
         
    }
}

import java.util.*;
public class Basico05 {
    public static void main(String args[]) {
//Programa que pide registrar un numero determinado de alumnos y registrar su calificacion
//Al final imprime el promedio grupal
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


import java.util.*;
public class Basico05 {
    public static void main(String args[]) {
//Suma numeros positivos y se detiene si se introduce un nemro negativo
    Scanner in=new Scanner(System.in);
    System.out.println("Suma numeros Positivos ");
    double sum=0;
    double num=0;    
    do{
          sum+=num;
          num=in.nextDouble();
         
        }while(num>=0);
   System.out.println("La suma fue:  "+sum);

    }
}