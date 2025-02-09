package dialogue;

import java.awt.LayoutManager;

public class FenTableFacture extends javax.swing.JFrame {

    public FenTableFacture() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLab_Imprimer = new javax.swing.JLabel();
        jLab_Aperçu = new javax.swing.JLabel();
        jLab_Exporter = new javax.swing.JLabel();
        jLab_Supprimer = new javax.swing.JLabel();
        jLab_Retour = new javax.swing.JLabel();
        jLab_TitreFacture = new javax.swing.JLabel();
        jLab_Recherche = new javax.swing.JLabel();
        jTxT_Recherche = new javax.swing.JTextField();
        jBTN_CalculeTotal = new javax.swing.JButton();
        jTxT_Total = new javax.swing.JTextField();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 412));

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 85, 742, 400));

        jLab_Imprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/imprimer.png"))); // NOI18N
        jLab_Imprimer.setText("Imprimer");
        getContentPane().add(jLab_Imprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLab_Aperçu.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Aperçu.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/apercu.png"))); // NOI18N
        jLab_Aperçu.setText("Aperçu");
        jLab_Aperçu.setToolTipText("");
        getContentPane().add(jLab_Aperçu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLab_Exporter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Exporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/exporter2.png"))); // NOI18N
        jLab_Exporter.setText("Exporter");
        jLab_Exporter.setToolTipText("");
        getContentPane().add(jLab_Exporter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLab_Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/supprimer.png"))); // NOI18N
        jLab_Supprimer.setText("Supprimer");
        jLab_Supprimer.setToolTipText("");
        getContentPane().add(jLab_Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLab_Retour.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/retour.png"))); // NOI18N
        jLab_Retour.setText("Retour");
        jLab_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_RetourMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLab_TitreFacture.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLab_TitreFacture.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/odt.png"))); // NOI18N
        jLab_TitreFacture.setText("Gestion des factures");
        jLab_TitreFacture.setToolTipText("");
        getContentPane().add(jLab_TitreFacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLab_Recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/chercheAssiste.png"))); // NOI18N
        jLab_Recherche.setText("Rechercher une facture");
        jLab_Recherche.setToolTipText("");
        getContentPane().add(jLab_Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 180, -1));
        getContentPane().add(jTxT_Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 140, 30));

        jBTN_CalculeTotal.setText("Total");
        jBTN_CalculeTotal.setToolTipText("");
        getContentPane().add(jBTN_CalculeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jTxT_Total.setEditable(false);
        jTxT_Total.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTxT_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxT_Total.setFocusable(false);
        getContentPane().add(jTxT_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 120, 30));

        jLab_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/fondGeneral.jpg"))); // NOI18N
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1000, 710));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1017)/2, (screenSize.height-591)/2, 1017, 591);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_RetourMouseClicked
        dispose();
    }//GEN-LAST:event_jLab_RetourMouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

    }//GEN-LAST:event_jTableMouseClicked

    // constructeur
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Minus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;




                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenTableFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FenTableFacture().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTN_CalculeTotal;
    private javax.swing.JLabel jLab_Aperçu;
    private javax.swing.JLabel jLab_Exporter;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Imprimer;
    private javax.swing.JLabel jLab_Recherche;
    private javax.swing.JLabel jLab_Retour;
    private javax.swing.JLabel jLab_Supprimer;
    private javax.swing.JLabel jLab_TitreFacture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxT_Recherche;
    private javax.swing.JTextField jTxT_Total;
    // End of variables declaration//GEN-END:variables
}
