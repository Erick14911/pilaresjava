/*https://techvidvan.com/tutorials/packages-in-java/*/
package clientes;
import java.util.*;
public class Vehiculo{
    private String marca;
    private String modelo;
    private String color;
    private float costo;
    private boolean disponible;
/*Constructor*/
    public Vehiculo(String marca,String modelo, String color,boolean disponible){
    this.marca=marca;
    this.modelo=modelo;
    this.color=color;
    this.disponible=disponible;
   }
/*Constructor2*/
    public Vehiculo(){
    this.marca="Sin registrar ";
    this.modelo="No en existencia";
    this.color=" ";
    this.disponible=false;
   }
/*Geters and Seters*/
    public String getMarca(){
    return this.marca;}
    public void setMarca(String marca){
    this.marca=marca;}
    public String getModelo(){
    return this.modelo;}
    public void setModelo(String modelo){
    this.modelo=modelo;}
    public String getColor(){
    return this.color;}
    public boolean getDisponible(){
    return this.disponible;}
/*Metodos*/
   public String obtenDatos(){
     String atributos;
     atributos="Marca:  "+getMarca()+", Modelo: "+getModelo()+",  Color: "+getColor();
     return atributos;
     } 
}

