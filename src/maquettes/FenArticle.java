package maquettes;

import java.awt.LayoutManager;

public class FenArticle extends javax.swing.JFrame {

    public FenArticle() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLab_Ajouter = new javax.swing.JLabel();
        jLab_Rechercher = new javax.swing.JLabel();
        jLab_Modifier = new javax.swing.JLabel();
        jLab_Supprimer = new javax.swing.JLabel();
        jLab_Aperçu = new javax.swing.JLabel();
        jLab_Imprimer = new javax.swing.JLabel();
        jLab_Exporter = new javax.swing.JLabel();
        jLab_Retour = new javax.swing.JLabel();
        jLabTitreClient = new javax.swing.JLabel();
        jLab_SousTitre = new javax.swing.JLabel();
        jLab_Trier = new javax.swing.JLabel();
        jCmb_Trier = new javax.swing.JComboBox();
        jLab_Code = new javax.swing.JLabel();
        jLab_Designation = new javax.swing.JLabel();
        jLab_Quantite = new javax.swing.JLabel();
        jTxt_Code = new javax.swing.JTextField();
        jTxt_Designation = new javax.swing.JTextField();
        jTxt_Quantite = new javax.swing.JTextField();
        jLab_CodeCategorie = new javax.swing.JLabel();
        jLab_PU = new javax.swing.JLabel();
        jTxt_CodeCategorie = new javax.swing.JTextField();
        jTxt_PU = new javax.swing.JTextField();
        jBtn_Annuler = new javax.swing.JButton();
        jBtn_Ajouter = new javax.swing.JButton();
        jBtn_Effacer = new javax.swing.JButton();
        jBtn_Modifier = new javax.swing.JButton();
        jLab_Recherche = new javax.swing.JLabel();
        jTXt_Recherche = new javax.swing.JTextField();
        jLab_fond_module = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 412));

        jTable.setCellSelectionEnabled(true);
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 742, 135));

        jLab_Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajouter.png")));
        jLab_Ajouter.setText("Ajouter");
        jLab_Ajouter.setEnabled(false);
        jLab_Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLab_AjouterMousePressed(evt);
            }
        });
        getContentPane().add(jLab_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLab_Rechercher.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Rechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/chercher.png"))); // NOI18N
        jLab_Rechercher.setText("Rechercher");
        jLab_Rechercher.setEnabled(false);
        getContentPane().add(jLab_Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLab_Modifier.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/modifier.png"))); // NOI18N
        jLab_Modifier.setText("Modifier");
        jLab_Modifier.setEnabled(false);
        getContentPane().add(jLab_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLab_Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/supprimer3.png"))); // NOI18N
        jLab_Supprimer.setText("Supprimer");
        getContentPane().add(jLab_Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLab_Aperçu.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Aperçu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/apercu2.png"))); // NOI18N
        jLab_Aperçu.setText("Aperçu");
        getContentPane().add(jLab_Aperçu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLab_Imprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imprimer.png")));
        jLab_Imprimer.setText("Imprimer");
        getContentPane().add(jLab_Imprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLab_Exporter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Exporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/exporter.png"))); // NOI18N
        jLab_Exporter.setText("Exporter");
        getContentPane().add(jLab_Exporter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLab_Retour.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/retour.png"))); // NOI18N
        jLab_Retour.setText("Menu principal");
        jLab_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_RetourMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabTitreClient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabTitreClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database.png")));
        jLabTitreClient.setText("Gestion des articles");
        jLabTitreClient.setToolTipText("");
        getContentPane().add(jLabTitreClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLab_SousTitre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_SousTitre.setText("A j o u t,  m o d i f i c a t i o n,  su p p r e s s i o n,  c o n s u l t a t i o n   e t   i m p r e s s i o n");
        getContentPane().add(jLab_SousTitre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLab_Trier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/trier.png"))); // NOI18N
        jLab_Trier.setText("Trier");
        getContentPane().add(jLab_Trier, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 100, -1));

        jCmb_Trier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Code catégorie", "Désignation", "QTE", "PU" }));
        getContentPane().add(jCmb_Trier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 130, -1));

        jLab_Code.setText("Code");
        getContentPane().add(jLab_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, -1));

        jLab_Designation.setText("Désignation");
        getContentPane().add(jLab_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 90, -1));

        jLab_Quantite.setText("Quantité");
        getContentPane().add(jLab_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 90, -1));
        getContentPane().add(jTxt_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, -1));
        getContentPane().add(jTxt_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 600, -1));

        jTxt_Quantite.setText("0");
        getContentPane().add(jTxt_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, -1));

        jLab_CodeCategorie.setText("Code catégorie");
        getContentPane().add(jLab_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 110, -1));

        jLab_PU.setText("Prix unitaire");
        getContentPane().add(jLab_PU, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 80, -1));

        jTxt_CodeCategorie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxt_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 80, -1));

        jTxt_PU.setText("0");
        getContentPane().add(jTxt_PU, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 80, -1));

        jBtn_Annuler.setText("Annuler");
        getContentPane().add(jBtn_Annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 110, 40));

        jBtn_Ajouter.setText("Ajouter");
        getContentPane().add(jBtn_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 110, 40));

        jBtn_Effacer.setText("Effacer");
        getContentPane().add(jBtn_Effacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 110, 40));

        jBtn_Modifier.setText("Modifier");
        getContentPane().add(jBtn_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 110, 40));

        jLab_Recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/chercheAssiste.png"))); // NOI18N
        jLab_Recherche.setText("Rechercher");
        getContentPane().add(jLab_Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 110, -1));

        jTXt_Recherche.setSelectionEnd(11);
        jTXt_Recherche.setSelectionStart(11);
        getContentPane().add(jTXt_Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 190, -1));

        jLab_fond_module.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion/fondModule.png"))); // NOI18N
        getContentPane().add(jLab_fond_module, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 750, 290));

        jLab_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondGeneral.jpg")));
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1000, 710));

        setSize(new java.awt.Dimension(1017, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_RetourMouseClicked
        dispose();
    }//GEN-LAST:event_jLab_RetourMouseClicked

    private void jLab_AjouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_AjouterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLab_AjouterMousePressed

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMousePressed

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
            java.util.logging.Logger.getLogger(FenArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FenArticle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Ajouter;
    private javax.swing.JButton jBtn_Annuler;
    private javax.swing.JButton jBtn_Effacer;
    private javax.swing.JButton jBtn_Modifier;
    private javax.swing.JComboBox jCmb_Trier;
    private javax.swing.JLabel jLabTitreClient;
    private javax.swing.JLabel jLab_Ajouter;
    private javax.swing.JLabel jLab_Aperçu;
    private javax.swing.JLabel jLab_Code;
    private javax.swing.JLabel jLab_CodeCategorie;
    private javax.swing.JLabel jLab_Designation;
    private javax.swing.JLabel jLab_Exporter;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Imprimer;
    private javax.swing.JLabel jLab_Modifier;
    private javax.swing.JLabel jLab_PU;
    private javax.swing.JLabel jLab_Quantite;
    private javax.swing.JLabel jLab_Recherche;
    private javax.swing.JLabel jLab_Rechercher;
    private javax.swing.JLabel jLab_Retour;
    private javax.swing.JLabel jLab_SousTitre;
    private javax.swing.JLabel jLab_Supprimer;
    private javax.swing.JLabel jLab_Trier;
    private javax.swing.JLabel jLab_fond_module;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTXt_Recherche;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxt_Code;
    private javax.swing.JTextField jTxt_CodeCategorie;
    private javax.swing.JTextField jTxt_Designation;
    private javax.swing.JTextField jTxt_PU;
    private javax.swing.JTextField jTxt_Quantite;
    // End of variables declaration//GEN-END:variables
}
