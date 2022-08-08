//Integer.parseInt("20"), Double.parseDouble(""), String.valueOf(10)
//String.valueOf(10),"string".charAt(0)
import java.util.Scanner;

public class Libro {
    public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       System.out.println("Proporciona el nombre:");
       var nombre=in.nextLine();
       System.out.println("Proporciona el Id:");
       var id=Integer.parseInt(in.nextLine());
       System.out.println("Proporciona el precio:");
       var precio=Double.parseDouble(in.nextLine());
       System.out.println("Proporciona el envio gratuito");
       var envioGratuito=in.nextLine();
       System.out.println(nombre+" #"+id);
       System.out.println("Precio: $"+precio);
       System.out.println("Envio Gratuito: "+envioGratuito);
       
  }
}
