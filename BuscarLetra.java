/* */
import java.util.Scanner;

public class BuscarLetra{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /*String msj;
        char c;
        int contador=0;
        System.out.print("Introduce un mensaje: ");
        msj=in.nextLine();
        String msjL=msj.toLowerCase();
        System.out.print("Busca un caracter: ");
        c=in.next().charAt(0);
        
        for(int i=0;i<msj.length();i++){
            if (c==msjL.charAt(i))
            contador++;
            else continue;
        }*/
        String nombre;
        int edad;
        int numchar;
        System.out.println("Ingresa tu nombre: ");
        nombre=in.nextLine();
        numchar=nombre.length();
        
        System.out.println("Ingresa tu edad: ");
        edad=in.nextInt();
        if (edad<18) 
        System.out.println("Tu nombre es "+nombre+" tienes "+edad+" años y eres menor de edad");
        else  System.out.println("Tu nombre es "+nombre+" tienes ”+edad+” años y eres meyor de edad");
        System.out.println("Tu nombre tiene "+numchar+" caracteres" );
    }}
