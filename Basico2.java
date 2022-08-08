import java.util.*;
public class Basico2{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        boolean divisor=false;
        System.out.println("Introduce un numero entero: ");    
        int num=in.nextInt();
        if(num==0)
        System.out.println("El numero es nulo");
        else if(num%2==0)
        System.out.println("El numero es par"); 
        else
        System.out.println("El numero es impar"); 
        System.out.println("\n\n");
        System.out.println("Introduce un numero entero: ");
        int var1=in.nextInt();
        System.out.println("Introduce un numero entero: ");   
        int var2=in.nextInt();   
        if(var1%var2==0)
        divisor=true; 
        else
        divisor=false;
        System.out.println("El segundo numero es divisor del primero : "+divisor);
}
}