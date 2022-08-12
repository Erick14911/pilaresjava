/*@author: Erick14911 
* Operaciones aritmeticas   
*/ 
import java.util.*;
// Class and main
public class OperacionesAritmeticas_00{
    public static void main(String[] args){
        // Your code here!
        Scanner in=new Scanner(System.in);
       
        /*Comentario
        Compuesto*/
        int num1,num2,num3;
        String nombre="Erick",nombre2;
        double var1,var2,sum,rest,mult,div,exp,mod,raiz,raiz2;
        Boolean logico=(false);

        System.out.println("Buenos Días "+nombre+"\n"+"Este programa realiza operaciones entre dos numeros que ingreses.");
        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("\nIngresa el segundo numro: ");
        num2=in.nextInt();
        num3=num1+num2;
        System.out.print("\nIngresa un nombre: ");
        nombre2=in.nextLine();
        System.out.println("\nHola "+nom2+" tu resultado es: "+num3+" y el booleano es "+logico);

        System.out.print("Ingresa el numero A: ");
        var1=in.nextInt();
        System.out.print("Ingresa el numero B: ");
        var2=in.nextInt();
        sum=var1+var2;
        rest=var1-var2;
        mult=var1*var2;
        div=var1/var2;
        exp=Math.pow(var1,var2);
        raiz=Math.sqrt(var1);
        raiz2=Math.sqrt(var2);
        mod=var1%var2;

       
        Boolean logico2=(var1==var2);
        System.out.println("Los numeros son iguales = "+logico2);
        System.out.println(var1+" + "+var2+" = "+sum);
        System.out.println(var1+" - "+var2+" = "+rest);
        System.out.println(var1+" * "+var2+" = "+mult);
        System.out.println(var1+" / "+var2+" = "+div);
        System.out.println(var1+" ^ "+var2+" = "+exp);
        System.out.println("Raiz de "+var1+" = "+raiz);
        System.out.println("Raiz de "+var2+" = "+raiz2);
        System.out.println(var1+" % "+var2+" = "+mod);

    }
}
