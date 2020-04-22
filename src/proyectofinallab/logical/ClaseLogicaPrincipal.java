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
                if(aux.getIdproducto().equalsIgnoreCase(id)) {                
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
   
   public Usuarios usuariobyNUsuario(String nombreusuario){
        Usuarios c = null;
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<misUsuarios.size()){
            for (Usuarios aux : misUsuarios) {
                if(aux.getLoginusu().equalsIgnoreCase(nombreusuario)) {                
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
<<<<<<< HEAD
		FileOutputStream usuarios = new FileOutputStream ("Usuarios.dat");
		FileOutputStream vendedor = new FileOutputStream ("Vendedores.dat");
                
||||||| merged common ancestors
		FileOutputStream usuarios = new FileOutputStream ("Usuarios.dat");
		
=======
		FileOutputStream usuario = new FileOutputStream ("Usuarios.dat");
		
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		ObjectOutputStream clientes = new ObjectOutputStream(cliente);
<<<<<<< HEAD
                ObjectOutputStream usuario = new ObjectOutputStream(usuarios);
                ObjectOutputStream vendedores = new ObjectOutputStream(vendedor);
||||||| merged common ancestors
              //  ObjectOutputStream usuarios = new ObjectOutputStream(usuario);
=======
                ObjectOutputStream usuarios = new ObjectOutputStream(usuario);
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
		
		clientes.writeInt(misClientes.size());
<<<<<<< HEAD
                vendedores.writeInt(misVendedores.size());
            //    usuarios.writeInt(misUsuarios.size());
||||||| merged common ancestors
            //    usuarios.writeInt(misUsuarios.size());
=======
                usuarios.writeInt(misUsuarios.size());
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
			
		for (Clientes aux : misClientes) {
                    clientes.writeObject(aux);	
		}
                
<<<<<<< HEAD
               /* for (Usuarios aux : misUsuarios) {
                    usuarios.writeObject(aux);	
		}*/
||||||| merged common ancestors
               /* for (Usuarios aux : misUsuarios) {
			usuarios.writeObject(aux);	
		}*/
=======
               for (Usuarios aux : misUsuarios) {
			usuarios.writeObject(aux);	
		}
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
		for (Vendedor aux : misVendedores) {
                    vendedores.writeObject(aux);	
		}
		
		
		cliente.close();
<<<<<<< HEAD
                vendedores.close();
              //  usuario.close();
||||||| merged common ancestors
              //  usuario.close();
=======
                usuario.close();
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
		
	}
	
	public void loadData() throws IOException, ClassNotFoundException {
		
		FileInputStream cliente = new FileInputStream ("Clientes.dat");
<<<<<<< HEAD
		FileOutputStream vendedor = new FileOutputStream ("Vendedores.dat");
||||||| merged common ancestors
		
=======
		FileInputStream usuario = new FileInputStream ("Usuarios.dat");
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
		ObjectInputStream clientes = new ObjectInputStream(cliente);
<<<<<<< HEAD
                ObjectOutputStream vendedores = new ObjectOutputStream(vendedor);
		
||||||| merged common ancestors
           
		
=======
		ObjectInputStream usuarios = new ObjectInputStream(usuario);
                
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		int cantCliente = clientes.readInt();
<<<<<<< HEAD
		//int cantVendedor = vendedores.readInt();
||||||| merged common ancestors
		
=======
		int cantUsuarios = usuarios.readInt();
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
		
		
		
		for (int i = 0; i < cantCliente; i++) {
			misClientes.add((Clientes) clientes.readObject());
		}
                
                for (int i = 0; i < cantUsuarios; i++) {
			misUsuarios.add((Usuarios) usuarios.readObject());
		}
		
		/*
                for (int j = 0; j < cantVendedor; j++) {
			misVendedores.add((Vendedor) Vendedor.readObject());
		}
		*/
                
		cliente.close();
<<<<<<< HEAD
		//vendedor.close();
||||||| merged common ancestors
		
=======
                usuario.close();
		
>>>>>>> 2db526352b5e9a975c87dfe930f7efbe1e2af24a
		
	}

   
        
            
    
    
}
