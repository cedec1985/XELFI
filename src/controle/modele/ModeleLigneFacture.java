package controle.modele;

import entite.LignesFacture;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeleLigneFacture extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    LignesFacture instanceLigneFacture = null;
    private ArrayList<LignesFacture> lesDonnees = null;
    private final String[] lesTitres = {"Code", "Code catégorie", "Désignation",
        "Quantité", "Prix unitaire", "Total"};

    public ModeleLigneFacture(String code_commande) {
        instanceLigneFacture = new LignesFacture(code_commande);
        lesDonnees = instanceLigneFacture.getLesEnreg();
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
        LignesFacture uneLigne = (LignesFacture) lesDonnees.get(rowIndex);
        if (columnIndex == 0) {
            return uneLigne.getUnArticle().getCode();
        }
        if (columnIndex == 1) {
            return uneLigne.getUnArticle().getCodeCategorie();
        }
        if (columnIndex == 2) {
            return uneLigne.getUnArticle().getDesignation();
        }
        if (columnIndex == 3) {
            return uneLigne.getQuantite();
        }
        if (columnIndex == 4) {
            return uneLigne.getPrix_unitaire();
        } else {
            return uneLigne.getTotal();
        }
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Character.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            case 4:
                return Double.class;
            case 5:
                return Double.class;
            default:
                return Object.class;
        }
    }

    public void creerMOD(LignesFacture uneLigne) {
        if (lesDonnees.add(uneLigne)) {
            fireTableRowsInserted(lesDonnees.size() - 1, lesDonnees.size() - 1);
        }
    }

    public void supprimerMOD(int rowIndex) {
        lesDonnees.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void supprimerTous() {
        lesDonnees.removeAll(lesDonnees);
        fireTableDataChanged();
    }

    public void modifierMOD(int firstRow, int lastRow, LignesFacture uneLigne) {
        lesDonnees.set(firstRow, uneLigne);
        fireTableRowsUpdated(firstRow, lastRow);
    }

    public void lireRecupMOD(ArrayList<LignesFacture> nouvellesDonnees) {
        lesDonnees = nouvellesDonnees;
        fireTableDataChanged();
    }
}
