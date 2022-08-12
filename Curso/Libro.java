/*
 * @author:Erick14911
 * Integer.parseInt("20"),Integer.valueOf("1991"),  ->String-Integer
 * Double.parseDouble(""),                          ->String-Double
 * Float.parseFloat(cadena);                        ->String-Float
 * Boolean.parseBoolean(cadena);Boolean.valueOf(cadena); ->String-Boolean
 *                          String.valueOf(doble)   ->Double-Sring
 * Float.toString(flotante);                        ->Float-String
 * Integer.toString(entero),String.valueOf(entero); ->Integer-String
 * Character.toString(char),                        ->Char-String
 * Boolean.toString(b);     String.valueOf(b);      ->Boolean-String
 * "string".charAt(0)
 * 
 */
import java.util.Scanner;

public class Libro {
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       System.out.println("Proporciona el nombre:");
       var nombre=in.nextLine();
       System.out.println("Proporciona el Id:");
       var id=Integer.parseInt(in.nextLine());
       System.out.println("Proporciona el precio:");
       var precio=Double.parseDouble(in.nextLine());
       System.out.println("Proporciona el envio gratuito");
       var envioGratuito=in.nextLine();
       System.out.println(nombre+" #"+id);
       System.out.println("Precio: $"+precio);
       System.out.println("Envio Gratuito: "+envioGratuito);
       
  }
}
