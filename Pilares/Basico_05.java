/*
 * @author:Erick14911
 *  2 Ejercicios
 */

import java.util.*;
public class Basico_05 {
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