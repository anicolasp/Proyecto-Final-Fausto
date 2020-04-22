
package proyectofinallab.logical;

import java.io.Serializable;


public class DetalleSalida implements Serializable{
    
    private Integer num_salida;
    private Integer secuencia;
    private Integer id_producto;
    private float cant_producto;
    private double costo_producto;

    public DetalleSalida(Integer num_salida, Integer secuencia, Integer id_producto, float cant_producto, double costo_producto) {
        this.num_salida = num_salida;
        this.secuencia = secuencia;
        this.id_producto = id_producto;
        this.cant_producto = cant_producto;
        this.costo_producto = costo_producto;
    }
    
    public Integer getNumsalida(){
        return num_salida;
    }
    
    public void setNumsalida(Integer num_salida){
        this.num_salida = num_salida;
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
