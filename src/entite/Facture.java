package entite;

import controle.connexion.ControleConnexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Facture {
    private String code;
    private Client code_client;
    private double total_ttc;
    private int codeModeReglement;
    private ModeReglement mode_reglement;
    private Date date;
    private static Connection laConnexion =
            (Connection) ControleConnexion.getLaConnectionStatique();
    private final ArrayList<Facture> lesEnreg =
            new ArrayList<>();

    public Facture(String code, Client code_client,
            double total_ttc,
            ModeReglement mode_reglement, Date date) {
        this.code = code;
        this.code_client = code_client;
        this.total_ttc = total_ttc;
        this.mode_reglement = mode_reglement;
        this.date = date;
    }
    public Facture() {
        lireRecupCRUD();
    }
    public Facture(String code) {
    }
    public String getCode() {
        return code;
    }
    public Client getCode_client() {
        return code_client;
    }
    public double getTotal_ttc() {
        return total_ttc;
    }
    public ModeReglement getMode_reglement() {
        return mode_reglement;
    }
    public Date getDate() {
        return date;
    }
    public int getCodeModeReglement() {
        return codeModeReglement;
    }
    public ArrayList<Facture> getLesEnreg() {
        return lesEnreg;
    }

    private void lireRecupCRUD() {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT fac.code,"
               + " fac.total_ttc, fac.date, cli.nom, "
               + "cli.prenom, mode.type "
               + "FROM factures AS fac, clients AS cli, "
               + "mode_reglements AS mode "
               + "WHERE fac.code_mode_reglement = mode.code "
               + "AND fac.code_client = cli.code");
            while (rs.next()) {
                String codeJ = rs.getString("code");
                double total_ttcJ = rs.getDouble("total_ttc");
                Date dateJ = rs.getDate("date");
                String nomJ = rs.getString("nom");
                String prenomJ = rs.getString("prenom");
                String typeJ = rs.getString("type");

                lesEnreg.add(new Facture(codeJ,
                        new Client(nomJ, prenomJ),
                        total_ttcJ,
                        new ModeReglement(typeJ),
                        dateJ));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Problème rencontré",
                    "ALERTE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean creerCRUD(String vCode, String vCode_Client,
            double vTotalTTC, int vCode_Mode_Reglement) {
        boolean bCreation = false;
        String requete = null;
        try {
            
            requete = "INSERT INTO "
                      + "factures VALUES (?,?,?,?,NOW())";   
            PreparedStatement prepare =
                    laConnexion.prepareStatement(requete);
            prepare.setString(1, vCode);
            prepare.setString(2, vCode_Client);
            prepare.setDouble(3, vTotalTTC);
            prepare.setInt(4, vCode_Mode_Reglement);
            prepare.executeUpdate();
            bCreation = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Ajout dans la BD non effectué : "
                    + e.getMessage(), "Problème rencontré",
                    JOptionPane.ERROR_MESSAGE);
        }
        return bCreation;
    }

    public boolean supprimerCRUD(String vCode) {
        boolean bSuppression = true;
        String requete = null;
        try {
            requete = "DELETE factures, lignes_factures"
                    + " FROM factures, lignes_factures "
                    + "WHERE code_facture = code AND code = ?";
            PreparedStatement prepare = 
                    laConnexion.prepareStatement(requete);
            prepare.setString(1, vCode);
            int nbEnregSup = prepare.executeUpdate();
            if (nbEnregSup == 0) {
                JOptionPane.showMessageDialog(null,
                        "Aucune suppression effectuée dans la BD.",
                        "Problème rencontré",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            bSuppression = false;
            JOptionPane.showMessageDialog(null,
                    "Aucune suppression effectuée dans la BD.",
                    "Problème rencontré",
                    JOptionPane.ERROR_MESSAGE);
        }
        return bSuppression;
    }

    public ArrayList<Facture> chercherCRUD(String recherche) {
        String requete = "";
        requete += "SELECT com.code, com.total_ttc,"
                + " com.date, cli.nom, cli.prenom, mode.type ";
        requete += "FROM factures AS com, clients AS cli,"
                + " mode_reglements AS mode ";
        requete += "WHERE com.code_mode_reglement = mode.code ";
        requete += "AND com.code_client = cli.code AND (";
        requete += "com.code LIKE '%" + recherche + "%' ";
        requete += "OR cli.nom LIKE '%" + recherche + "%' ";
        requete += "OR cli.prenom LIKE '%" + recherche + "%' ";
        requete += "OR com.total_ttc LIKE '%" + recherche + "%' ";
        requete += "OR mode.type LIKE '%" + recherche + "%')";
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
            while (rs.next()) {
                String codeJ = rs.getString("code");
                double total_ttcJ = rs.getDouble("total_ttc");
                Date dateJ = rs.getDate("date");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String type = rs.getString("type");
                lesEnreg.add(new Facture(codeJ,
                        new Client(nom, prenom),
                        total_ttcJ,
                        new ModeReglement(type),
                        dateJ));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Problème rencontré : " + e.getMessage(),
                    "Résultat", JOptionPane.ERROR_MESSAGE);
        }
        return lesEnreg;
    }
}
