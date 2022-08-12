package clientes;
import java.util.*;
import clientes.Cliente;
import clientes.Vehiculo;

public class RentaVehiculo{
    private Cliente   cliente;
    private Vehiculo vehiculo;
    private int dias;
    private float costo;
/*Constructor*/
public RentaVehiculo(Cliente cliente, Vehiculo vehiculo, int dias){ 
    this.cliente=cliente;
    this.vehiculo=vehiculo;
    this.dias=dias;
    this.costo=this.dias*100;    
}    
/*Geters and Seters*/
   public Cliente getcliente(){
    return this.cliente;}    

    public Vehiculo getvehiculo(){
    return this.vehiculo;}    
 
    public int getdias(){
    return this.dias;}    
    public void setdias(int dias){
    this.dias=dias;}

    public float getcosto(){
    return this.costo;}    
}
