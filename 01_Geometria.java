/*
* @author:Erick14911
* Geometria
*/ 


import java.util.*;

public class 01_Geometria{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double pi=3.1416;
        System.out.println("Este programa calcula el perimetro de un circulo");
        System.out.println("Introduce el radio del circulo: ");
        double radio=in.nextDouble();
        double perimetro=radio*2*pi;
        double area=Math.pow(radio,2)*pi;
        System.out.println("Su perimetro es = "+perimetro);
        System.out.println("Su Area es = "+area); 
     
}
}