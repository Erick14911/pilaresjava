/*Programa Principal. Trabaja con cuatro clases
 https://mariocelis.com/java/herencia-y-polimorfismo/#Herencia-y-Polimorfismo-en-Java*/
package clientes;

import java.util.Scanner;
import clientes.Cliente;
import clientes.Vehiculo;
import clientes.RentaVehiculo;

public class Registro {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String nombre;
    String apellido;
    String telefono;
    String marca;
    String modelo;
    int dias;
    
    /*3 coment
    System.out.println("¿Cual es tu nombre?");
    nombre = in.nextLine();
    System.out.println("¿Cual es tu apellido?");
    apellido = in.nextLine();
    System.out.println("¿Cual es tu telefono?");
    telefono = in.nextLine();                                              */
    System.out.println("¿Que marca buscas?");
    marca = in.nextLine();
    System.out.println("¿Que modelo buscas?");
    modelo = in.nextLine();
    /*System.out.println("¿Cuantos días lo requieres?");
    dias = in.nextInt();
    Cliente persona1 = new Cliente(nombre, apellido, telefono);   */
    Vehiculo coche2 = new Vehiculo();
    Vehiculo coche1 = new Vehiculo(marca, modelo, "Rojo", true);
    Turismo tour1=new Turismo(22,"autobus","volvo","2010","rojo",true);
   /*RentaVehiculo renta1=new RentaVehiculo(persona1,coche1,dias);
      
    System.out.println(renta1.getcliente().getnombre()+" El monto es: ");
    System.out.println(renta1.getcosto());                                               */
    System.out.println("Datos coche1: " );
     System.out.println(coche1.obtenDatos());
     System.out.println("\nDatos coche2: " );
    System.out.println(coche2.obtenDatos());
     System.out.println("\nDatos tour1: " );
    System.out.println(tour1.obtenDatos());
  }
}
