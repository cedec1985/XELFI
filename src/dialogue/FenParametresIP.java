package dialogue;

import entite.ParametresIP;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class FenParametresIP extends javax.swing.JDialog {
    public FenParametresIP(java.awt.Frame parent, boolean modal) throws IOException {
        initComponents();
        complementGUI();
        recupParametres();
    }

    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }
    public void recupParametres() throws IOException {
        ParametresIP objParametres = new ParametresIP();        
        jTxT_AdresseIP.setText(objParametres
                .getAdresseIPserveur());
        jTxT_BD.setText(objParametres.getNomBD());
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_AdresseIP = new javax.swing.JLabel();
        jTxT_AdresseIP = new javax.swing.JTextField();
        jBtn_Valider = new javax.swing.JButton();
        jLab_BD = new javax.swing.JLabel();
        jTxT_BD = new javax.swing.JTextField();
        jBtn_RAZ = new javax.swing.JButton();
        jLabel_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_AdresseIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_AdresseIP.setText("Adresse IP du serveur");
        getContentPane().add(jLab_AdresseIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 143, 32));

        jTxT_AdresseIP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTxT_AdresseIP.setToolTipText("");
        getContentPane().add(jTxT_AdresseIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 93, -1));

        jBtn_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/valider.png")));
        jBtn_Valider.setText("Valider");
        jBtn_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ValiderActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLab_BD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_BD.setText("Base de données");
        getContentPane().add(jLab_BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 126, 32));

        jTxT_BD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTxT_BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 93, -1));

        jBtn_RAZ.setText("RAZ");
        jBtn_RAZ.setToolTipText("");
        jBtn_RAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RAZActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_RAZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, -1));

        jLabel_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reseau.png")));
        jLabel_Fond.setToolTipText("");
        getContentPane().add(jLabel_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ValiderActionPerformed
        String repertoire = System.getProperty("user.dir");
        repertoire = repertoire + "/Reseau/";
        File fichierIP = new File(repertoire
                + "ParametresConnexion.txt");
        if (fichierIP.exists()) {
            fichierIP.delete();
        }     
        try {            
            fichierIP.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FenParametresIP
                    .class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        String adresseIP = jTxT_AdresseIP.getText();
        String nomBD = jTxT_BD.getText();
        PrintWriter sortie;
        try {
            sortie = new PrintWriter(fichierIP);
            sortie.println(adresseIP);
            sortie.println(nomBD);
            sortie.close();
            JOptionPane.showMessageDialog(null, 
                    "Relancez l'application"
                    + " avec les nouveaux paramètres.",
                    "INFO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(FenParametresIP
                    .class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtn_ValiderActionPerformed

    private void jBtn_RAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RAZActionPerformed
        jTxT_AdresseIP.setText("127.0.0.1");
        jTxT_BD.setText("xelfi");
    }//GEN-LAST:event_jBtn_RAZActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenParametresIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenParametresIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenParametresIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenParametresIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FenParametresIP dialog = null;
                try {
                    dialog = new FenParametresIP(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(FenParametresIP.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_RAZ;
    private javax.swing.JButton jBtn_Valider;
    private javax.swing.JLabel jLab_AdresseIP;
    private javax.swing.JLabel jLab_BD;
    private javax.swing.JLabel jLabel_Fond;
    private javax.swing.JTextField jTxT_AdresseIP;
    private javax.swing.JTextField jTxT_BD;
    // End of variables declaration//GEN-END:variables
}
