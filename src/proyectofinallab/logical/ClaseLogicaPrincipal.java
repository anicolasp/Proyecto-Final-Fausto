package proyectofinallab.logical;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinallab.visual.MantClientes;

public class ClaseLogicaPrincipal {
    
    private ArrayList<Clientes> misClientes;
    private ArrayList<Usuarios> misUsuarios;
    private ArrayList<Factura> misFacturas;
    private ArrayList<Vendedor> misVendedores;
    private static ClaseLogicaPrincipal principal = null;
    
    public ClaseLogicaPrincipal(){
        super();
        misClientes = new ArrayList<>();
        misUsuarios = new ArrayList<>();
        misFacturas = new ArrayList<>();
    }
    
    public static ClaseLogicaPrincipal getInstance(){
        if(principal == null){
            principal = new ClaseLogicaPrincipal();
        }
        return principal;
        
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
    
   public Clientes clienteByID(Integer id){
        Clientes c = null;
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<misClientes.size()){
            for (Clientes aux : misClientes) {
                if(aux.getIdcliente() == id) {
                    c = aux;
                    encontrado = true;
                }
                        i++;
            }
        }
        return c;
    }
   
   public void saveData() throws IOException {
	
		FileOutputStream cliente = new FileOutputStream ("Clientes.dat");
		
		
		ObjectOutputStream clientes = new ObjectOutputStream(cliente);
		
		
		clientes.writeInt(misClientes.size());
			
		for (Clientes aux : misClientes) {
			clientes.writeObject(aux);
			
		}
		
		
		
		
		cliente.close();
		
		
	}
	
	public void loadData() throws IOException, ClassNotFoundException {
		
		FileInputStream cliente = new FileInputStream ("Clientes.dat");
		
		
		ObjectInputStream clientes = new ObjectInputStream(cliente);
           
		
		int cantCliente = clientes.readInt();
		
		
		
		
		
		for (int i = 0; i < cantCliente; i++) {
			misClientes.add((Clientes) clientes.readObject());
		}
		
		
		
		cliente.close();
		
		
	}
   
        
            
    
    
}
