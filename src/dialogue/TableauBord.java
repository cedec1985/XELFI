package dialogue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class TableauBord extends JDialog {

    private JLabel JLab_Camembert;
    private JLabel JLab_Nombre;
    private JLabel lblCa;
    private JLabel lblImpays;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    TableauBord dialog = new TableauBord();
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TableauBord() {
        initialize();
    }

    private void initialize() {
        getContentPane().setBackground(Color.WHITE);
        setBounds(100, 100, 417, 236);
        getContentPane().setLayout(null);
        getContentPane().add(getJLab_Camembert());
        getContentPane().add(getJLab_Nombre());
        getContentPane().add(getLblCa());
        getContentPane().add(getLblImpays());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
                .getResource("src/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }

    private JLabel getJLab_Camembert() {
        if (JLab_Camembert == null) {
            JLab_Camembert = new JLabel("Factures");
            JLab_Camembert.setIcon(new ImageIcon(TableauBord.class
                    .getResource("src/images/chart.png")));
            JLab_Camembert.setFont(new Font("Segoe UI", Font.BOLD, 18));
            JLab_Camembert.setBounds(24, 64, 164, 48);
            JLab_Camembert.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    JLab_Camembert.setBorder(new LineBorder(Color.GRAY, 1, true));
                }
                public void mouseExited(MouseEvent e) {
                    JLab_Camembert.setBorder(null);
                }
                public void mouseClicked(MouseEvent e) {
                    String vAnnee = JOptionPane.showInputDialog(null, 
                            "Entrez une année : ");
                   
                }
            });
        }
        return JLab_Camembert;
    }
    private JLabel getJLab_Nombre() {
        if (JLab_Nombre == null) {
            JLab_Nombre = new JLabel("Nombre");
            JLab_Nombre.setIcon(new ImageIcon(TableauBord.class
                    .getResource("src/images/commande1.png")));
            JLab_Nombre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            JLab_Nombre.setBounds(253, 13, 179, 48);
        }
        return JLab_Nombre;
    }
    private JLabel getLblCa() {
        if (lblCa == null) {
            lblCa = new JLabel("CA");
            lblCa.setIcon(new ImageIcon(TableauBord.class.getResource("src/images/tableauBord.png")));
            lblCa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblCa.setBounds(253, 66, 179, 48);
        }
        return lblCa;
    }
    private JLabel getLblImpays() {
        if (lblImpays == null) {
            lblImpays = new JLabel("Impay\u00E9s");
            lblImpays.setIcon(new ImageIcon(TableauBord.class.getResource("src/images/client2.png")));
            lblImpays.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblImpays.setBounds(253, 125, 179, 48);
        }
        return lblImpays;
    }
}
