/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinallab.visual;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinallab.logical.ClaseLogicaPrincipal;
import proyectofinallab.logical.Clientes;
import proyectofinallab.logical.Usuarios;



public class MantClientes extends javax.swing.JFrame {
    
    private ClaseLogicaPrincipal principal;
    private Clientes clientes;

    /**
     * Creates new form MantClientes
     * @param principal
     */
    public MantClientes(ClaseLogicaPrincipal principal) {
        this.principal = principal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        codclient = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechanac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        limcred = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        catclient = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensaje.setEditable(false);
        mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo del cliente:");

        codclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codclientActionPerformed(evt);
            }
        });
        codclient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codclientKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codclientKeyReleased(evt);
            }
        });

        jLabel2.setText("Nombres: ");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Direccion: ");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Correo:");

        jLabel8.setText("Categoria:");

        jLabel9.setText("Balance:");

        balance.setEditable(false);

        jLabel10.setText("Limite de credito:");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codclient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombres)
                                    .addComponent(apellidos)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                    .addComponent(direccion)
                                    .addComponent(correo))
                                .addComponent(catclient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(limcred, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(catclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(limcred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(jButton1)
                    .addComponent(Salir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

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


        
    public void limpiar(){
        apellidos.setText("");
        balance.setText("");
        codclient.setText("");
        correo.setText("");
        direccion.setText("");
        fechanac.setText("");
        limcred.setText("");
        nombres.setText("");
        telefono.setText("");
        catclient.setText("");
        mensaje.setText("");
        
    }
    int cont =0;
    public void validar() {
        
        
        if (codclient.getText().equals("")){cont++;}
        if (apellidos.getText().equals("")){cont++; }
        if (correo.getText().equals("")){ cont++;}
        if (direccion.getText().equals("")){cont++; }
        if (fechanac.getText().equals("")){cont++; }
        if (limcred.getText().equals("")){cont++; }
        if (nombres.getText().equals("")){cont++; }
        if (telefono.getText().equals("")){cont++; }
        if (catclient.getText().equals("")){cont++; }

    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        validar();
      
      
        if (cont !=0 ){
            JOptionPane.showMessageDialog(null, "Todavia hay campos obligatorios vacios");
        }
        else{
              if(mensaje.getText().equalsIgnoreCase("Creando")){
                Integer id = Integer.valueOf(codclient.getText());
                String nombre = nombres.getText();
                String apellido = apellidos.getText();
                String fechan = fechanac.getText();
                String tel = telefono.getText();
                String direc = direccion.getText();
                String email = correo.getText();
                Integer cat = Integer.valueOf(catclient.getText());
                double limcre = Double.valueOf(limcred.getText());
                double balance = 0;

                Date date1;
                try {
                    date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fechan);
                    Clientes F = new Clientes(id, nombre, apellido, direc, date1, tel, email, cat, balance, limcre);
                    principal.insertClientes(F);
                    JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    System.out.print(principal.getMisClientes().size());
                    

                } catch (ParseException ex) {
                    Logger.getLogger(MantClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
              }else if(mensaje.getText().equalsIgnoreCase("Modificando")){
                   
                Clientes aux = principal.clienteByID(Integer.valueOf(codclient.getText()));
                aux.setNombrecliente(nombres.getText());
                aux.setApellidoscliente(apellidos.getText());
                String fechana = fechanac.getText();
                Date date12;
                try {
                    date12 = new SimpleDateFormat("dd/MM/yyyy").parse(fechana);
                    aux.setFechaNaci(date12);
                } catch (ParseException ex) {
                    Logger.getLogger(MantClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
                aux.setTelefonocliente(telefono.getText());
                aux.setDireccioncliente(direccion.getText());
                aux.setCorreocliente(correo.getText());
                aux.setCategoriacliente(Integer.valueOf(catclient.getText()));
                aux.setLimiteCredito(Double.valueOf(limcred.getText()));
                JOptionPane.showMessageDialog(null, "El cliente se modifico", "Información", JOptionPane.INFORMATION_MESSAGE);
                limpiar();

        
            
              }
        }
            
            
       
        

    }//GEN-LAST:event_guardarActionPerformed

    private void codclientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codclientKeyPressed
 
    }//GEN-LAST:event_codclientKeyPressed

    private void codclientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codclientKeyReleased
       buscar(Integer.valueOf(codclient.getText()));
    }//GEN-LAST:event_codclientKeyReleased

    private void codclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codclientActionPerformed

    private void mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void buscar(Integer id){
        Clientes c = principal.clienteByID(id);
        
          
         if (c == null) {
            mensaje.setText("Creando");
            apellidos.setText("");
            balance.setText("");
            correo.setText("");
            direccion.setText("");
            fechanac.setText("");
            limcred.setText("");
            nombres.setText("");
            telefono.setText("");
            catclient.setText("");
             
        } else {
            mensaje.setText("Modificando");
            nombres.setText(c.getNombrecliente());
            apellidos.setText(c.getApellidoscliente());
            telefono.setText(c.getTelefonocliente());
            direccion.setText(c.getDireccioncliente());
            correo.setText(c.getCorreocliente());
            catclient.setText(String.valueOf(c.getCategoriacliente()));
            limcred.setText(String.valueOf(c.getLimiteCredito()));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            balance.setText(Double.valueOf(c.getBalancecliente()).toString());
            fechanac.setText(sdf.format(c.getFechaNaci()));
            
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(MantClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField catclient;
    private javax.swing.JTextField codclient;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fechanac;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField limcred;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
