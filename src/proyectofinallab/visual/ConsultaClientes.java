/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinallab.visual;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import proyectofinallab.logical.ClaseLogicaPrincipal;

/**
 *
 * @author nicol
 */
public class ConsultaClientes extends javax.swing.JFrame {
        
    private ClaseLogicaPrincipal principal;
    /**
     * Creates new form ConsultaClientes
     */
    public ConsultaClientes(ClaseLogicaPrincipal principal) {
        this.principal = principal;
        initComponents();
        loaddata();
        
          
            
            
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idsinrango = new javax.swing.JRadioButton();
        idrango = new javax.swing.JRadioButton();
        txthasta = new javax.swing.JTextField();
        txtde = new javax.swing.JTextField();
        lblde = new javax.swing.JLabel();
        lblhasta = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Direccion", "Fecha Nac.", "Telefono", "Correo", "Categoria", "Balance", "Limite Credito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Buscar Por:");

        buttonGroup1.add(idsinrango);
        idsinrango.setText("ID");
        idsinrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsinrangoActionPerformed(evt);
            }
        });

        buttonGroup1.add(idrango);
        idrango.setText("Rango ID");
        idrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idrangoActionPerformed(evt);
            }
        });

        txthasta.setEnabled(false);
        txthasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthastaActionPerformed(evt);
            }
        });
        txthasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthastaKeyReleased(evt);
            }
        });

        txtde.setEnabled(false);
        txtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeActionPerformed(evt);
            }
        });
        txtde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdeKeyReleased(evt);
            }
        });

        lblde.setText("De:");
        lblde.setEnabled(false);

        lblhasta.setText("Hasta:");
        lblhasta.setEnabled(false);

        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idsinrango, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136)
                        .addComponent(idrango, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtde, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblde))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblhasta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txthasta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblde)
                    .addComponent(lblhasta)
                    .addComponent(salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idsinrango)
                    .addComponent(idrango)
                    .addComponent(txthasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idsinrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsinrangoActionPerformed
         txtID.setEnabled(true);
         txtde.setEnabled(false);
         txthasta.setEnabled(false);
         lblde.setEnabled(false);
         lblhasta.setEnabled(false);      
         
         
    }//GEN-LAST:event_idsinrangoActionPerformed

    private void idrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idrangoActionPerformed
  txtID.setEnabled(false);
         txtde.setEnabled(true);
         txthasta.setEnabled(true);
         lblde.setEnabled(true);
         lblhasta.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_idrangoActionPerformed

    private void txthastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthastaActionPerformed

    private void txtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
        // TODO add your handling code here:
      
        Integer s = Integer.valueOf(txtID.getText());
        loaddatabyID(s);
       
          

            
        
        
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtdeKeyReleased

    private void txthastaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthastaKeyReleased
        // TODO add your handling code here:
          Integer s1 = Integer.valueOf(txtde.getText());
          Integer s2 = Integer.valueOf(txthasta.getText());
           loaddatabyRango(s1,s2);
    }//GEN-LAST:event_txthastaKeyReleased

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ConsultaClientes().setVisible(true);
            }
        });
    }
    
    public void loaddata() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < principal.getMisClientes().size(); i++) {
            Integer id = principal.getMisClientes().get(i).getIdcliente();
            String nombre = principal.getMisClientes().get(i).getNombrecliente();
            String apellidos = principal.getMisClientes().get(i).getApellidoscliente();
            String direccion = principal.getMisClientes().get(i).getDireccioncliente();
            String Fechanacimiento = principal.getMisClientes().get(i).getFechaNaci().toString();
            String telefono = principal.getMisClientes().get(i).getTelefonocliente();
            String correo = principal.getMisClientes().get(i).getCorreocliente();
            Integer categoria = principal.getMisClientes().get(i).getCategoriacliente();
            Double balance = principal.getMisClientes().get(i).getBalancecliente();
            Double limite = principal.getMisClientes().get(i).getLimiteCredito();

            Object[] data = {id, nombre, apellidos, direccion, Fechanacimiento, telefono,
                correo, categoria, balance, limite};

            model.addRow(data);

        }
    }
    
       public void loaddatabyID(int search) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < principal.getMisClientes().size(); i++) {
            if (principal.getMisClientes().get(i).getIdcliente() == search) {
                Integer id = principal.getMisClientes().get(i).getIdcliente();
                String nombre = principal.getMisClientes().get(i).getNombrecliente();
                String apellidos = principal.getMisClientes().get(i).getApellidoscliente();
                String direccion = principal.getMisClientes().get(i).getDireccioncliente();
                String Fechanacimiento = principal.getMisClientes().get(i).getFechaNaci().toString();
                String telefono = principal.getMisClientes().get(i).getTelefonocliente();
                String correo = principal.getMisClientes().get(i).getCorreocliente();
                Integer categoria = principal.getMisClientes().get(i).getCategoriacliente();
                Double balance = principal.getMisClientes().get(i).getBalancecliente();
                Double limite = principal.getMisClientes().get(i).getLimiteCredito();

                Object[] data = {id, nombre, apellidos, direccion, Fechanacimiento, telefono,
                    correo, categoria, balance, limite};

                model.addRow(data);
            }
        }
    }
       
        public void loaddatabyRango(int search1, int search2) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < principal.getMisClientes().size(); i++) {
            if (principal.getMisClientes().get(i).getIdcliente() >= search1 && principal.getMisClientes().get(i).getIdcliente() <= search2 ) {
                Integer id = principal.getMisClientes().get(i).getIdcliente();
                String nombre = principal.getMisClientes().get(i).getNombrecliente();
                String apellidos = principal.getMisClientes().get(i).getApellidoscliente();
                String direccion = principal.getMisClientes().get(i).getDireccioncliente();
                String Fechanacimiento = principal.getMisClientes().get(i).getFechaNaci().toString();
                String telefono = principal.getMisClientes().get(i).getTelefonocliente();
                String correo = principal.getMisClientes().get(i).getCorreocliente();
                Integer categoria = principal.getMisClientes().get(i).getCategoriacliente();
                Double balance = principal.getMisClientes().get(i).getBalancecliente();
                Double limite = principal.getMisClientes().get(i).getLimiteCredito();

                Object[] data = {id, nombre, apellidos, direccion, Fechanacimiento, telefono,
                    correo, categoria, balance, limite};

                model.addRow(data);
            }
        }
    }

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton idrango;
    private javax.swing.JRadioButton idsinrango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblde;
    private javax.swing.JLabel lblhasta;
    private javax.swing.JButton salir;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtde;
    private javax.swing.JTextField txthasta;
    // End of variables declaration//GEN-END:variables
}
