package proyectofinallab.logical;


public class Detallefactura {
    
    private Integer numfact;
    private Integer secuencia;
    private String idproducto;
    private float cantidad;
    private double precio;

    public Detallefactura(Integer numfact, Integer secuencia, String idproducto, float cantidad, double precio) {
        this.numfact = numfact;
        this.secuencia = secuencia;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Integer getNumfact(){
        return numfact;
    }
    
    public void setNumfact (Integer numfact){
        this.numfact = numfact;
    }
    
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
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
}
