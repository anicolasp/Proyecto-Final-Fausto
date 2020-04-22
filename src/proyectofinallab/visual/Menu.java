/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinallab.visual;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinallab.logical.ClaseLogicaPrincipal;
import proyectofinallab.logical.Clientes;
import proyectofinallab.logical.Usuarios;
import proyectofinallab.visual.MantUsuario;

/**
 *
 * @author nicol
 */
public class Menu extends javax.swing.JFrame {
    
    public ClaseLogicaPrincipal principal;
    public Usuarios u;

    /**
     * Creates new form Menu
     */
    public Menu(ClaseLogicaPrincipal p, Usuarios usuario) throws IOException, ClassNotFoundException {
        this.principal = p;
        this.u = usuario;
        
        
       // this.principal.loadData();
    
        initComponents();
    }

    Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Mantenimientos = new javax.swing.JMenu();
        mantusuario = new javax.swing.JMenuItem();
        mantclientes = new javax.swing.JMenuItem();
        mantvendedor = new javax.swing.JMenuItem();
        mantproductos = new javax.swing.JMenuItem();
        Movimientos = new javax.swing.JMenu();
        movfactura = new javax.swing.JMenuItem();
        entradaproductos = new javax.swing.JMenuItem();
        salidaproductos = new javax.swing.JMenuItem();
        movcobrofact = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        consulclient = new javax.swing.JMenuItem();
        consultvend = new javax.swing.JMenuItem();
        ConsultaDeProductos = new javax.swing.JMenuItem();
        consulfact = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nicol\\Desktop\\Uni 2-2019-2020\\Programacion 2\\Lab Programacion 2\\img4-610x381.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        Salir.setText("Guardar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        File.add(Salir);

        jMenuItem6.setText("Guardar y Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        File.add(jMenuItem6);

        jMenuBar1.add(File);

        Mantenimientos.setText("Mantenimientos");

        mantusuario.setText("De Usuario");
        mantusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantusuarioActionPerformed(evt);
            }
        });
        Mantenimientos.add(mantusuario);

        mantclientes.setText("De Clientes");
        mantclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantclientesActionPerformed(evt);
            }
        });
        Mantenimientos.add(mantclientes);

        mantvendedor.setText("De Vendedor");
        mantvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantvendedorActionPerformed(evt);
            }
        });
        Mantenimientos.add(mantvendedor);

        mantproductos.setText("De Productos");
        mantproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantproductosActionPerformed(evt);
            }
        });
        Mantenimientos.add(mantproductos);

        jMenuBar1.add(Mantenimientos);

        Movimientos.setText("Movimientos");

        movfactura.setText("De Factura");
        movfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movfacturaActionPerformed(evt);
            }
        });
        Movimientos.add(movfactura);

        entradaproductos.setText("Entrada de porductos");
        entradaproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaproductosActionPerformed(evt);
            }
        });
        Movimientos.add(entradaproductos);

        salidaproductos.setText("Salida de productos");
        salidaproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaproductosActionPerformed(evt);
            }
        });
        Movimientos.add(salidaproductos);

        movcobrofact.setText("Cobro Factura");
        movcobrofact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movcobrofactActionPerformed(evt);
            }
        });
        Movimientos.add(movcobrofact);

        jMenuBar1.add(Movimientos);

        Consultas.setText("Consultas");
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });

        consulclient.setText("De Clientes");
        consulclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulclientActionPerformed(evt);
            }
        });
        Consultas.add(consulclient);

        consultvend.setText("De Vendedores");
        consultvend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultvendActionPerformed(evt);
            }
        });
        Consultas.add(consultvend);

        ConsultaDeProductos.setText("De Productos");
        ConsultaDeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaDeProductosActionPerformed(evt);
            }
        });
        Consultas.add(ConsultaDeProductos);

        consulfact.setText("De Facturas");
        consulfact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulfactActionPerformed(evt);
            }
        });
        Consultas.add(consulfact);

        jMenuItem5.setText("De Cobros de Factura");
        Consultas.add(jMenuItem5);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        
        
    }//GEN-LAST:event_FileActionPerformed

    private void mantusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantusuarioActionPerformed
         
            MantUsuario Info = new MantUsuario(this.principal,u);
            Info.setVisible(true);
            Info.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_mantusuarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        try {
            principal.saveData();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SalirActionPerformed

    private void mantclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantclientesActionPerformed
        MantClientes Info = new MantClientes(this.principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_mantclientesActionPerformed

    private void mantvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantvendedorActionPerformed
        MantDeVendedor Info = new MantDeVendedor(this.principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_mantvendedorActionPerformed

    private void mantproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantproductosActionPerformed
        MantProductos Info = new MantProductos(this.principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_mantproductosActionPerformed

    private void movfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movfacturaActionPerformed
        MovFact Info = new MovFact(this.principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_movfacturaActionPerformed

    private void movcobrofactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movcobrofactActionPerformed
        MovCobroFac Info = new MovCobroFac();
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_movcobrofactActionPerformed

    private void entradaproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaproductosActionPerformed
        MovEntradaProduc Info = new MovEntradaProduc();
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_entradaproductosActionPerformed

    private void salidaproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaproductosActionPerformed
        MovSalidaPro Info = new MovSalidaPro();
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_salidaproductosActionPerformed

    private void consulclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulclientActionPerformed
        ConsultaClientes Info = new ConsultaClientes(principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_consulclientActionPerformed

    private void consultvendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultvendActionPerformed
        ConsultaVendedores Info = new ConsultaVendedores(principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultvendActionPerformed

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed

    }//GEN-LAST:event_ConsultasActionPerformed

    private void ConsultaDeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaDeProductosActionPerformed
        ConsultaDeProductos Info = new ConsultaDeProductos(principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_ConsultaDeProductosActionPerformed

    private void consulfactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulfactActionPerformed
        ConsultaFacturas Info = new ConsultaFacturas(principal);
        Info.setVisible(true);
        Info.setLocationRelativeTo(null);
    }//GEN-LAST:event_consulfactActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {        
            principal.saveData();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                //new Menu().setVisible(true);
      
                ClaseLogicaPrincipal p = ClaseLogicaPrincipal.getInstance();
                
                Menu obj = null;
                obj.setTitle("Menu");
                obj.setLocationRelativeTo(null); //para centrar el panel
                obj.setVisible(true);
             
                   
                 
                    obj.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        try{
                            p.saveData();
                        }catch (IOException e1){
                            e1.printStackTrace();
                            
                        }
                        System.exit(0);
                    
                    }
                });
                    
            
                
                
                
                
        
                
             
              
                
                
            }
        });
    }
  
               

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsultaDeProductos;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Mantenimientos;
    private javax.swing.JMenu Movimientos;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem consulclient;
    private javax.swing.JMenuItem consulfact;
    private javax.swing.JMenuItem consultvend;
    private javax.swing.JMenuItem entradaproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JMenuItem mantclientes;
    private javax.swing.JMenuItem mantproductos;
    private javax.swing.JMenuItem mantusuario;
    private javax.swing.JMenuItem mantvendedor;
    private javax.swing.JMenuItem movcobrofact;
    private javax.swing.JMenuItem movfactura;
    private javax.swing.JMenuItem salidaproductos;
    // End of variables declaration//GEN-END:variables
}
