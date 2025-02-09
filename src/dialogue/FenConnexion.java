package dialogue;

import controle.connexion.ControleConnexion;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class FenConnexion extends javax.swing.JFrame {
    public FenConnexion() {
        initComponents();
        complementGUI();
    }

    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
                .getResource("src/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLab_Ecran = new javax.swing.JLabel();
        jLab_Nom = new javax.swing.JLabel();
        jLab_Parametres = new javax.swing.JLabel();
        jLab_MDP = new javax.swing.JLabel();
        jTxT_Nom = new javax.swing.JTextField();
        jPassword_MDP = new javax.swing.JPasswordField();
        jLab_MiniFond = new javax.swing.JLabel();
        jBtn_Valider = new javax.swing.JButton();
        jBtn_Quitter = new javax.swing.JButton();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLab_Ecran.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLab_Ecran.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/ecran.png")));
        jLab_Ecran.setText(" Connexion au programme");
        jLab_Ecran.setToolTipText("");
        getContentPane().add(jLab_Ecran, new org.netbeans.lib.awtextra.GridBagConstraints(10, 10, 390, 60));

        jLab_Nom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_Nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/utilisateur.png")));
        jLab_Nom.setText("Nom");
        getContentPane().add(jLab_Nom, new org.netbeans.lib.awtextra.GridBagConstraints(60, 100, -1, -1));

        jLab_Parametres.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/switch-on.png")));
        jLab_Parametres.setText("Paramètres de connexion");
        jLab_Parametres.setCursor(new Cursor(Cursor.HAND_CURSOR));
        getContentPane().add(jLab_Parametres, new org.netbeans.lib.awtextra.GridBagConstraints(20, 230, 190, -1));

        jLab_MDP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLab_MDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/key.png")));
        jLab_MDP.setText("Mot de passe");
        getContentPane().add(jLab_MDP, new org.netbeans.lib.awtextra.GridBagConstraints(60, 140, -1, -1));

        jTxT_Nom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jTxT_Nom, new org.netbeans.lib.awtextra.GridBagConstraints(190, 100, 190, -1));

        jPassword_MDP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jPassword_MDP, new org.netbeans.lib.awtextra.GridBagConstraints(190, 140, 190, -1));

        jLab_MiniFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/ban.png")));
        getContentPane().add(jLab_MiniFond, new org.netbeans.lib.awtextra.GridBagConstraints(12, 13, -1, 203));

        jBtn_Valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/valider.png")));
        jBtn_Valider.setText("Valider");
        jBtn_Valider.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtn_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ValiderActionPerformed(evt);
            }
        });
        jBtn_Valider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtn_ValiderKeyPressed(evt);
            }
        });
        getContentPane().add(jBtn_Valider, new org.netbeans.lib.awtextra.GridBagConstraints(220, 220, -1, 30));

        jBtn_Quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/quitter.png")));
        jBtn_Quitter.setText("Quitter");
        jBtn_Quitter.setToolTipText("");
        jBtn_Quitter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jBtn_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_QuitterActionPerformed(evt);
            }
        });
        jBtn_Quitter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtn_QuitterKeyPressed(evt);
            }
        });
        getContentPane().add(jBtn_Quitter, new org.netbeans.lib.awtextra.GridBagConstraints(320, 220, -1, 30));

        setSize(new java.awt.Dimension(451, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_QuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtn_QuitterActionPerformed

    private void jBtn_QuitterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtn_QuitterKeyPressed
        if (evt.getKeyCode() == 10) {
            System.exit(0);
        }
    }//GEN-LAST:event_jBtn_QuitterKeyPressed

    private void jBtn_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ValiderActionPerformed

        FenMenuPrincipal laFenetre = new FenMenuPrincipal();
            laFenetre.setVisible(true);
            dispose();
           
    }//GEN-LAST:event_jBtn_ValiderActionPerformed

    private void jBtn_ValiderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtn_ValiderKeyPressed
        if (evt.getKeyCode() == 10) {
            if (controleConnexion_Appel()){
                FenMenuPrincipal laFenetre = new FenMenuPrincipal();
                laFenetre.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jBtn_ValiderKeyPressed
 private boolean controleConnexion_Appel() {
        String leNom = jTxT_Nom.getText();
        boolean bControle = false;
        String leMotDePasse = String.valueOf(jPassword_MDP.getPassword());
        if (ControleConnexion.controle(leNom, leMotDePasse)) {
            if (ControleConnexion.isEtatConnexion()) {
                bControle = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Impossible de se connecter"
                        + " à la base de données.\n\n"
                        + "Vos nom et mot de passe sont corrects.\n"
                        + "Mais les paramètres pour le pilote"
                        + " et la base de données "
                        + "doivent être vérifiés.\n\n"
                        + "Contacter le responsable informatique.",
                        "ALERTE", JOptionPane.ERROR_MESSAGE);
            }
        }
        return bControle;
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;




                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FenConnexion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtn_Quitter;
    private javax.swing.JButton jBtn_Valider;
    private javax.swing.JLabel jLab_Ecran;
    private javax.swing.JLabel jLab_MDP;
    private javax.swing.JLabel jLab_MiniFond;
    private javax.swing.JLabel jLab_Nom;
    private javax.swing.JLabel jLab_Parametres;
    private javax.swing.JPasswordField jPassword_MDP;
    private javax.swing.JTextField jTxT_Nom;
    // End of variables declaration//GEN-END:variables
}


