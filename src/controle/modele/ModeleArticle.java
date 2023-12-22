package controle.modele;

import entite.Article;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeleArticle extends AbstractTableModel {
    Article instanceArticle = new Article();
    private ArrayList<Article> lesDonnees =
            instanceArticle.getLesEnreg();
    private final String[] lesTitres = 
                {"Code", "Code Catégorie", "Désignation",
                                    "Quantité", "Prix unitaire"};
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
        switch (columnIndex) {
            case 0:
                return lesDonnees
                        .get(rowIndex).getCode();
            case 1:
                return lesDonnees
                        .get(rowIndex).getCodeCategorie();
            case 2:
                return lesDonnees
                        .get(rowIndex).getDesignation();
            case 3:
                return lesDonnees
                        .get(rowIndex).getQuantite();
            case 4:
                return lesDonnees
                        .get(rowIndex).getPrix_unitaire();
            default:
                return null;
        }
    }

    public void creerMOD(Article unArticle) {
        lesDonnees.add(unArticle);
        fireTableRowsInserted
                (lesDonnees.size() - 1, lesDonnees.size() - 1);
    }
    public void supprimerMOD(int rowIndex) {
        lesDonnees.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    public void modifierMOD
               (int firstRow, int lastRow, Article unArticle) {
        lesDonnees.set(firstRow, unArticle);
        fireTableRowsUpdated(firstRow, lastRow);
    }
    public void lireRecupMOD
               (ArrayList<Article> nouvellesDonnees) {
        lesDonnees = nouvellesDonnees;
        fireTableDataChanged();
    }
}
