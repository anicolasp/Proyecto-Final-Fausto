package proyectofinallab.logical;


import java.io.Serializable;
import java.util.Date;

public class Clientes implements Serializable{
    
    private Integer idcliente;
    private String nombrecliente;
    private String apellidoscliente;
    private String direccioncliente;
    private Date fechanacimiento;
    private String telefonocliente;
    private String correocliente;
    private Integer categoriacliente;
    private double balancecliente;
    private double limitecreditocliente;


    public Clientes(Integer idcliente, String nombrecliente, String apellidoscliente, String direccioncliente, Date fechanacimiento, String telefonocliente, String correocliente, Integer categoriacliente, double balancecliente, double limitecreditocliente) {
        this.idcliente = idcliente;
        this.nombrecliente = nombrecliente;
        this.apellidoscliente = apellidoscliente;
        this.direccioncliente = direccioncliente;
        this.fechanacimiento = fechanacimiento;
        this.telefonocliente = telefonocliente;
        this.correocliente = correocliente;
        this.categoriacliente = categoriacliente;
        this.balancecliente = 0;
        this.limitecreditocliente = limitecreditocliente;
    }
    
    
 
    
    public Integer getIdcliente(){
        return idcliente;
    }
    
    public void setIdcliente(Integer idcliente){
        this.idcliente = idcliente;
    }
    
    public String getNombrecliente(){
        return nombrecliente;
    }
    
    public void setNombrecliente(String nombrecliente){
        this.nombrecliente = nombrecliente;
    }
    
    public String getApellidoscliente(){
        return apellidoscliente;
    }
    
    public void setApellidoscliente (String apellidoscliente){
        this.apellidoscliente = apellidoscliente;
    }
    
    public String getDireccioncliente(){
        return direccioncliente;
    }
    
    public void setDireccioncliente(String direccioncliente){
        this.direccioncliente = direccioncliente;
    }
    
    public Date getFechaNaci(){
        return fechanacimiento;
    }
    
    public void setFechaNaci(Date fechanacimiento){
        this.fechanacimiento = fechanacimiento;
    }
    
    public String getTelefonocliente(){
        return telefonocliente;
    }
    
    public void setTelefonocliente(String telefonocliente){
        this.telefonocliente = telefonocliente;
    }
    
    public String getCorreocliente(){
        return correocliente;
    }
    
    public void setCorreocliente(String correocliente){
        this.correocliente = correocliente;
    }
    
    public Integer getCategoriacliente(){
        return categoriacliente;
    }
    
    public void setCategoriacliente(Integer categoriacliente){
        this.categoriacliente = categoriacliente;
    }
    
    public double getBalancecliente(){
        return balancecliente;
    }
    
    public void setBalanceCliente(double balancecliente){
        this.balancecliente = balancecliente;
    }
    
    public double getLimiteCredito(){
        return limitecreditocliente;
    }
    
    public void setLimiteCredito(double limitecreditocliente){
        this.limitecreditocliente = limitecreditocliente;
    }
}
