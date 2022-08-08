import java.util.*;

public class Basico4{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Cuenta Fibonacci hasta el elemento: ");
        int elemento=in.nextInt();
        int a,b,c;
        a=0;
        b=1;
        c=0;
        for(int i=1;i<=elemento;i++){
           c=a+b;
           System.out.print(c+", ");
           b=a;
           a=c;
        }
}
}


