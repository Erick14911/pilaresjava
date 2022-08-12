/*
 * @author:Erick14911
 * Estetica_12
 * Clase:Estetica_12 - Funcion:main - Paquete:estetica
 * 
 */
package estetica;

import java.util.Scanner;
import estetica.RecibeMascota;

public class Estetica_12{
   public static void main(String[] args){
   Scanner in = new Scanner(System.in);   
   RecibeMascota perro1=new RecibeMascota();

   String nombre_de_perro;
   int edad;
   String raza;
   String tamaño;
   String nombre_de_dueño;

   System.out.println("Nombre de la mascota: ");
   nombre_de_perro=in.nextLine();
   perro1.setNombre_de_perro(nombre_de_perro);
   
   System.out.println("Edad de la mascota: ");
   edad=in.nextInt();
   perro1.setEdad(edad);
   in.nextLine();  

   System.out.println("Raza de la mascota: "); 
   raza=in.nextLine();
   perro1.setRaza(raza);   

   System.out.println("Tamaño de la mascota: ");
   tamaño=in.nextLine();
   perro1.setTamaño(tamaño);

   System.out.println("Nombre del dueño: ");
   nombre_de_dueño=in.nextLine();
   perro1.setNombre_de_dueño(nombre_de_dueño);


/*Valores del Objeto perro1*/
 System.out.println(perro1.getNombre_de_perro());
 System.out.println(perro1.getEdad());
 System.out.println(perro1.getRaza());
 System.out.println(perro1.getTamaño());
 System.out.println(perro1.getNombre_de_dueño());
}
}
    
