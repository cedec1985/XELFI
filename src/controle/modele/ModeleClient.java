package controle.modele;

import entite.Client;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class ModeleClient extends AbstractTableModel{
Client instanceClient = new Client();
    private ArrayList<Client> lesDonnees =
            instanceClient.getlesEnreg();
    private final String[] lesTitres = {"Code", "Nom",
        "Prénom", "Carte Fidélité", "Date Création"};

    public ModeleClient() {
        this.instanceClient = new Client();
    }
    @Override
    public int getRowCount() {
        return lesDonnees.size();
    }
    @Override
    public int getColumnCount() {
        return lesTitres.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> lesDonnees.get(rowIndex).getCode();
            case 1 -> lesDonnees.get(rowIndex).getNom();
            case 2 -> lesDonnees.get(rowIndex).getPrenom();
            case 3 -> lesDonnees.get(rowIndex).isCarte_Fidele();
            case 4 -> lesDonnees.get(rowIndex).getDate_creation();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int columnIndex) {
        return lesTitres[columnIndex];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 3 -> Boolean.class;
            case 4 -> Date.class;
            default -> Object.class;
        };
    }
    public int getNumLigne(String vCode) {
        String code = "";
        int numLigne = 0;
        for (int i = 0; i < lesDonnees.size(); i++) {
            code = lesDonnees.get(i).getCode();
            if (code.equals(vCode)) {
                numLigne = i;
            }
        }
        return numLigne;
    }

    public void creerMOD(Client instanceClient) {
        lesDonnees.add(instanceClient);
        fireTableRowsInserted(lesDonnees.size() - 1,
                lesDonnees.size() - 1);
    }

    public void supprimerMOD(int rowIndex) {
        lesDonnees.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    public void modifierMOD(Client leClient, int firstRow, int lastRow) {
        lesDonnees.set(firstRow, leClient);
        fireTableRowsUpdated(firstRow, lastRow);
    }
    public void lireRecupMOD(ArrayList<Client> nouvellesDonnees) {
        lesDonnees = nouvellesDonnees;
        fireTableDataChanged();
    }
    public static void main(String[] args) {
        ModeleClient test = new ModeleClient();
        System.out.println("NB de clients : "
                + test.getRowCount());
        System.out.println("nom du 1er client : "
                + test.getValueAt(0, 1));
    }

    public void modifierMOD(int numLigne, int numLigne0, Client leClient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private ArrayList<Client> getlesEnreg() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
