package clientes;
import java.util.*;
public class Cliente{
    private String nombre;
    private String apellido;
    private String telefono;
/*Constructor*/
public Cliente(String nombre,String apellido, String telefono){ 
    this.nombre=nombre;
    this.apellido=apellido;
    this.telefono=telefono;    
}    
/*Geters and Seters*/
    public String getnombre(){
    return this.nombre;}    
    public void setnombre(String nombre){
     this.nombre=nombre;}
    public String getapellido(){
    return this.apellido;}    
    public void setapellido(String apellido){
     this.apellido=apellido;}
     public String gettelefono(){
    return this.telefono;}    
    public void settelefono(String telefono){
     this.telefono=telefono;}
}
