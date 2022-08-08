import java.util.*;
public class Basico3{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("Ingresa la calificación: ");
        Double califica=in.nextDouble();
        int compara=(int)Math.round(califica);
        if(compara>=6){
        switch(compara){
            case 10:System.out.print("Mencion Honorifica");                          
            break;
            case 9:System.out.print("Sobresaliente");                            
            break;
            case 8:System.out.print("Notable");                            
            break;
            case 7:System.out.print("Satisfactorio");                             
            break;
            case 6:System.out.print("Aprovatorio");                             
            break;
        }
        }
        else 
        System.out.print("Reprovado"); 
}
}