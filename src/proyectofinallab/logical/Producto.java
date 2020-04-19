package proyectofinallab.logical;


public class Producto {
    
    private String idproducto;
    private String descripcionproducto;
    private double precioproducto;
    private double costoproducto;
    private float existenciaproducto;
    private boolean itbisproducto;

    public Producto(String idproducto, String descripcionproducto, double precioproducto, double costoproducto, float existenciaproducto, boolean itbisproducto) {
        this.idproducto = idproducto;
        this.descripcionproducto = descripcionproducto;
        this.precioproducto = precioproducto;
        this.costoproducto = costoproducto;
        this.existenciaproducto = existenciaproducto;
        this.itbisproducto = itbisproducto;
    }
    
    
    public String getIdproducto(){
        return idproducto;
    }
    
    public void setIdproducto(String idproducto){
        this.idproducto = idproducto;
    }
    
    public String getDescripcionproducto(){
        return descripcionproducto;
    }
    
    public void setDescripcionproducto(String descripcionproducto){
        this.descripcionproducto = descripcionproducto;
    }
    
    public double getPrecioproducto(){
        return precioproducto;
    }
    
    public void setPrecioproducto(double precioproducto){
        this.precioproducto = precioproducto;
    }
    
    public double getCostoproducto(){
        return costoproducto;
    }
    
    public void setCostoproducto(double costoproducto){
        this.costoproducto = costoproducto;
    }
    
    public float getExistenciaproducto(){
        return existenciaproducto;
    }
    
    public void setExistenciaproducto(float existenciaproducto){
        this.existenciaproducto = existenciaproducto;
    }
    
    public boolean getItbisproducto(){
        return itbisproducto;
    }
    
    public void setItbisproducto(boolean itbisproducto){
        this.itbisproducto = itbisproducto;
    }
    
}
