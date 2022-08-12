/*
* @author:Erick14911
* String.toLowerCase(), String.toUpperCase(), 
* String.concat(,), String.lenght()
* Clase: Representacion abstracta de un conjunto de objetos
* OBJETO:instancia de una clase;
* IDENTIFICADOR-identificador, 
* ESTADO-valor de sus atributos
*/
import java.util.*;

public class Strings_08{
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);  
    String msj,msjL;
    char c;
    int contador=0;
    System.out.print("Introduce un mensaje: ");
    msj=in.nextLine();
    msjL=msj.toLowerCase();
    System.out.print("Busca un caracter: ");
    c=in.next().charAt(0);
    
    for(int i=0;i<msj.length();i++){
        if (c==msjL.charAt(i))
        contador++;
        else continue;
    }
    System.out.print("El caracter "+c+" se repite "+contador+" veces");

    String mensaje="Escuela de codigo Pilares";
    System.out.println(msj);
    String mayusculas=mensaje.toUpperCase();
    System.out.println(mayusculas);
    String minusculas=mensaje.toLowerCase();
    System.out.println(minusculas);
    int longitud=mensaje.length();
    System.out.println(longitud);
    String mensaje2=" Programacion Java";
    System.out .println(mensaje.concat(mensaje2));
}
}