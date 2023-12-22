package entite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controle.connexion.ControleConnexion;

/*
 * La classe catégorie est à compléter lorsque vous aurez réalisé l'ensemble du
 * projet Xelfi tel que proposé dans le livre. Nous vous laissons donc le soin
 * de créer vous mêmes les méthodes CRUD en vous aidant de tout ce qui a été vu
 * et mis en oeuvre pour bâtir le projet Xelfi. Pensez alors à créer aussi un
 * modèle et une IHM selon la même démarche suivie pour les classes entités
 * Client, Article, Facture et LignesFacture
 */
public class Categorie {

    private String code;
    private String designation;

    public Categorie(String code) {
        super();
        this.code = code;
        this.designation = designation;
    }
    public Categorie(){
        lireRecupCRUD();
    }
    private static Connection laConnexion =
            (Connection) ControleConnexion.getLaConnectionStatique();
    private ArrayList<Categorie> lesEnreg = new ArrayList<>();

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public ArrayList<Categorie> getLesEnreg() {
        return lesEnreg;
    }
    private void lireRecupCRUD() {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM categorie");
            while (rs.next()) {
                String code = rs.getString("code");
                String designation = rs.getString("designation");
                lesEnreg.add(new Categorie(code));
            }
        } catch (SQLException e) {
            System.out.println("problème avec recupEnregBD()");
        }
    }
     public boolean creerCRUD(String vCode, 
            String vDesignation) {
        boolean bCreation = false;
        String requete = null;
        try {
            requete = "INSERT INTO categorie VALUES (?,?,NOW())";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vCode);
            prepare.setString(2, vDesignation);
            prepare.executeUpdate();
            bCreation = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ajout dans la BD non effectué : " 
                    + e.getMessage(), "Problème rencontré", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return bCreation;
    }
    public boolean modifierCRUD(String vCode, 
            String vDesignation) {
        boolean bModification = true;
        String requete = null;
        try {
            requete = "UPDATE categorie SET "
                    + "code = ?, "
                    + "designation = ?, ";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(2, vDesignation);
            prepare.setString(5, vCode);
            prepare.executeUpdate();
            bModification = true;
        } catch (SQLException e) {
            bModification = false;
            JOptionPane.showMessageDialog(null, "Modification dans la BD non effectuée : "
                    + e.getMessage(),
                    "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bModification;
    }
    public boolean supprimerCRUD(String vCode) {
        boolean bSuppression = true;
        String requete = null;
        try {
            requete = "DELETE FROM categorie WHERE code = ?";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vCode);
            int nbEnregSup = prepare.executeUpdate();
            if (nbEnregSup == 0) {
                JOptionPane.showMessageDialog(null, "Aucune suppression effectuée dans la BD.",
                        "Problème rencontré", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            bSuppression = false;
            JOptionPane.showMessageDialog(null, "Aucune suppression effectuée dans la BD.",
                    "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bSuppression;
    }
    public ArrayList<Categorie> chercherCRUD(String recherche) {
        String requete = "";
        requete += "SELECT * ";
        requete += "FROM categorie ";
        requete += "WHERE code LIKE '%" + recherche + "%' ";
        requete += "OR designation LIKE '%" + recherche + "%' ";
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
            while (rs.next()) {
                String code = rs.getString("code");
                String designation = rs.getString("designation");
                lesEnreg.add(new Categorie(code));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problème rencontré : "
                    + e.getMessage(),
                    "Résultat", JOptionPane.ERROR_MESSAGE);
        }
        return lesEnreg;
    }
}
