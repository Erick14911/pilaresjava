import java.util.*;

public class Basico6{
    public static void main(String[] args){
     Scanner in=new Scanner(System.in);  
     System.out.println("Introduce un numero del 1 al 7 para conocer el día de la semana ");
     int dia=in.nextInt();

      switch(dia){
      case 1:System.out.println("Es Lunes");
      break;
      case 2:System.out.println("Es Martes");
      break;
      case 3:System.out.println("Es Miercoles");
      break;
      case 4:System.out.println("Es Jueves");
      break;
      case 5:System.out.println("Es Viernes");
      break;
      case 6:System.out.println("Es Sabado");
      break;
      case 7:System.out.println("Es Domingo");
      break;
      default:System.out.println("Numero no valido");
      }
}
}