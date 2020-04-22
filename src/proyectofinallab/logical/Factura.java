package proyectofinallab.logical;

import java.io.Serializable;
import java.util.Date;


public class Factura implements Serializable{
    
    private Integer numfact;
    private Integer idvendedor;
    private Integer idcliente;
    private Date fechafactura;
    private Date fechapago;
    private boolean formapago;
    private double valorfactura;
    private double valorsaldofactura;
    private double itbisfactura;
    private boolean statusfactura;
    
    /*
    private Integer secuencia;
    private String idproducto;
    private float cantidad;
    
    private Integer idcobro;
    
    */

    public Factura(Integer numfact, Integer idvendedor, Integer idcliente, Date fechafactura,
            Date fechapago, boolean formapago, double valorfactura, double valorsaldofactura,
            double itbisfactura, boolean statusfactura/*Integer secuencia, String idproducto, float cantidad, Integer idcobro*/) {
        this.numfact = numfact;
        this.idvendedor = idvendedor;
        this.idcliente = idcliente;
        this.fechafactura = fechafactura;
        this.fechapago = fechapago;
        this.formapago = formapago;
        this.valorfactura = valorfactura;
        this.valorsaldofactura = valorsaldofactura;
        this.itbisfactura = itbisfactura;
        this.statusfactura = statusfactura;
        
        /*
        this.secuencia = secuencia;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        
        this.idcobro = idcobro;
        */
    }


    
    public Integer getNumfact(){
        return numfact;
    }
    
    public void setNumfact(Integer numfact){
        this.numfact = numfact;
    }
    
    public Integer getIdvendedor(){
        return idvendedor;
    }
    
    public void setIdvendedor(Integer idvendedor){
        this.idvendedor = idvendedor;
    }
    
    public Integer getIdcliente(){
        return idcliente;
    }
    
    public void setIdcliente(Integer idcliente){
        this.idcliente = idcliente;
    }
    
    public Date getFechafactura(){
        return fechafactura;
    }
    
    public void setFechafactura(Date fechafactura){
        this.fechafactura = fechafactura;
    }
    
    public Date getFechapago(){
        return fechapago;
    }
    
    public void setFechapago(Date fechapago){
        this.fechapago = fechapago;
    }
    
    public boolean getFormapago(){
        return formapago;
    }
    
    public void setFormapago (boolean formapago){
        this.formapago = formapago;
    }
    
    public double getValorfactura(){
        return valorfactura;
    }
    
    public void setValorfactura(double valorfactura){
        this.valorfactura = valorfactura;
    }
    
    public double getValorsaldofactura(){
        return valorsaldofactura;
    }
    
    public void setValorsaldofactura(double valorsaldofactura){
        this.valorsaldofactura = valorsaldofactura;
    }
    
    public double getIbisfactura(){
        return itbisfactura;
    }
    
    public void setItbisfactura(double itbisfactura){
        this.itbisfactura = itbisfactura;
    }
    
    public boolean getStatusfactura(){
        return statusfactura;
    }
    
    public void setStatusfactura(boolean statusfactura){
        this.statusfactura = statusfactura;
    }
    
    /*
    public Integer getSecuencia(){
        return secuencia;
    }
    
    public void setSecuencia(Integer secuencia){
        this.secuencia = secuencia;
    }
    
    public String getIdproducto(){
        return idproducto;
    }
    
    public void setIdproducto(String idproducto){
        this.idproducto = idproducto;
    }
    
    public float getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(float cantidad){
        this.cantidad = cantidad;
    }
    
    public Integer getIdcobro(){
        return idcobro;
    }
    
    public void setIdcobro(Integer idcobro){
        this.idcobro = idcobro;
    }
    */
    
}
