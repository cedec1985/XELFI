package controle.modele;

import entite.Facture;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeleFacture extends AbstractTableModel {
    Facture instanceFacture = null;
    private ArrayList<Facture> lesDonnees = null;
    private final String[] lesTitres = {"Code",
        "Client", "Mode de paiement", "Total TTC", "Date"};
    public ModeleFacture() {
        instanceFacture = new Facture();
        lesDonnees = instanceFacture.getLesEnreg();
    }

    public int getRowCount() {
        return lesDonnees.size();
    }
    public int getColumnCount() {
        return lesTitres.length;
    }
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        Facture uneFacture =
                (Facture) lesDonnees.get(rowIndex);
        if (columnIndex == 0) {
            return uneFacture.getCode();
        }
        if (columnIndex == 1) {
            return uneFacture.getCode_client().getNom() + " "
                    + uneFacture.getCode_client().getPrenom();
        }
        if (columnIndex == 2) {
            return uneFacture.getMode_reglement().getType();
        }
        if (columnIndex == 3) {
            return uneFacture.getTotal_ttc();
        } else {
            return uneFacture.getDate();
        }
    }
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
            case 1:
            case 2:
                return String.class;
            case 3:
                return Double.class;
            default:
                return Object.class;
        }
    }
    public void creerMOD(Facture uneFacture) {
        if (lesDonnees.add(uneFacture)) {
            fireTableRowsInserted
                    (lesDonnees.size() - 1,
                     lesDonnees.size() - 1);
        }
    }
    public void supprimerMOD(int rowIndex) {
        lesDonnees.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    public void supprimerTousMOD() {
        lesDonnees.removeAll(lesDonnees);
        fireTableDataChanged();
    }
    public void modifierMOD(int firstRow,
            int lastRow, Facture uneFacture) {
        lesDonnees.set(firstRow, uneFacture);
        fireTableRowsUpdated(firstRow, lastRow);
    }
    public void lireRecupMOD
            (ArrayList<Facture> lesFactures) {
        lesDonnees = lesFactures;
        fireTableDataChanged();
    }
}
