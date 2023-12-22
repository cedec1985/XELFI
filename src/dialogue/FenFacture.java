package dialogue;

import java.awt.LayoutManager;

public class FenFacture extends javax.swing.JFrame {

    static void setjTxT_CodeArticle(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setjTxT_CodeCategorie(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setjTxT_Designation(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setjCmB_Quantite(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setjTxT_Montant(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setjTxT_NomClient(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void setCode_client(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public FenFacture() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable( );
        jLab_Fichier = new javax.swing.JLabel();
        jLab_SupprimerLigne = new javax.swing.JLabel();
        jLab_SupprimerTout = new javax.swing.JLabel();
        jLab_Retour = new javax.swing.JLabel();
        jLab_ModeReglement = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();
        jLab_BandeauFacture = new javax.swing.JLabel();
        jLab_NomClient = new javax.swing.JLabel();
        jTxT_NomClient = new javax.swing.JTextField();
        jLab_NumDocument = new javax.swing.JLabel();
        jLab_DateJour = new javax.swing.JLabel();
        jLab_BandeauHaut = new javax.swing.JLabel();
        jBTN_Articles = new javax.swing.JButton();
        jLab_CodeArticle = new javax.swing.JLabel();
        jTxT_CodeArticle = new javax.swing.JTextField();
        jLab_Quantite = new javax.swing.JLabel();
        JCmB_Quantite = new javax.swing.JComboBox();
        jCB_NumDocument = new javax.swing.JComboBox();
        jLab_Designation = new javax.swing.JLabel();
        jLab_Montant = new javax.swing.JLabel();
        jLab_CodeCategorie = new javax.swing.JLabel();
        jTxT_Designation = new javax.swing.JTextField();
        jTxT_Montant = new javax.swing.JTextField();
        jTxT_CodeCategorie = new javax.swing.JTextField();
        jBTN_Ajouter = new javax.swing.JButton();
        jBTN_Modifier = new javax.swing.JButton();
        jLab_TotalTTC = new javax.swing.JLabel();
        jLab_EtiTotalTTC = new javax.swing.JLabel();
        jBTN_Valider = new javax.swing.JButton();
        jCmB_ModeReglement = new javax.swing.JComboBox();
        jTxT_DateJour = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 412));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 742, 135));

        jLab_Fichier.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Fichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ods.png"))); // NOI18N
        jLab_Fichier.setText("Fichier des factures");
        jLab_Fichier.setToolTipText("");
        jLab_Fichier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_FichierMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Fichier, new org.netbeans.lib.awtextra.AbsoluteConstraints(60,140,-1,-1));

        jLab_SupprimerLigne.setForeground(new java.awt.Color(255, 255, 255));
        jLab_SupprimerLigne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        jLab_SupprimerLigne.setText("Supprimer une ligne");
        getContentPane().add(jLab_SupprimerLigne, new org.netbeans.lib.awtextra.AbsoluteConstraints(40,100,-1,-1));
        jLab_SupprimerLigne.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_SupprimerLigneMouseClicked(evt);
            }
        });
        jLab_SupprimerTout.setForeground(new java.awt.Color(255, 255, 255));
        jLab_SupprimerTout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        jLab_SupprimerTout.setText("Supprimer toutes les lignes");
        jLab_SupprimerTout.setToolTipText("");
        jLab_SupprimerTout.setName("");
        getContentPane().add(jLab_SupprimerTout, new org.netbeans.lib.awtextra.AbsoluteConstraints(55,125,-1,-1));

        jLab_Retour.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retour.png"))); // NOI18N
        jLab_Retour.setText("Menu principal");
        jLab_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_RetourMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(80,160,-1,-1));

        jLab_ModeReglement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carte.png"))); // NOI18N
        jLab_ModeReglement.setText("Mode de règlement");
        getContentPane().add(jLab_ModeReglement, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 140, -1));

        jLab_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondGeneral.jpg"))); // NOI18N
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 240, 710));

        jLab_BandeauFacture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barre.png"))); // NOI18N
        getContentPane().add(jLab_BandeauFacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 730, 40));

        jLab_NomClient.setText("Nom du client");
        getContentPane().add(jLab_NomClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jTxT_NomClient.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTxT_NomClient.setText("[ Cliquez ici pour sélectionner un client ]");
        getContentPane().add(jTxT_NomClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 270, -1));

        jLab_NumDocument.setText("Numéro du document");
        jLab_NumDocument.setToolTipText("");
        getContentPane().add(jLab_NumDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLab_DateJour.setText("Date du jour");
        getContentPane().add(jLab_DateJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(500,60,-1,-1));

        jLab_BandeauHaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barre.png"))); // NOI18N
        getContentPane().add(jLab_BandeauHaut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 730, 40));

        jBTN_Articles.setText("Parcourir les articles");
        getContentPane().add(jBTN_Articles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLab_CodeArticle.setText("Code");
        jLab_CodeArticle.setToolTipText("");
        getContentPane().add(jLab_CodeArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));
        getContentPane().add(jTxT_CodeArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 80, -1));

        jLab_Quantite.setText("Quantité");
        getContentPane().add(jLab_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        JCmB_Quantite.setOpaque(false);
        getContentPane().add(JCmB_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        getContentPane().add(jCB_NumDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        jLab_Designation.setText("Désignation");
        jLab_Designation.setToolTipText("");
        getContentPane().add(jLab_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLab_Montant.setText("Montant");
        getContentPane().add(jLab_Montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLab_CodeCategorie.setText("Code catégorie");
        getContentPane().add(jLab_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, -1, -1));
        getContentPane().add(jTxT_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 290, -1));
        getContentPane().add(jTxT_Montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 90, -1));
        getContentPane().add(jTxT_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 70, -1));

        jBTN_Ajouter.setText("Ajouter");
        getContentPane().add(jBTN_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, -1, -1));

        jBTN_Modifier.setText("Modifier");
        getContentPane().add(jBTN_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, -1, -1));

        jLab_TotalTTC.setText("Total : ");
        getContentPane().add(jLab_TotalTTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 120, -1));

        jLab_EtiTotalTTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etiquette.png"))); // NOI18N
        jLab_EtiTotalTTC.setToolTipText("");
        getContentPane().add(jLab_EtiTotalTTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jBTN_Valider.setText("Valider la facture");
        jBTN_Valider.setToolTipText("");
        getContentPane().add(jBTN_Valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 500, 160, -1));
        getContentPane().add(jCmB_ModeReglement, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 80, -1));

        jTxT_DateJour.setEditable(true);
        jTxT_DateJour.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTxT_DateJour.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTxT_DateJour.setFocusable(true);
        getContentPane().add(jTxT_DateJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 90, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1017)/2, (screenSize.height-591)/2, 1017, 591);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_RetourMouseClicked
        dispose();
    }//GEN-LAST:event_jLab_RetourMouseClicked

    private void jLab_FichierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_FichierMouseClicked
        FenTableFacture laFenetre = new FenTableFacture();
        laFenetre.setVisible(true);
    }//GEN-LAST:event_jLab_FichierMouseClicked

    private void jLab_SupprimerLigneMouseClicked(java.awt.event.MouseEvent evt){
    }
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
            java.util.logging.Logger.getLogger(FenFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FenFacture().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox JCmB_Quantite;
    private javax.swing.JButton jBTN_Ajouter;
    private javax.swing.JButton jBTN_Articles;
    private javax.swing.JButton jBTN_Modifier;
    private javax.swing.JButton jBTN_Valider;
    private javax.swing.JComboBox jCB_NumDocument;
    private javax.swing.JComboBox jCmB_ModeReglement;
    private javax.swing.JLabel jLab_BandeauFacture;
    private javax.swing.JLabel jLab_BandeauHaut;
    private javax.swing.JLabel jLab_CodeArticle;
    private javax.swing.JLabel jLab_CodeCategorie;
    private javax.swing.JLabel jLab_DateJour;
    private javax.swing.JLabel jLab_Designation;
    private javax.swing.JLabel jLab_EtiTotalTTC;
    private javax.swing.JLabel jLab_Fichier;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_ModeReglement;
    private javax.swing.JLabel jLab_Montant;
    private javax.swing.JLabel jLab_NomClient;
    private javax.swing.JLabel jLab_NumDocument;
    private javax.swing.JLabel jLab_Quantite;
    private javax.swing.JLabel jLab_Retour;
    private javax.swing.JLabel jLab_SupprimerLigne;
    private javax.swing.JLabel jLab_SupprimerTout;
    private javax.swing.JLabel jLab_TotalTTC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private static javax.swing.JTextField jTxT_CodeArticle;
    private static javax.swing.JTextField jTxT_CodeCategorie;
    private javax.swing.JTextField jTxT_DateJour;
    private static javax.swing.JTextField jTxT_Designation;
    private static javax.swing.JTextField jTxT_Montant;
    private static javax.swing.JTextField jTxT_NomClient;
    // End of variables declaration//GEN-END:variables
}
