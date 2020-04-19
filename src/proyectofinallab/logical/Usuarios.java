package proyectofinallab.logical;


public class Usuarios {
    
    private String login_usuario;
    private String pas_usuario;
    private Integer nivel_acceso;
    private String nombre_usuario;
    private String apellido_usuario;
    private String email_usuario;

    public Usuarios(String login_usuario, String pas_usuario, Integer nivel_acceso, String nombre_usuario, String apellido_usuario, String email_usuario) {
        this.login_usuario = login_usuario;
        this.pas_usuario = pas_usuario;
        this.nivel_acceso = nivel_acceso;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.email_usuario = email_usuario;
    }
    
    
    public String getLoginusu(){
        return login_usuario;
    }
    
    public void setLoginusu(String login_usuario){
        this.login_usuario = login_usuario;
    }
    
    public String getPasusu(){
        return pas_usuario;
    }
    
    public void setPasusu(String pas_usuario){
        this.pas_usuario = pas_usuario;
    }
    
    public Integer getNivelac(){
        return nivel_acceso;
    }
    
    public void setNivellac(Integer nivel_acceso){
        this.nivel_acceso = nivel_acceso;
    }
    
    public String getNombreusu(){
        return nombre_usuario;
    }
    
    public void setNombreusu(String nombre_usuario){
        this.nombre_usuario = nombre_usuario;
    }
    
    public String getApellidousu(){
        return apellido_usuario;
    }
    
    public void setApellidousu(String apellido_usuario){
        this.apellido_usuario = apellido_usuario;
    }
    
    public String getEmailusu(){
        return email_usuario;
    }
    
    public void setEmailusu(String email_usuario){
        this.email_usuario = email_usuario;
    }
    
}
