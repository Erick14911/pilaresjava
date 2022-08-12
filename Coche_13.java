/*
 * @author:Erick14911
 * Clase:Coche_13 - Funcion:main - Paquete:estetica
 * 
 */
package coche;
import java.util.Scanner;
 
import coche.Vehiculo;

public class Coche_13 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String marca;
        String modelo;
        String datos;
        System.out.println("¿Que marca buscas?");
        marca=in.nextLine();
        System.out.println("¿Que modelo buscas?");
        modelo=in.nextLine();
        Vehiculo coche1=new Vehiculo(marca,modelo,"Rojo",true);
        
        System.out.println(coche1.obtenDatos());
     
        System.out.println(coche1.getDisponible());
        
        
}
}