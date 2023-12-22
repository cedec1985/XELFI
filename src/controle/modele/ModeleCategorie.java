package controle.modele;
import entite.Article;
import entite.Categorie;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeleCategorie extends AbstractTableModel {
 Categorie instanceCategorie = new Categorie();
 private ArrayList<Categorie> lesDonnees =
 instanceCategorie.getLesEnreg();
 private final String[] lesTitres = 
                {"Code", "Désignation"};
                                
    @Override
    public int getRowCount() {
        return lesDonnees.size();
    }

    @Override
    public int getColumnCount() {
        return lesTitres.length;
    }
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return lesDonnees
                            .get(rowIndex).getCode();
                case 2:
                    return lesDonnees
                            .get(rowIndex).getDesignation();
                default:
                    return null;
            }
        }
    
public void creerMOD(Categorie uneCategorie) {
        lesDonnees.add(uneCategorie);
        fireTableRowsInserted
                (lesDonnees.size() - 1, lesDonnees.size() - 1);
    }
    public void supprimerMOD(int rowIndex) {
        lesDonnees.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    public void modifierMOD
               (int firstRow, int lastRow, Categorie uneCategorie) {
        lesDonnees.set(firstRow, uneCategorie);
        fireTableRowsUpdated(firstRow, lastRow);
    }
    public void lireRecupMOD
               (ArrayList<Categorie> nouvellesDonnees) {
        lesDonnees = nouvellesDonnees;
        fireTableDataChanged();
    }
}

    
