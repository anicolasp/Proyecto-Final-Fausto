package proyectofinallab.logical;

import java.util.ArrayList;

public class ClaseLogicaPrincipal {
    
    private ArrayList<Clientes> misClientes;
    private ArrayList<Usuarios> misUsuarios;
    private ArrayList<Factura> misFacturas;
    
    public ClaseLogicaPrincipal(){
        super();
        misClientes = new ArrayList<>();
        misUsuarios = new ArrayList<>();
        misFacturas = new ArrayList<>();
    }
    
    public ArrayList<Clientes> getMisClientes(){
        return misClientes;
    }
    
    public void setMisClientes(ArrayList<Clientes> misClientes){
        this.misClientes = misClientes;
    }
    
    public ArrayList<Usuarios> getMisUsuarios(){
        return misUsuarios;
    }
    
    public void setMisUsuarios(ArrayList<Usuarios>misUsuarios){
        this.misUsuarios = misUsuarios;
    }
    
    public ArrayList<Factura> getMisFacturas(){
        return misFacturas;
    }
    
    public void setMisFacturas(ArrayList<Factura>misFacturas){
        this.misFacturas = misFacturas;
    }
    
    public void insertClientes (Clientes aux){
        misClientes.add(aux);
    }
    
    public void insertUsuarios (Usuarios aux){
        misUsuarios.add(aux);
    }
    
    public void insertFactura (Factura aux){
        misFacturas.add(aux);
    }
    
}
