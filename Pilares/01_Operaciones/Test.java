/*
System.out.print("\033[H\033[2J");
System.out.flush();
*/
package mx.operaciones;

import java.util.Scanner;
import mx.operaciones.Operaciones;

public class Test{
    public static void main(String[] args){
        //Campos
        Scanner in=new Scanner(System.in);
        Scanner inC=new Scanner(System.in);
        double a=0,b=0,c=0;
        Operaciones op=new Operaciones();      
        char sig;
    do{ 
        if(a==0){
        System.out.print("A: ");
        a=in.nextDouble();}

        System.out.print("signo: ");
           
        sig=(char)in.next().charAt(0);
        
        switch(sig){
        case '+':System.out.print("B: ");
                 b=in.nextDouble(); 
                 a=op.suma(a,b);
                 System.out.println(a);
        break;
        case '-':System.out.print("B: ");
                 b=in.nextDouble();
                 a=op.resta(a,b);
                 System.out.println(a);
        break;
        case '*':System.out.print("B: ");
                 b=in.nextDouble();
                 a=op.multiplica(a,b);
                 System.out.println(a);
        break;
        case '/':System.out.print("B: ");
                 b=in.nextDouble();
                 a=op.divide(a,b);
                 System.out.println(a);
        break;
        case '^':System.out.print("B: ");
                 b=in.nextDouble();
                 a=op.exp(a,b);
                 System.out.println(a);
        break;
        case '$':a=op.raiz(a);
                 System.out.println(a);
        break;
        case '%':System.out.print("B: ");
                 b=in.nextDouble();
                 a=op.modulo(a,b);
                 System.out.println(a);
        break;
        case '=':System.out.println(a);
        break;
        default: System.out.println(" No valido ");
        }
    }while(sig != '=');
       
        
    }
}