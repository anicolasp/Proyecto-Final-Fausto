/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinallab.visual;

import javax.swing.JOptionPane;
import proyectofinallab.logical.ClaseLogicaPrincipal;
import proyectofinallab.logical.Vendedor;
/**
 *
 * @author nicol
 */
public class MantDeVendedor extends javax.swing.JFrame {
    private ClaseLogicaPrincipal principal;
    private Vendedor vendedor;
    /**
     * Creates new form MantDeVendedor
     * @param principal
     */
    public MantDeVendedor(ClaseLogicaPrincipal principal) {
        this.principal = principal;
        initComponents();
    }

    MantDeVendedor() {
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

        jPanel1 = new javax.swing.JPanel();
        mensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idvend = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        porvent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valganado = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Vendedores");

        mensaje.setEditable(false);
        mensaje.setBackground(new java.awt.Color(255, 255, 255));
        mensaje.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        mensaje.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Id del vendedor:");

        idvend.setBackground(new java.awt.Color(255, 255, 255));
        idvend.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        idvend.setForeground(new java.awt.Color(0, 0, 0));
        idvend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idvendKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nombres:");

        nombres.setBackground(new java.awt.Color(255, 255, 255));
        nombres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombres.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos:");

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Porcentaje de venta: ");

        porvent.setBackground(new java.awt.Color(255, 255, 255));
        porvent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        porvent.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Valor ganado:");

        valganado.setBackground(new java.awt.Color(255, 255, 255));
        valganado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        valganado.setForeground(new java.awt.Color(0, 0, 0));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(idvend, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(valganado))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(porvent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idvend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(porvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valganado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(limpiar)
                    .addComponent(salir))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar_mantVendedor();
    }//GEN-LAST:event_limpiarActionPerformed
    
    public void limpiar_mantVendedor(){
        apellidos.setText("");
        idvend.setText("");
        mensaje.setText("");
        nombres.setText("");
        porvent.setText("");
        valganado.setText("");
    }
    
    int cont =0;
    public void validar() {
        
        
        if (idvend.getText().equals("")){cont++;}
        if (nombres.getText().equals("")){cont++; }
        if (apellidos.getText().equals("")){cont++; }
        if (porvent.getText().equals("")){cont++; }
         

    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        validar();
        
        if (cont !=0){
            JOptionPane.showMessageDialog(null, "Todavia hay campos obligatorios vacios");
        }
        else {
            if(mensaje.getText().equals("Creando")){
                Integer idvendedores =  Integer.valueOf(idvend.getText());
                String nombre = nombres.getText();
                String apellido = apellidos.getText();
                double porcvent = Double.valueOf(porvent.getText());
                if(porcvent <= 0){
                     JOptionPane.showMessageDialog(null, "El porcentaje de venta debe ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
                mayor_porcentaje_venta(porcvent);
                double valor_ganado_venta = 0;
                
                Vendedor vendedor1 = new Vendedor(idvendedores, nombre, apellido, porcvent, valor_ganado_venta);
                principal.insertVendedor(vendedor1);
                JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
                limpiar_mantVendedor();
                System.out.print(principal.getMisVendedores().size());
                
            }else if(mensaje.getText().equalsIgnoreCase("Modificando")){
                Vendedor aux = principal.vendedorByID(Integer.valueOf(idvend.getText()));
                aux.setNombrevendedor(nombres.getText());
                aux.setApellidosvendedor(apellidos.getText());
                aux.setPorcentajeventa(Double.valueOf(porvent.getText()));
                JOptionPane.showMessageDialog(null, "El cliente se modifico", "Información", JOptionPane.INFORMATION_MESSAGE);
                limpiar_mantVendedor();
                
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void idvendKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idvendKeyReleased
        // TODO add your handling code here:
       //int i = Integer.parseInt(idvend.getText());
       buscar_vendedor(Integer.valueOf(idvend.getText()));
    }//GEN-LAST:event_idvendKeyReleased
  
    
    private void buscar_vendedor(Integer idvendedores) {
        Vendedor vendedor1 = principal.vendedorByID(idvendedores);
        if( vendedor1 == null){
            mensaje.setText("Creando");
            nombres.setText("");
            apellidos.setText("");
            porvent.setText("");
            valganado.setText("");
            
        }else{
            mensaje.setText("Modificando");
            nombres.setText(vendedor1.getNombrevendedor());
            apellidos.setText(vendedor1.getApellidosvendedor());
            porvent.setText(String.valueOf(vendedor1.getPorcentajeventa()));
            valganado.setText(String.valueOf(vendedor1.getValorganadoventa()));
        }
    }
    
    private void mayor_porcentaje_venta(double porcvent){
        if(porcvent <= 0){
            JOptionPane.showMessageDialog(null, "El valor digitado debe ser mayor que 0", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            valganado.setText("");
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
            java.util.logging.Logger.getLogger(MantDeVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantDeVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantDeVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantDeVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MantDeVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idvend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField porvent;
    private javax.swing.JButton salir;
    private javax.swing.JTextField valganado;
    // End of variables declaration//GEN-END:variables
}
