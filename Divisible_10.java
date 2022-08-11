/* 
 * @author:Erick14911
 * imprime todos los numeros del 1-100 divisibles entre 2 y3
*/
import java.util.Scanner;

public class Divisible_10{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Numeros 1-100 divisibles entre 2 y 3: ");
        for(int i=1;i<=100;i++){
           double a=i%2;
           double b=i%3;
            if(a==0 || b==0)
            System.out.println(i);
            
  
        }     

    }
}
