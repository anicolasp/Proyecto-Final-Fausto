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
    private ArrayList<Detallefactura> misDetallesdefactura;
    private static ClaseLogicaPrincipal principal = null;

    public ClaseLogicaPrincipal() {
        super();
        misClientes = new ArrayList<>();
        misUsuarios = new ArrayList<>();
        misFacturas = new ArrayList<>();
        misVendedores = new ArrayList<>();
        misProductos = new ArrayList<>();
        misCobros = new ArrayList<>();
        misDetallesdefactura = new ArrayList<>();
    }

    public static ClaseLogicaPrincipal getInstance() {
        if (principal == null) {
            principal = new ClaseLogicaPrincipal();
        }
        return principal;

    }

    public ArrayList<Detallefactura> getMisDetallesdefactura() {
        return misDetallesdefactura;
    }

    public void setMisDetallesdefactura(ArrayList<Detallefactura> misDetallesdefactura) {
        this.misDetallesdefactura = misDetallesdefactura;
    }
    

    public ArrayList<Clientes> getMisClientes() {
        return misClientes;
    }

    public void setMisClientes(ArrayList<Clientes> misClientes) {
        this.misClientes = misClientes;
    }

    public ArrayList<Usuarios> getMisUsuarios() {
        return misUsuarios;
    }

    public void setMisUsuarios(ArrayList<Usuarios> misUsuarios) {
        this.misUsuarios = misUsuarios;
    }

    public ArrayList<Factura> getMisFacturas() {
        return misFacturas;
    }

    public void setMisFacturas(ArrayList<Factura> misFacturas) {
        this.misFacturas = misFacturas;
    }

    public ArrayList<Vendedor> getMisVendedores() {
        return misVendedores;
    }

    public void setMisVendedores(ArrayList<Vendedor> misVendedores) {
        this.misVendedores = misVendedores;
    }

    public ArrayList<Producto> getMisProductos() {
        return misProductos;
    }

    public void setMisProductos(ArrayList<Producto> misProductos) {
        this.misProductos = misProductos;
    }

    public ArrayList<Cobrofactura> getMisCobros() {
        return misCobros;
    }

    public void setMisCobros(ArrayList<Cobrofactura> misCobros) {
        this.misCobros = misCobros;
    }

    public void insertClientes(Clientes aux) {
        misClientes.add(aux);
    }

    public void insertUsuarios(Usuarios aux) {
        misUsuarios.add(aux);
    }

    public void insertFactura(Factura aux) {
        misFacturas.add(aux);
    }

    public void insertVendedor(Vendedor aux) {
        misVendedores.add(aux);
    }

    public void insertProductos(Producto aux) {
        misProductos.add(aux);
    }

    public void insertCobros(Cobrofactura aux) {
        misCobros.add(aux);
    }
    
    public void insertDetalleDeFatura(Detallefactura aux){
        misDetallesdefactura.add(aux);
    }

    public Clientes clienteByID(Integer id) {
        Clientes c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misClientes.size()) {
            for (Clientes aux : misClientes) {
                if (aux.getIdcliente().equals(id)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }

    public Usuarios usuBylogin(String login) {
        Usuarios c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misUsuarios.size()) {
            for (Usuarios aux : misUsuarios) {
                if (aux.getLoginusu().equalsIgnoreCase(login)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }


    
    public Producto productoByID(String id) {
        Producto c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misProductos.size()) {
            for (Producto aux : misProductos) {
                if (aux.getIdproducto().equalsIgnoreCase(id)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }
    
    public Detallefactura detalledefacturapornum(Integer id) {
        Detallefactura c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misDetallesdefactura.size()) {
            for (Detallefactura aux : misDetallesdefactura) {
                if (aux.getNumfact().equals(id)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }
    
    public Factura facturaporNumdeFact(Integer id) {
        Factura c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misFacturas.size()) {
            for (Factura aux : misFacturas) {
                if (aux.getNumfact().equals(id)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }

    public Vendedor vendedorByID(Integer id) {
        Vendedor vendedor1 = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misVendedores.size()) {
            for (Vendedor aux : misVendedores) {
                if (aux.getIdvendedor().equals(id)) {
                    vendedor1 = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return vendedor1;
    }

    public Usuarios usuariobyNUsuario(String nombreusuario) {
        Usuarios c = null;
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i < misUsuarios.size()) {
            for (Usuarios aux : misUsuarios) {
                if (aux.getLoginusu().equalsIgnoreCase(nombreusuario)) {
                    c = aux;
                    encontrado = true;
                }
                i++;
            }
        }
        return c;
    }

    public void saveData() throws IOException {

        FileOutputStream cliente = new FileOutputStream("Clientes.dat");
        FileOutputStream usuario = new FileOutputStream("Usuarios.dat");
        FileOutputStream vendedor = new FileOutputStream("Vendedores.dat");
        FileOutputStream producto = new FileOutputStream("Productos.dat");
        FileOutputStream factura = new FileOutputStream("Facturas.dat");
        //FileOutputStream detallefactura = new FileOutputStream("Detallefactura.dat");

        ObjectOutputStream clientes = new ObjectOutputStream(cliente);
        ObjectOutputStream usuarios = new ObjectOutputStream(usuario);
        ObjectOutputStream vendedores = new ObjectOutputStream(vendedor);
        ObjectOutputStream productos = new ObjectOutputStream(producto);
        ObjectOutputStream facturas = new ObjectOutputStream(factura);
        //ObjectOutputStream detallefactura = new ObjectOutputStream(detallefactura);
        
        clientes.writeInt(misClientes.size());
        usuarios.writeInt(misUsuarios.size());
        vendedores.writeInt(misVendedores.size());
        productos.writeInt(misProductos.size());
        facturas.writeInt(misFacturas.size());
       // detallefactura.writeInt(misFacturas.size());

        for (Clientes aux : misClientes) {
            clientes.writeObject(aux);
        }

        for (Usuarios aux : misUsuarios) {
            usuarios.writeObject(aux);
        }

        for (Vendedor aux : misVendedores) {
            vendedores.writeObject(aux);
        }
        for (Producto aux : misProductos) {
            productos.writeObject(aux);
        }
         for (Factura aux : misFacturas) {
            facturas.writeObject(aux);
        }
         /*for (Detallefactura aux : misDetallesdefactura) {
            facturas.writeObject(aux);
        }*/
         
        

        cliente.close();
        vendedores.close();
        usuario.close();
        producto.close();
        factura.close();
        //detallefactura.close();

    }

    public void loadData() throws IOException, ClassNotFoundException {

        FileInputStream cliente = new FileInputStream("Clientes.dat");
        FileInputStream usuario = new FileInputStream("Usuarios.dat");
        FileInputStream vendedor = new FileInputStream("Vendedores.dat");
        FileInputStream producto = new FileInputStream("Productos.dat");
        FileInputStream factura = new FileInputStream("Facturas.dat");
      //  FileInputStream detallefactura = new FileInputStream("detallefaturas.dat");
       
        ObjectInputStream clientes = new ObjectInputStream(cliente);
        ObjectInputStream usuarios = new ObjectInputStream(usuario);
        ObjectInputStream vendedores = new ObjectInputStream(vendedor);
        ObjectInputStream productos = new ObjectInputStream(producto);
        ObjectInputStream facturas = new ObjectInputStream(factura);
      //  ObjectInputStream detallefactura = new ObjectInputStream(detallefactura);

        int cantCliente = clientes.readInt();
        int cantVendedor = vendedores.readInt();
        int cantUsuarios = usuarios.readInt();
        int canProductos = productos.readInt();
        int cantFacturas = facturas.readInt();
       // int cantFacturas = detallefactura.readInt();

        for (int i = 0; i < cantCliente; i++) {
            misClientes.add((Clientes) clientes.readObject());
        }

        for (int i = 0; i < cantUsuarios; i++) {
            misUsuarios.add((Usuarios) usuarios.readObject());
        }

        for (int j = 0; j < cantVendedor; j++) {
            misVendedores.add((Vendedor) vendedores.readObject());
        }
        
       for (int j = 0; j < canProductos; j++) {
            misProductos.add((Producto) productos.readObject());
        }
       for (int j = 0; j < cantFacturas; j++) {
            misFacturas.add((Factura) facturas.readObject());
        }
       
       /*for (int j = 0; j < cantdetallefatura; j++) {
            misDetallesdefactura.add((Detellefatura) detallefactura.readObject());
        }*/

        cliente.close();
        vendedor.close();
        usuario.close();
        producto.close();
        factura.close();
       // detallefactura.close();

    }

}
