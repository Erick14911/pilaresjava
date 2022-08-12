package clientes;
public class Turismo extends Vehiculo{
   private int cantidadPasajeros;
   private String categoria;
/*Constructor*/
public Turismo(int cantidadPasajeros,String categoria,  String marca,String modelo,String color,  boolean disponible){
super(marca,modelo,color,disponible);
this.cantidadPasajeros=cantidadPasajeros;
this.categoria=categoria;
} 
/*Geters and Seters*/
    public int getCantidadPasajeros(){
    return this.cantidadPasajeros;}
    public void setCantidadPasajeros(int cantidadPasajeros){
    this.cantidadPasajeros=cantidadPasajeros;}
    public String getCategoria(){
    return this.categoria;}
    public void setCategoria(String categoria){
    this.categoria=categoria;}
/*Metodos*/
    public String obtenDatos(){
    String atributos=super.obtenDatos()+", No. Pasajeros "+getCantidadPasajeros()+", Categoria "+getCategoria();
    return atributos; 
    }
} 
