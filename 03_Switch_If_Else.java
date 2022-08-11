/*
 * @author:Erick14911
 * 03_Switch_If_Else
 */
import java.util.*;
public class 03_Switch_If_Else{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Double califica;
        int compara;
        System.out.print("Ingresa la calificación: ");
        califica=in.nextDouble();
        
        if(califica>=6){
        compara=(int)Math.round(califica);
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