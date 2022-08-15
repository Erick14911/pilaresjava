package mx.operaciones;

public class Operaciones{
    //Atributos
    private final double PI=3.1416;
    
    //Constructor
    public Operaciones(){

    }
    public double suma(double a,double b){
        return a + b;
    }
    public double resta(double a,double b){
        return a - b;
    }
    public double multiplica(double a,double b){
        return a * b;
    }
    public double divide(double a,double b){
 //       try{
        return a / b;
    }
 //       catch{}
    public double exp(double a, double b){
        a=(int)a;
        b=(int)b;
        return Math.pow(a,b);
    }
    public double raiz(double a){
        return Math.sqrt(a);
    }
    public double modulo(double a, double b){
        return a%b;
    }
    
}