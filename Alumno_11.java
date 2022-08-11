/*
 * @author:Erick14911
 * Escuela_11
 * Clase:Alumno_11 - Paquete:escuela
 * 
 */
package escuela;
public class Alumno_11{
    String nombre;
    double calMatematicas;
    double calHistoria;
    double calEspañol;
    double promedio;

/*Constructor*/
public Alumno(String nombre,double calMatematicas,double calHistoria,double calEspañol ){
    this.nombre=nombre;
    this.calMatematicas=calMatematicas;
    this.calHistoria=calHistoria;
    this.calEspañol=calEspañol;
    this.promedio=0;
}
/*Geters and Seters*/
    public String getNombre(){
        return this.nombre;}
    public void setNombre(String nombre){
        this.nombre=nombre;}

    public double getCalMatematicas(){
        return this.calMatematicas;}
    public void setCalMatematicas(double calificaMate){
        this.calMatematicas=calificaMate;}

    public double getCalEspañol(){
        return this.calEspañol;}
    public void setCalEspañol(double calificaEsp){
        this.calEspañol=calificaEsp;}

    public double getCalHistoria(){
        return this.calHistoria;}
    public void setCalHistoria(double calificaHistory){
        this.calHistoria=calificaHistory;}

/*Metodos*/
    public void Promedio(){
        
        this.promedio=(getCalMatematicas()+getCalHistoria()+getCalEspañol())/3;
      /*  return promedio;*/
    }

    public String Aprueba(){
        String mensaje;
        if(this.promedio<6){
            mensaje=this.nombre+" promedio "+this.promedio+" esta ¡REPROBADO!";
             return mensaje;}
        else{
            mensaje=this.nombre+" promedio "+this.promedio+" esta ¡APROBADO!";
             return mensaje;}
    }
}  







