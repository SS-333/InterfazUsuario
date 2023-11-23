package paseos;

import javax.swing.table.DefaultTableModel;

public class Paseos extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    
    public Paseos() {
        initComponents();
        setTitle("PASEOS");
        setSize(1400,800);
        setLocationRelativeTo(null);
        setResizable(false);
        
        String fila1 [] = {"CUPOS DISPONIBLES","TIPO","ORIGEN","DESTINO","FECHA","SALIDA","LLEGADA","VEHICULO","PRECIO UNITARIO","ID"};
        
        tabla.setColumnIdentifiers(fila1);
        TablaPaseos.setModel(tabla);
        tabla.addRow(new Object[]{8,"Fiesta", "Empresa de turismo","Palmas","2023-11-25","10:00","16:00","La Feliz","$300.000",1});
        tabla.addRow(new Object[]{3,"Normal","Terminal del norte","Sabaneta","2023-11-26","08:30","14:30","La Rapida","280.000",2});
        tabla.addRow(new Object[]{8,"Fiesta","Terminal del sur","Parque norte","2023-11-27","15:00","20:30","La Divertida","$350.000",3});
        tabla.addRow(new Object[]{2,"Normal","Empresa de turismo","Itagui","2023-11-28","09:30","15:00","El Rapido y Seguro","$320.000",4});
        tabla.addRow(new Object[]{5,"Fiesta","Terminal del sur","Rionegro","2023-11-29","14:00","19:30","La Aventurera","$280.000",5});
        tabla.addRow(new Object[]{5,"Fiesta","Terminal del norte","Hacienda Napoles","2023-11-30","11:30","17:30","La Alegre y Veloz","$380.000",6});
        tabla.addRow(new Object[]{5,"Normal","Terminal del sur","Marinilla","2023-12-01","13:45","19:30","El Rapido y Silencioso","$310.000",7});
        tabla.addRow(new Object[]{5,"Normal","Terminal del sur","Envigado","2023-12-04","09:00","15:00","El Rapido y Seguro","$300.000",8});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        btnQuinceañeras = new javax.swing.JButton();
        btnEncuestas = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPaseos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASEOS");

        btnPerfil.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnPerfil.setText("PERFIL");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnQuinceañeras.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnQuinceañeras.setText("QUINCEAÑERAS");
        btnQuinceañeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuinceañerasActionPerformed(evt);
            }
        });

        btnEncuestas.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnEncuestas.setText("ENCUESTAS");
        btnEncuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncuestasActionPerformed(evt);
            }
        });

        btnReservar.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnReservar.setText("RESERVAR");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnComprar.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        TablaPaseos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        TablaPaseos.setAutoCreateRowSorter(true);
        TablaPaseos.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        TablaPaseos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        TablaPaseos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaPaseos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaPaseos.setRowHeight(40);
        TablaPaseos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(TablaPaseos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuinceañeras)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEncuestas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(585, 585, 585)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerfil)
                    .addComponent(btnQuinceañeras)
                    .addComponent(btnEncuestas))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnReservar))
                .addGap(41, 41, 41))
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

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        Perfil perfil = new Perfil();
        perfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        ComprarTiquete comprar = new ComprarTiquete();
        comprar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnQuinceañerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuinceañerasActionPerformed
        PaseosQuinceañeras quinceañeras = new PaseosQuinceañeras();
        quinceañeras.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnQuinceañerasActionPerformed

    private void btnEncuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncuestasActionPerformed
        Encuestas encuestas = new Encuestas();
        encuestas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEncuestasActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        ReservarTiquete reservar = new ReservarTiquete();
        reservar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReservarActionPerformed

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
            java.util.logging.Logger.getLogger(Paseos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paseos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paseos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paseos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paseos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPaseos;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEncuestas;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnQuinceañeras;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
