package proyectofinallab.logical;


public class Vendedor {
    
    private Integer idvendedor;
    private String nombrevendedor;
    private String apellidosvendedor;
    private double porcentaje_venta;
    private double valor_ganadoventa;

    public Vendedor(Integer idvendedor, String nombrevendedor, String apellidosvendedor, double porcentaje_venta, double valor_ganadoventa) {
        this.idvendedor = idvendedor;
        this.nombrevendedor = nombrevendedor;
        this.apellidosvendedor = apellidosvendedor;
        this.porcentaje_venta = porcentaje_venta;
        this.valor_ganadoventa = valor_ganadoventa;
    }
    
    public Integer getIdvendedor(){
        return idvendedor;
    }
    
    public void setIdvendedor(Integer idvendedor){
        this.idvendedor = idvendedor;
    }
    
    public String getNombrevendedor(){
        return nombrevendedor;
    }
    
    public void setNombrevendedor(String nombrevendedor){
        this.nombrevendedor = nombrevendedor;
    }
    
    public String getApellidosvendedor(){
        return apellidosvendedor;
    }
    
    public void setApellidosvendedor(String apellidosvendedor){
        this.apellidosvendedor = apellidosvendedor;
    }
    
    public double getPorcentajeventa(){
        return porcentaje_venta;
    }
    
    public void setPorcentajeventa (double porcentaje_venta){
        this.porcentaje_venta = porcentaje_venta;
    }
    
    public double getValorganadoventa(){
        return valor_ganadoventa;
    }
    
    public void setValorganadoventa(double valor_ganadoventa){
        this.valor_ganadoventa = valor_ganadoventa;
    }
    
    
    
}
