package menucomida;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
        
    public int escogeTamanio(){
        
        if(optchico.isSelected())
            return 0;
        else if(optmediano.isSelected())
            return 1;
        else 
            return 2;
                
    }
    
    public int escogePlatillo(){
        
        if(optCarne.isSelected())            
            return 0;
        else if (optSincronizadas.isSelected()) 
            return 1;
        else if (optarrachera.isSelected()) 
            return 2;
        else if (optchilaquiles.isSelected()) 
            return 3;
        else if (optenmoladas.isSelected()) 
            return 4;
        else if (opthamburguesa.isSelected()) 
            return 5;
        else if (optpapas.isSelected()) 
            return 6;
        else if (optpastel.isSelected()) 
            return 7;
        else if (opttacos.isSelected()) 
            return 8;
        else //tortas
            return 9;
    }
    
    public void calcularCosto(int platillo, int tamanio){
        //cantidad = Integer.parseInt(txtcantidad.getText());
        
        total = costo[platillo][tamanio]*cantidad;
        
    }
    
    public int  devuelveCosto(){
        return total;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Platillos = new javax.swing.ButtonGroup();
        Tamanio = new javax.swing.ButtonGroup();
        PanelPlatillos = new javax.swing.JPanel();
        optchilaquiles = new javax.swing.JRadioButton();
        optenmoladas = new javax.swing.JRadioButton();
        optarrachera = new javax.swing.JRadioButton();
        opttacos = new javax.swing.JRadioButton();
        opttortas = new javax.swing.JRadioButton();
        optSincronizadas = new javax.swing.JRadioButton();
        optpastel = new javax.swing.JRadioButton();
        optCarne = new javax.swing.JRadioButton();
        opthamburguesa = new javax.swing.JRadioButton();
        optpapas = new javax.swing.JRadioButton();
        PanelTamaño = new javax.swing.JPanel();
        optchico = new javax.swing.JRadioButton();
        optmediano = new javax.swing.JRadioButton();
        optgrande = new javax.swing.JRadioButton();
        txtcantidad = new javax.swing.JTextField();
        lblcosto = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPlatillos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Platillos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        Platillos.add(optchilaquiles);
        optchilaquiles.setSelected(true);
        optchilaquiles.setText("Chilaquiles");

        Platillos.add(optenmoladas);
        optenmoladas.setText("Enmoladas");

        Platillos.add(optarrachera);
        optarrachera.setText("Arrachera");

        Platillos.add(opttacos);
        opttacos.setText("Tacos");

        Platillos.add(opttortas);
        opttortas.setText("Tortas");

        Platillos.add(optSincronizadas);
        optSincronizadas.setText("Sincronizadas");

        Platillos.add(optpastel);
        optpastel.setText("Pastel");

        Platillos.add(optCarne);
        optCarne.setText("Carne");

        Platillos.add(opthamburguesa);
        opthamburguesa.setText("Hamburguesa");

        Platillos.add(optpapas);
        optpapas.setText("Papas");

        javax.swing.GroupLayout PanelPlatillosLayout = new javax.swing.GroupLayout(PanelPlatillos);
        PanelPlatillos.setLayout(PanelPlatillosLayout);
        PanelPlatillosLayout.setHorizontalGroup(
            PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlatillosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlatillosLayout.createSequentialGroup()
                        .addComponent(optSincronizadas)
                        .addGap(2, 2, 2)
                        .addComponent(optpastel))
                    .addGroup(PanelPlatillosLayout.createSequentialGroup()
                        .addComponent(optchilaquiles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optenmoladas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlatillosLayout.createSequentialGroup()
                        .addComponent(optarrachera)
                        .addGap(18, 18, 18)
                        .addComponent(opttacos))
                    .addGroup(PanelPlatillosLayout.createSequentialGroup()
                        .addComponent(optCarne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opthamburguesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optpapas)
                    .addComponent(opttortas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPlatillosLayout.setVerticalGroup(
            PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlatillosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optchilaquiles)
                    .addComponent(optenmoladas)
                    .addComponent(optarrachera)
                    .addComponent(opttortas)
                    .addComponent(opttacos))
                .addGap(18, 18, 18)
                .addGroup(PanelPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optSincronizadas)
                    .addComponent(optpastel)
                    .addComponent(optCarne)
                    .addComponent(opthamburguesa)
                    .addComponent(optpapas))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PanelTamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)), "Tamaño", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        Tamanio.add(optchico);
        optchico.setSelected(true);
        optchico.setText("Chico");

        Tamanio.add(optmediano);
        optmediano.setText("Mediano");

        Tamanio.add(optgrande);
        optgrande.setText("Grande");

        javax.swing.GroupLayout PanelTamañoLayout = new javax.swing.GroupLayout(PanelTamaño);
        PanelTamaño.setLayout(PanelTamañoLayout);
        PanelTamañoLayout.setHorizontalGroup(
            PanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optchico)
                    .addComponent(optmediano)
                    .addComponent(optgrande))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTamañoLayout.setVerticalGroup(
            PanelTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optchico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optmediano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optgrande)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtcantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidad.setText("1");
        txtcantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)), "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblcosto.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblcosto.setForeground(new java.awt.Color(204, 0, 0));
        lblcosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcosto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Costo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTotal.setText("Calcular");
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
        });
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(PanelTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked
    }//GEN-LAST:event_btnTotalMouseClicked

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
                
        cantidad = Integer.parseInt(txtcantidad.getText());
        
        calcularCosto(escogePlatillo(), escogeTamanio());
        lblcosto.setText(""+ devuelveCosto());
        
    }//GEN-LAST:event_btnTotalActionPerformed

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

        //carne
        costo[0][0]=30;
        costo[0][1]=45;
        costo[0][2]=55;
        //sincronizadas
        costo[1][0]=15;
        costo[1][1]=20;
        costo[1][2]=25;
        //arrachera
        costo[2][0]=27;
        costo[2][1]=33;
        costo[2][2]=40;
        //chilaquiles
        costo[3][0]=15;
        costo[3][1]=25;
        costo[3][2]=30;
        //enmoladas
        costo[4][0]=15;
        costo[4][1]=25;
        costo[4][2]=35;
        //hamburguesas
        costo[5][0]=20;
        costo[5][1]=25;
        costo[5][2]=33;
        //papas
        costo[6][0]=17;
        costo[6][1]=22;
        costo[6][2]=32;
        //pastel
        costo[7][0]=18;
        costo[7][1]=23;
        costo[7][2]=28;
        //tacos
        costo[8][0]=13;
        costo[8][1]=23;
        costo[8][2]=32;
        //tortas
        costo[9][0]=15;
        costo[9][1]=18;
        costo[9][2]=25;     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    private static int [][] costo = new int[10][3];
    private static int cantidad;
    private static int total;
    //private static int numplatillo;
    private static int numtamanio;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPlatillos;
    private javax.swing.JPanel PanelTamaño;
    private javax.swing.ButtonGroup Platillos;
    private javax.swing.ButtonGroup Tamanio;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JRadioButton optCarne;
    private javax.swing.JRadioButton optSincronizadas;
    private javax.swing.JRadioButton optarrachera;
    private javax.swing.JRadioButton optchico;
    private javax.swing.JRadioButton optchilaquiles;
    private javax.swing.JRadioButton optenmoladas;
    private javax.swing.JRadioButton optgrande;
    private javax.swing.JRadioButton opthamburguesa;
    private javax.swing.JRadioButton optmediano;
    private javax.swing.JRadioButton optpapas;
    private javax.swing.JRadioButton optpastel;
    private javax.swing.JRadioButton opttacos;
    private javax.swing.JRadioButton opttortas;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
