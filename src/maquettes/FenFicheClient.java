package maquettes;
import controle.modele.ModeleClient;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controle.utilitaires.GestionDates;
import entite.Client;
import java.awt.LayoutManager;
import java.awt.Container;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FenFicheClient extends javax.swing.JFrame {
    private ModeleClient leModeleClients =null; 
    private String actionDemande ="";  
    
    public FenFicheClient(ModeleClient modeleClientsTransmis, String demande) {
        leModeleClients = modeleClientsTransmis;
        actionDemande =demande;
        initComponents();
    }

    private FenFicheClient() {
    }

    public JLabel getjLabTitreClient() {
        return jLabTitreClient;
    }

    public JLabel getjLab_Action() {
        return jLab_Action;
    }

    public JTextField getjTxTCode() {
        return jTxTCode;
    }

    public JTextField getjTxT_DateCreation() {
        return jTxT_DateCreation;
    }
  
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_Action = new javax.swing.JLabel();
        jLab_Aperçu = new javax.swing.JLabel();
        jLab_Imprimer = new javax.swing.JLabel();
        jLab_Exporter = new javax.swing.JLabel();
        jLab_Retour = new javax.swing.JLabel();
        jLabTitreClient = new javax.swing.JLabel();
        jLab_SousTitre = new javax.swing.JLabel();
        jLab_Code = new javax.swing.JLabel();
        jLab_Nom = new javax.swing.JLabel();
        jLab_Adresse = new javax.swing.JLabel();
        jLab_CP = new javax.swing.JLabel();
        jLab_Telephone = new javax.swing.JLabel();
        jLab_Email = new javax.swing.JLabel();
        jLab_Remarques = new javax.swing.JLabel();
        jTxTCode = new javax.swing.JTextField();
        jTxTNom = new javax.swing.JTextField();
        jTXT_Adresse = new javax.swing.JTextField();
        jTXT_CP = new javax.swing.JTextField();
        jTXT_Telephone = new javax.swing.JTextField();
        jTXT_Email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTXA_Remarque = new javax.swing.JTextArea();
        jLab_DateCreation = new javax.swing.JLabel();
        jLab_Prenom = new javax.swing.JLabel();
        jLab_Carte = new javax.swing.JLabel();
        jTxT_DateCreation = new javax.swing.JTextField();
        jTxT_Prenom = new javax.swing.JTextField();
        jLab_Ville = new javax.swing.JLabel();
        jLab_Mobilis = new javax.swing.JLabel();
        jTXT_Ville = new javax.swing.JTextField();
        jTXT_Mobilis = new javax.swing.JTextField();
        checkBox_Carte = new java.awt.Checkbox();
        jLab_fond_module = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());
      
        jLab_Action.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Action.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/ajouter.png")));
        jLab_Action.setText("ACTION : Je vais changer...");
        jLab_Action.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ActionMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Action, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLab_Aperçu.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Aperçu.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/apercu2.png")));
        jLab_Aperçu.setText("Aperçu");
        getContentPane().add(jLab_Aperçu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLab_Imprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/imprimer.png")));
        jLab_Imprimer.setText("Imprimer");
        getContentPane().add(jLab_Imprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLab_Exporter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Exporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/exporter.png")));
        jLab_Exporter.setText("Exporter");
        getContentPane().add(jLab_Exporter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLab_Retour.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/retour.png")));
        jLab_Retour.setText("Menu Clients");
        jLab_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_RetourMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabTitreClient.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabTitreClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/clientTitre.png")));
        jLabTitreClient.setText("Je vais changer...");
        jLabTitreClient.setToolTipText("");
        getContentPane().add(jLabTitreClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLab_SousTitre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_SousTitre.setText("A j o u t,  m o d i f i c a t i o n,  su p p r e s s i o n,  c o n s u l t a t i o n   e t   i m p r e s s i o n");
        getContentPane().add(jLab_SousTitre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLab_Code.setText("Code");
        getContentPane().add(jLab_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 90, -1));

        jLab_Nom.setText("Nom");
        getContentPane().add(jLab_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, -1));

        jLab_Adresse.setText("Adresse");
        getContentPane().add(jLab_Adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, -1));

        jLab_CP.setText("Code postal");
        getContentPane().add(jLab_CP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, -1));

        jLab_Telephone.setText("Tél. fixe");
        getContentPane().add(jLab_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 80, -1));

        jLab_Email.setText("Email");
        getContentPane().add(jLab_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLab_Remarques.setText("Remarques");
        getContentPane().add(jLab_Remarques, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 80, -1));
        getContentPane().add(jTxTCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 240, -1));
        getContentPane().add(jTxTNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 240, -1));
        getContentPane().add(jTXT_Adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 600, -1));
        getContentPane().add(jTXT_CP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 240, -1));
        getContentPane().add(jTXT_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 240, -1));
        getContentPane().add(jTXT_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 240, -1));

        jTXA_Remarque.setColumns(20);
        jTXA_Remarque.setRows(5);
        jScrollPane2.setViewportView(jTXA_Remarque);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 610, 60));

        jLab_DateCreation.setText("Date création");
        getContentPane().add(jLab_DateCreation, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 80, -1));

        jLab_Prenom.setText("Prénom");
        getContentPane().add(jLab_Prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 80, -1));

        jLab_Carte.setText("Carte fidélité");
        getContentPane().add(jLab_Carte, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 80, -1));

        jTxT_DateCreation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxT_DateCreation, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 120, -1));
        getContentPane().add(jTxT_Prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 250, -1));

        jLab_Ville.setText("Ville");
        getContentPane().add(jLab_Ville, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        jLab_Mobilis.setText("Mobilis");
        getContentPane().add(jLab_Mobilis, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 50, -1));
        getContentPane().add(jTXT_Ville, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 250, -1));
        getContentPane().add(jTXT_Mobilis, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 250, -1));
        getContentPane().add(checkBox_Carte, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 20, -1));

        jLab_fond_module.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/fondModule.png")));
        getContentPane().add(jLab_fond_module, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 750, 290));

        jLab_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/fondGeneral.jpg")));
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1000, 490));

        setSize(new java.awt.Dimension(1017, 437));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_ActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ActionMouseClicked
        String vCode = jTxTCode.getText();
        String vNom =jTxTNom.getText();
        String vPrenom =jTxT_Prenom.getText();
        boolean bCarteFidele = checkBox_Carte.getState();
        String strDate = jTxT_DateCreation.getText();
        int iCarteFidele;
        if(bCarteFidele ==true){
        iCarteFidele=1;
        }else{
        iCarteFidele=0;}
        if (actionDemande.equals("Ajouter")){
        if (!vCode.equals("")){    
        }}
        if (actionDemande.equals("Ajouter")){
        if(!vCode.equals("")){
            String strDateMySQL = GestionDates.chaineDateFRversEN(strDate);
            Date dtDate = new Date();
            dtDate = GestionDates.dateJavaEnDateSQL(dtDate) ;
            Client leClient = null;
            leClient = new Client(vCode,vNom);
            boolean bCreation = false;
            bCreation = leClient.creerCRUD(vCode,vNom,vPrenom,iCarteFidele,strDateMySQL);
            if(bCreation){
            leModeleClients.creerMOD(leClient);
            }
        }   
        }
        
    }//GEN-LAST:event_jLab_ActionMouseClicked

    private void jLab_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_RetourMouseClicked
        dispose();
    }//GEN-LAST:event_jLab_RetourMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // Set the Nimbus look and feel
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
            java.util.logging.Logger.getLogger(FenFicheClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                 new FenFicheClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkBox_Carte;
    private javax.swing.JLabel jLabTitreClient;
    private javax.swing.JLabel jLab_Action;
    private javax.swing.JLabel jLab_Adresse;
    private javax.swing.JLabel jLab_Aperçu;
    private javax.swing.JLabel jLab_CP;
    private javax.swing.JLabel jLab_Carte;
    private javax.swing.JLabel jLab_Code;
    private javax.swing.JLabel jLab_DateCreation;
    private javax.swing.JLabel jLab_Email;
    private javax.swing.JLabel jLab_Exporter;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Imprimer;
    private javax.swing.JLabel jLab_Mobilis;
    private javax.swing.JLabel jLab_Nom;
    private javax.swing.JLabel jLab_Prenom;
    private javax.swing.JLabel jLab_Remarques;
    private javax.swing.JLabel jLab_Retour;
    private javax.swing.JLabel jLab_SousTitre;
    private javax.swing.JLabel jLab_Telephone;
    private javax.swing.JLabel jLab_Ville;
    private javax.swing.JLabel jLab_fond_module;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTXA_Remarque;
    private javax.swing.JTextField jTXT_Adresse;
    private javax.swing.JTextField jTXT_CP;
    private javax.swing.JTextField jTXT_Email;
    private javax.swing.JTextField jTXT_Mobilis;
    private javax.swing.JTextField jTXT_Telephone;
    private javax.swing.JTextField jTXT_Ville;
    private javax.swing.JTextField jTxTCode;
    private javax.swing.JTextField jTxTNom;
    private javax.swing.JTextField jTxT_DateCreation;
    private javax.swing.JTextField jTxT_Prenom;
    // End of variables declaration//GEN-END:variables
}
