
package proyectofinallab.logical;

import java.io.Serializable;


public class DetalleEntrada implements Serializable{
    
    private Integer num_entrada;
    private Integer secuencia;
    private Integer id_producto;
    private float cant_producto;
    private double costo_producto;

    public DetalleEntrada(Integer num_entrada, Integer secuencia, Integer id_producto, float cant_producto, double costo_producto) {
        this.num_entrada = num_entrada;
        this.secuencia = secuencia;
        this.id_producto = id_producto;
        this.cant_producto = cant_producto;
        this.costo_producto = costo_producto;
    }
    
    public Integer getNumentrada(){
        return num_entrada;
    }
    
    public void setNumentrada(Integer num_entrada){
        this.num_entrada = num_entrada;
    }
    
    public Integer getSecuencia (){
        return secuencia;
    }
    
    public void getSecuencia(Integer secuencia){
        this.secuencia = secuencia;
    }
    
    public Integer getIdproducto(){
        return id_producto;
    }
    
    public void setIdproducto(Integer id_producto){
        this.id_producto = id_producto;
    }
    
    public float getCantproducto(){
        return cant_producto;
    }
    
    public void setCantproducto(float cant_producto){
        this.cant_producto = cant_producto;
    }
    
    public double getCostoproducto(){
        return costo_producto;
    }
    
    public void setCostoproducto(double costo_producto){
        this.costo_producto = costo_producto;
    }
    
}
