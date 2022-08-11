/*
 * @author:ERick14911
 * UsoFor_07
 */
import java.util.*;

public class UsoFor_07{
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);  

    int [] lista={1,3,5,7,11,13,17,19,23};
    int suma=0;
    int longlist=lista.length;
    float promedio;
    int max,min;
    for(int i=0;i<longlist;i++){
    suma+=lista[i];
    }
    promedio=(float)suma/(float)longlist;
    System.out.println("El promedio es: "+promedio);

    max=lista[0];
    for(int j=0;j<longlist;j++){
    if(max<lista[j])
    max=lista[j];
    }
    min=lista[0];
    for(int k=0;k<tama;k++){
    if(min>lista[k])
    min=lista[k];
    }
     System.out.println("El numero mayor es:  "+max);
     System.out.println("El numero minimo es:  "+min);
}
}