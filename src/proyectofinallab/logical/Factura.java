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

    public Factura(Integer numfact, Integer idvendedor, Date fechafactura, Date fechapago, boolean formapago, double valorfactura, double valorsaldofactura, double itbisfactura, boolean statusfactura) {
        this.numfact = numfact;
        this.idvendedor = idvendedor;
        this.fechafactura = fechafactura;
        this.fechapago = fechapago;
        this.formapago = formapago;
        this.valorfactura = valorfactura;
        this.valorsaldofactura = valorsaldofactura;
        this.itbisfactura = itbisfactura;
        this.statusfactura = statusfactura;
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
    
}
