import java.util.*;
public class Basico0{
    public static void main(String[] args){
        // Your code here!
        Scanner in=new Scanner(System.in);
        Scanner ca=new Scanner(System.in);
        /*Comentario
        Compuesto*/
        int num1,num2,num3;
        String nom="Erick",nom2;
        double var1,var2,sum,rest,mult,div,exp,mod;
        Boolean boo=(false);

        System.out.print("Buenos Días ");
        System.out.print(nom);
        System.out.print(" Este programa realiza operaciones entre dos numeros que ingreses.\n");
        System.out.println("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.println("Ingresa el segundo numro: ");
        num2=in.nextInt();
        num3=num1+num2;
        System.out.print("Ingresa un nombre: ");
        nom2=ca.nextLine();
        System.out.println("Hola "+nom2+" tu resultado es: "+num3+" y el booleano es "+boo);

        System.out.print("Ingresa el numero A: ");
        var1=in.nextInt();
        System.out.print("Ingresa el numero B: ");
        var2=in.nextInt();
        sum=var1+var2;
        rest=var1-var2;
        mult=var1*var2;
        div=var1/var2;
        exp=Math.pow(var1,var2);
        mod=var1%var2;
        //bo=boolean((var1>var2) OR (var1<var2));
        Boolean bo=(var1==var2);
        System.out.println("Los numeros son iguales = "+bo);
        System.out.println(var1+" + "+var2+" = "+sum);
        System.out.println(var1+" - "+var2+" = "+rest);
        System.out.println(var1+" * "+var2+" = "+mult);
        System.out.println(var1+" / "+var2+" = "+div);
        System.out.println(var1+" ^ "+var2+" = "+exp);
        System.out.println(var1+" % "+var2+" = "+mod);

    }
}
