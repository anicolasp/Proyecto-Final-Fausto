/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinallab.visual;
import javax.swing.table.DefaultTableModel;
import proyectofinallab.logical.ClaseLogicaPrincipal;
/**
 *
 * @author Anthony Tineo
 */
public class ConsultaFacturas extends javax.swing.JFrame {
    private ClaseLogicaPrincipal principal;
    /**
     * Creates new form ConsultaFacturas
     */
    public ConsultaFacturas(ClaseLogicaPrincipal principal) {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFacturas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numFactura = new javax.swing.JRadioButton();
        txtNumFactura = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtRango1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtRango2 = new javax.swing.JTextField();
        lblDe = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Facturas");

        tableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num_Factuta", "Id_Vendedor", "Id_Cliente", "Fecha_Factura", "Fecha_Pago", "Forma_Pago", "Valor_Factura", "Valor_Saldo_Factura", "Itbis_Factura", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFacturas);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consulta De Facturas");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por:");

        numFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        numFactura.setText("Factura #");
        numFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFacturaActionPerformed(evt);
            }
        });

        txtNumFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumFacturaKeyReleased(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton2.setText("Rango Factura");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jToggleButton1.setText("Regresar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        txtRango2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRango2KeyReleased(evt);
            }
        });

        lblDe.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDe.setText("De:");
        lblDe.setEnabled(false);

        lblHasta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblHasta.setText("Hasta:");
        lblHasta.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRango1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDe))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHasta)
                            .addComponent(txtRango2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDe)
                            .addComponent(lblHasta))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numFactura)
                    .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2)
                    .addComponent(txtRango1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRango2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void numFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFacturaActionPerformed
        // TODO add your handling code here:
        txtNumFactura.setEnabled(true);
        txtRango1.setEnabled(false);
        txtRango2.setEnabled(false);
        lblDe.setEnabled(false);
        lblHasta.setEnabled(false);  
    }//GEN-LAST:event_numFacturaActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        txtNumFactura.setEnabled(false);
        txtRango1.setEnabled(true);
        txtRango2.setEnabled(true);
        lblDe.setEnabled(true);
        lblHasta.setEnabled(true);     
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtNumFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumFacturaKeyReleased
        // TODO add your handling code here:
        Integer s = Integer.valueOf(txtNumFactura.getText());
        loaddatabyID(s);
    }//GEN-LAST:event_txtNumFacturaKeyReleased

    private void txtRango2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRango2KeyReleased
        // TODO add your handling code here:
        Integer s1 = Integer.valueOf(txtRango1.getText());
        Integer s2 = Integer.valueOf(txtRango2.getText());
        loaddatabyRango(s1,s2);
    }//GEN-LAST:event_txtRango2KeyReleased

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
            java.util.logging.Logger.getLogger(ConsultaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ConsultaFacturas().setVisible(true);
            }
        });
    }
    
    //load data automatic
    public void loaddata() {
        DefaultTableModel model = (DefaultTableModel) tableFacturas.getModel();
        model.setRowCount(0);
        for (int i = 0; i < principal.getMisFacturas().size(); i++) {
            Integer num_Factura = principal.getMisFacturas().get(i).getNumfact();
            Integer id_Vendedor = principal.getMisFacturas().get(i).getIdvendedor();
            Integer id_Cliente = principal.getMisFacturas().get(i).getIdcliente();
            String fecha_Factura = principal.getMisFacturas().get(i).getFechafactura().toString();
            String fecha_Pago = principal.getMisFacturas().get(i).getFechapago().toString();
            Boolean forma_Pago = principal.getMisFacturas().get(i).getFormapago();
            Double valor_Factura = principal.getMisFacturas().get(i).getValorfactura();
            Double valor_Saldo_Factura = principal.getMisFacturas().get(i).getValorsaldofactura();
            Double itbis_Factura = principal.getMisFacturas().get(i).getIbisfactura();
            Boolean status = principal.getMisFacturas().get(i).getStatusfactura();

            Object[] data = {num_Factura, id_Vendedor, id_Cliente, fecha_Factura, fecha_Pago, forma_Pago,
                valor_Factura, valor_Saldo_Factura, itbis_Factura, status};

            model.addRow(data);

        }
    }
    
    //load data search
    public void loaddatabyID(int search) {
        DefaultTableModel model = (DefaultTableModel) tableFacturas.getModel();
        model.setRowCount(0);
        for (int i = 0; i < principal.getMisFacturas().size(); i++) {
            if (principal.getMisFacturas().get(i).getNumfact() == search) {
                Integer num_Factura = principal.getMisFacturas().get(i).getNumfact();
                Integer id_Vendedor = principal.getMisFacturas().get(i).getIdvendedor();
                Integer id_Cliente = principal.getMisFacturas().get(i).getIdcliente();
                String fecha_Factura = principal.getMisFacturas().get(i).getFechafactura().toString();
                String fecha_Pago = principal.getMisFacturas().get(i).getFechapago().toString();
                Boolean forma_Pago = principal.getMisFacturas().get(i).getFormapago();
                Double valor_Factura = principal.getMisFacturas().get(i).getValorfactura();
                Double valor_Saldo_Factura = principal.getMisFacturas().get(i).getValorsaldofactura();
                Double itbis_Factura = principal.getMisFacturas().get(i).getIbisfactura();
                Boolean status = principal.getMisFacturas().get(i).getStatusfactura();

                Object[] data = {num_Factura, id_Vendedor, id_Cliente, fecha_Factura, fecha_Pago, forma_Pago,
                valor_Factura, valor_Saldo_Factura, itbis_Factura, status};

                model.addRow(data);
            }
        }
    }
    
    //load data By rango
    public void loaddatabyRango(int search1, int search2) {
    DefaultTableModel model = (DefaultTableModel) tableFacturas.getModel();
    model.setRowCount(0);
        for (int i = 0; i < principal.getMisClientes().size(); i++) {
            if (principal.getMisFacturas().get(i).getNumfact() >= search1 && principal.getMisFacturas().get(i).getNumfact() <= search2 ) {
                Integer num_Factura = principal.getMisFacturas().get(i).getNumfact();
                Integer id_Vendedor = principal.getMisFacturas().get(i).getIdvendedor();
                Integer id_Cliente = principal.getMisFacturas().get(i).getIdcliente();
                String fecha_Factura = principal.getMisFacturas().get(i).getFechafactura().toString();
                String fecha_Pago = principal.getMisFacturas().get(i).getFechapago().toString();
                Boolean forma_Pago = principal.getMisFacturas().get(i).getFormapago();
                Double valor_Factura = principal.getMisFacturas().get(i).getValorfactura();
                Double valor_Saldo_Factura = principal.getMisFacturas().get(i).getValorsaldofactura();
                Double itbis_Factura = principal.getMisFacturas().get(i).getIbisfactura();
                Boolean status = principal.getMisFacturas().get(i).getStatusfactura();

                Object[] data = {num_Factura, id_Vendedor, id_Cliente, fecha_Factura, fecha_Pago, forma_Pago,
                valor_Factura, valor_Saldo_Factura, itbis_Factura, status};

                model.addRow(data);
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JRadioButton numFactura;
    private javax.swing.JTable tableFacturas;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtRango1;
    private javax.swing.JTextField txtRango2;
    // End of variables declaration//GEN-END:variables
}
