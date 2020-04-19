
package proyectofinallab.logical;

import java.util.Date;


public class EntradaSalidaproducto {
    
    
    private Integer num_entrasal;
    private Date fecha_entrasal;
    private boolean tipo_entrasal;

    public EntradaSalidaproducto(Integer num_entrasal, Date fecha_entrasal, boolean tipo_entrasal) {
        this.num_entrasal = num_entrasal;
        this.fecha_entrasal = fecha_entrasal;
        this.tipo_entrasal = tipo_entrasal;
    }
    
    public Integer getNumentrasal(){
        return num_entrasal;
    }
    
    public void setNumentrasal(Integer num_entrasal){
        this.num_entrasal = num_entrasal;
    }
    
    public Date getFechaentrasal(){
        return fecha_entrasal;
    }
    
    public void setFechaentrasal(Date fecha_entrasal){
        this.fecha_entrasal = fecha_entrasal;
    }
    
    public boolean getTipoentrasal(){
        return tipo_entrasal;
    }
    
    public void setTipoentrasal(boolean tipo_entrasal){
        this.tipo_entrasal = tipo_entrasal;
    }
}
