package controle.modele;

// http://download.oracle.com/javase/tutorial/uiswing/components/combobox.html
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxRenderer extends JLabel implements ListCellRenderer<Object> {

    private static final long serialVersionUID = 1L;
    private ImageIcon icon;
    private String txt;

    public ComboBoxRenderer() {
        setOpaque(false);
    }

    public Component getListCellRendererComponent(JList<?> list, Object value, 
            int index, boolean isSelected, boolean cellHasFocus) {
        int selectedIndex = ((Integer) value).intValue();
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        if (selectedIndex == 0) {
            icon = new ImageIcon(getClass().getResource("/images/gestion/pdf.png"));
            txt = "PDF (*.pdf)";
        }
        if (selectedIndex == 1) {
            icon = new ImageIcon(getClass().getResource("/images/gestion/docx.png"));
            txt = "DOCX (*.docx)";
        }
        if (selectedIndex == 2) {
            icon = new ImageIcon(getClass().getResource("/images/gestion/html.png"));
            txt = "HTML (*.html)";
        }
        if (selectedIndex == 3) {
            icon = new ImageIcon(getClass().getResource("/images/gestion/odt.png"));
            txt = "ODT (*.odt)";
        }
        if (selectedIndex == 4) {
            icon = new ImageIcon(getClass().getResource("/images/gestion/ods.png"));
            txt = "ODS (*.ods)";
        }
        setIcon(icon);
        if (icon != null) {
            setText(txt);
            setFont(list.getFont());
        }
        return this;
    }
}