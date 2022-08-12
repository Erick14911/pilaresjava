/*
 * @author:Erick14911
 * RecibeMascotas_12
 * Clase:RecibeMascotas_12 - Funcion:main - Paquete:estetica
 * 
 */
package estetica;

public class RecibeMascota_12{
   private String nombre_de_perro;
   private int edad;
   private String raza;
   private String tamaño;
   private String nombre_de_dueño;

/*Constructor*/
public RecibeMascota(){
this.nombre_de_perro=" ";
this.edad=0;
this.raza=" ";
this.tamaño=" ";
this.nombre_de_dueño=" "; 
}
/*Geters and Seters*/
    public String getNombre_de_perro(){
    return this.nombre_de_perro;}
    public void setNombre_de_perro(String nombre_de_perro){
    this.nombre_de_perro=nombre_de_perro;}

    public int getEdad(){
    return this.edad;}
    public void setEdad(int edad){
    this.edad=edad;}

   public String getRaza(){
   return this.raza;} 
   public void setRaza(String raza){
   this.raza=raza;}

   public String getTamaño(){
   return this.tamaño;}
   public void setTamaño(String tamaño){
   this.tamaño=tamaño;}

   public String getNombre_de_dueño(){
   return this.nombre_de_dueño;}
   public void setNombre_de_dueño(String nombre_de_dueño){
   this.nombre_de_dueño=nombre_de_dueño;}
}