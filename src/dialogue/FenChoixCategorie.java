/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialogue;
import entite.Categorie;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author cedec
 */
public class FenChoixCategorie extends javax.swing.JDialog {
     private TableModel leModeleCategorie;
    public FenChoixCategorie(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        complementGUI();
    }

    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
                .getResource("/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }
private void initComponents() {

        jLabel_Titre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLab_recherche = new javax.swing.JLabel();
        jTxT_Rechercher = new javax.swing.JTextField();
        jLabel_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout((LayoutManager) new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titre.setText("Double-cliquez sur la ligne de la catégorie.");
        jLabel_Titre.setToolTipText("");
        getContentPane().add(jLabel_Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, 656, 269));

        jLab_recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chercheAssiste.png")));
        jLab_recherche.setText("Rechercher");
        jLab_recherche.setToolTipText("");
        getContentPane().add(jLab_recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 322, -1, -1));

        jTxT_Rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxT_RechercherKeyReleased(evt);
            }
        });
        getContentPane().add(jTxT_Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 327, 125, -1));

        jLabel_Fond.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Fond.setOpaque(true);
        getContentPane().add(jLabel_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 360));

        setSize(new java.awt.Dimension(698, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jTxT_RechercherKeyReleased(java.awt.event.KeyEvent evt) {                                            
        Categorie uneCategorie = new Categorie("");
        ArrayList<Categorie> nouvelleListe =
                uneCategorie.chercherCRUD(jTxT_Rechercher.getText());
    }                                           

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (evt.getClickCount() == 2) {
            int ligne = jTable.getSelectedRow();
            if (Integer.valueOf(jTable.getValueAt(ligne, 3).toString()) == 0) {
                JOptionPane.showMessageDialog(null,
                        "Stock épuisé pour cet article",
                        "Ajout", JOptionPane.WARNING_MESSAGE);
            } else {
                FenCategorie.setjTxT_Code(jTable.getValueAt(ligne, 1).toString());
                FenCategorie.setjTxT_Designation(jTable.getValueAt(ligne, 2).toString());
                FenChoixCategorie.this.dispose();
            }
        }
    }                                   

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
                if ("Minus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenChoixCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenChoixCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenChoixCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenChoixCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FenChoixCategorie dialog = new FenChoixCategorie(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLab_recherche;
    private javax.swing.JLabel jLabel_Fond;
    private javax.swing.JLabel jLabel_Titre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxT_Rechercher;
    // End of variables declaration                   
}
