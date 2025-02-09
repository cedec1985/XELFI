package dialogue;

import java.awt.LayoutManager;
import java.awt.Toolkit;

public class FenTableauBord extends javax.swing.JDialog {

    public FenTableauBord(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        complementGUI();
    }

    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("src/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_Camembert = new javax.swing.JLabel();
        jLab_Nombre = new javax.swing.JLabel();
        jLab_CA = new javax.swing.JLabel();
        jLab_Impayes = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    //    getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Camembert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLab_Camembert.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/chart.png"))); // NOI18N
        jLab_Camembert.setText(" Factures");
        jLab_Camembert.setToolTipText("");
        getContentPane().add(jLab_Camembert, new org.netbeans.lib.awtextra.GridBagConstraints(40, 90, -1, -1));

        jLab_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/commande1.png"))); // NOI18N
        jLab_Nombre.setText("Nombre");
        getContentPane().add(jLab_Nombre, new org.netbeans.lib.awtextra.GridBagConstraints(260, 20, -1, -1));

        jLab_CA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_CA.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/tableauBord.png"))); // NOI18N
        jLab_CA.setText("CA");
        getContentPane().add(jLab_CA, new org.netbeans.lib.awtextra.GridBagConstraints(260, 90, -1, -1));

        jLab_Impayes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_Impayes.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/images/client2.png"))); // NOI18N
        jLab_Impayes.setText("Impayés");
        getContentPane().add(jLab_Impayes, new org.netbeans.lib.awtextra.GridBagConstraints(250, 160, -1, -1));

        jLab_Fond.setBackground(new java.awt.Color(255, 255, 255));
        jLab_Fond.setOpaque(true);
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.GridBagConstraints(0, 0, 410, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FenTableauBord dialog = new FenTableauBord(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLab_CA;
    private javax.swing.JLabel jLab_Camembert;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Impayes;
    private javax.swing.JLabel jLab_Nombre;
    // End of variables declaration//GEN-END:variables
}
