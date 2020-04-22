
package proyectofinallab.logical;

import java.io.Serializable;
import java.util.Date;


public class Cobrofactura implements Serializable{
    
    private Integer idcobro;
    private Integer idcliente;
    private Integer numfact;
    private double valorpagofact;
    private Date fechacobro;

    public Cobrofactura(Integer idcobro, Integer idcliente, Integer numfact, double valorpagofact, Date fechacobro) {
        this.idcobro = idcobro;
        this.idcliente = idcliente;
        this.numfact = numfact;
        this.valorpagofact = valorpagofact;
        this.fechacobro = fechacobro;
    }
    
    public Integer getIdcobro(){
        return idcobro;
    }
    
    public void setIdcobro(Integer idcobro){
        this.idcobro = idcobro;
    }
    
    public Integer getIdcliente(){
        return idcliente;
    }
    
    public void setIdcliente (Integer idcliente){
        this.idcliente = idcliente;
    }
    
    public Integer getNumfact(){
        return numfact;
    }
    
    public void setNumfact(Integer numfact){
        this.numfact = numfact;
    }
    
    public double getValorpagofact(){
        return valorpagofact;
    }
    
    public void setValorpagofact(double valorpagofact){
        this.valorpagofact = valorpagofact;
    }
    
    public Date getFechacobro(){
        return fechacobro;
    }
    
    public void setFechacobro(Date fechacobro){
        this.fechacobro = fechacobro;
    }
}
