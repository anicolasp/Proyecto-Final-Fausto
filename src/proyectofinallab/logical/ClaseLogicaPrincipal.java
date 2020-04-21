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
    private ArrayList<Producto> misProductos;
    private ArrayList<Cobrofactura> misCobros;
    private static ClaseLogicaPrincipal principal = null;
    
    public ClaseLogicaPrincipal(){
        super();
        misClientes = new ArrayList<>();
        misUsuarios = new ArrayList<>();
        misFacturas = new ArrayList<>();
        misVendedores = new ArrayList<>();
        misProductos = new ArrayList<>();
        misCobros = new ArrayList<>();
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
    
    public void setMisUsuarios(ArrayList<Usuarios> misUsuarios){
        this.misUsuarios = misUsuarios;
    }
    
    public ArrayList<Factura> getMisFacturas(){
        return misFacturas;
    }
    
    public void setMisFacturas(ArrayList<Factura> misFacturas){
        this.misFacturas = misFacturas;
    }
    
    public ArrayList<Vendedor> getMisVendedores(){
        return misVendedores;
    }
    
    public void setMisVendedores(ArrayList<Vendedor> misVendedores){
        this.misVendedores = misVendedores;
    }
    
    public ArrayList<Producto> getMisProductos(){
        return misProductos;
    }
    
    public void setMisProductos(ArrayList<Producto> misProductos){
        this.misProductos = misProductos;
    }
    
    public ArrayList<Cobrofactura> getMisCobros(){
        return misCobros;
    }
    
    public void setMisCobros(ArrayList<Cobrofactura> misCobros){
        this.misCobros = misCobros;
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
    
    public void insertVendedor (Vendedor aux){
        misVendedores.add(aux);
    }
    
    public void insertProductos (Producto aux){
        misProductos.add(aux);
    }
    
    public void insertCobros(Cobrofactura aux){
        misCobros.add(aux);
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
   
   public Usuarios usuBylogin(String login){
       Usuarios c = null;
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<misUsuarios.size()){
            for (Usuarios aux : misUsuarios) {
                if(aux.getLoginusu()== login) {
                    c = aux;
                    encontrado = true;
                }
                        i++;
            }
        }
        return c;
   }
   
   public Producto productoByID(String id){
        Producto c = null;
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<misProductos.size()){
            for (Producto aux : misProductos) {
                if(aux.getIdproducto()== id) {
                    c = aux;
                    encontrado = true;
                }
                        i++;
            }
        }
        return c;
    }
   
   public Vendedor vendedorByID(Integer id){
        Vendedor vendedor1 = null;
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<misVendedores.size()){
            for (Vendedor aux : misVendedores) {
                if(aux.getIdvendedor()== id) {
                    vendedor1 = aux;
                    encontrado = true;
                }
                        i++;
            }
        }
        return vendedor1;
    }
   
   public void saveData() throws IOException {
	
		FileOutputStream cliente = new FileOutputStream ("Clientes.dat");
		FileOutputStream usuarios = new FileOutputStream ("Usuarios.dat");
		
		ObjectOutputStream clientes = new ObjectOutputStream(cliente);
                ObjectOutputStream usuarios = new ObjectOutputStream(usuario);
		
		
		clientes.writeInt(misClientes.size());
                usuarios.writeInt(misUsuarios.size());
			
		for (Clientes aux : misClientes) {
			clientes.writeObject(aux);	
		}
                
                for (Usuarios aux : misUsuarios) {
			usuarios.writeObject(aux);	
		}
		
		
		
		
		cliente.close();
                usuario.close();
		
		
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

    public Vendedor vendedorByID(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
        
            
    
    
}
