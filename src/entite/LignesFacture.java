package entite;

import controle.connexion.ControleConnexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class LignesFacture {

    private String code;
    private Article unArticle;
    private int quantite;
    private double prix_unitaire;
    private double total;
    private static Connection laConnexion =
            (Connection) ControleConnexion.getLaConnectionStatique();
    private final ArrayList<LignesFacture> lesEnreg = new ArrayList<>();

    public LignesFacture(String code, Article unArticle,
            int quantite, double prix_unitaire, double total) {
        this.code = code;
        this.unArticle = unArticle;
        this.quantite = quantite;
        this.prix_unitaire = prix_unitaire;
        this.total = total;
    }

    public LignesFacture(String code) {
        lireRecupCRUD(code);
    }

    public LignesFacture(String code, String code_article,
            int quantite, double prix_unitaire, double total) {
        this.code = code;
        this.unArticle.setCode(code_article);
        this.quantite = quantite;
        this.prix_unitaire = prix_unitaire;
        this.total = total;
    }

    public LignesFacture() {
    }

    public String getCode_commande() {
        return code;
    }

    public void setCode_commande(String code) {
        this.code = code;
    }

    public Article getUnArticle() {
        return unArticle;
    }

    public void setUnArticle(Article unArticle) {
        this.unArticle = unArticle;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<LignesFacture> getLesEnreg() {
        return lesEnreg;
    }

    public void lireRecupCRUD(String facture) {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT l.*, a.code_categorie, "
                    + "a.designation, a.quantite AS qte, a.prix_unitaire AS pu, a.date "
                    + "FROM lignes_factures AS l, articles AS a "
                    + "WHERE l.code_article LIKE a.code AND l.code_facture LIKE '" 
                    + facture + "'");
            while (rs.next()) {
                String code = rs.getString("code");
                String code_article = rs.getString("code_article");
                int quantite = rs.getInt("quantite");
                double prix_unitaire = rs.getDouble("prix_unitaire");
                double total = rs.getDouble("total");

                String code_categorie = rs.getString("code_categorie");
                String designation = rs.getString("designation");
                int qte = rs.getInt("qte");
                double pu = rs.getDouble("pu");
                Date date = rs.getDate("date");

                lesEnreg.add(new LignesFacture(code,
                        new Article(code_article, code_categorie, designation, qte, pu, date),
                        quantite,
                        prix_unitaire,
                        total));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la récupération : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean creerCRUD(String code, String code_article, int quantite, double prix_unitaire, double total) {
        boolean is_created = false;
        try {
            PreparedStatement prepare = laConnexion.prepareStatement("INSERT INTO lignes_factures "
                    + "VALUES(?,?,?,?,?)");
            prepare.setString(1, code);
            prepare.setString(2, code_article);
            prepare.setInt(3, quantite);
            prepare.setDouble(4, prix_unitaire);
            prepare.setDouble(5, total);
            prepare.executeUpdate();
            is_created = true;
            prepare = laConnexion.prepareStatement("UPDATE articles SET quantite "
                    + "= (quantite-?) WHERE code = ?");
            prepare.setInt(1, quantite);
            prepare.setString(2, code_article);
            prepare.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la création : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return is_created;
    }

    public boolean modifierCRUD(String code, String code_article, int quantite, 
            double prix_unitaire, double total) {
        try {
            PreparedStatement prepare = laConnexion.prepareStatement("UPDATE lignes_factures SET code_article = ?,"
                    + " quantite = ?, prix_unitaire = ?, total = ?"
                    + " WHERE code = ?");
            prepare.setString(1, code_article);
            prepare.setInt(2, quantite);
            prepare.setDouble(3, prix_unitaire);
            prepare.setDouble(4, total);
            prepare.setString(5, code);
            prepare.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean supprimerToutCRUD(String valeur, String champ) {
        try {
            PreparedStatement prepare = laConnexion.prepareStatement("DELETE FROM lignes_factures WHERE " + champ + " = ?");
            prepare.setString(1, valeur);
            prepare.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite pendant la suppression : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean supprimerLigneCRUD(String vCodeFacture, String vCodeArticle) {
        boolean bSuppression = true;
        String requete = null;
        try {
            requete = "DELETE FROM lignes_factures"
                    + " WHERE code_facture = '" + vCodeFacture + "'" + " AND code_article = '" + vCodeArticle + "'";
            Statement state = laConnexion.createStatement();
            int nbEnregSup = state.executeUpdate(requete);
            if (nbEnregSup == 0) {
                JOptionPane.showMessageDialog(null, "Aucun enregistrement correspondant.",
                        "Résultat", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            bSuppression = false;
            JOptionPane.showMessageDialog(null, "Aucune suppression effectuée dans la BD : "
                    + e.getMessage(),
                    "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bSuppression;
    }

    public ArrayList<LignesFacture> chercherCRUD(String recherche) {
        String requete = "";
        requete += "SELECT l.*, a.code_categorie, a.designation, a.quantite AS qte, a.prix_unitaire AS pu, a.date ";
        requete += "FROM articles AS a, lignes_factures AS l ";
        requete += "WHERE (a.code LIKE l.code_article) ";
        requete += "AND (a.code_categorie LIKE '%" + recherche + "%' ";
        requete += "OR a.designation LIKE '%" + recherche + "%')";
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
            while (rs.next()) {
                String code = rs.getString("code");
                String code_article = rs.getString("code_article");
                int quantite = rs.getInt("quantite");
                double prix_unitaire = rs.getDouble("prix_unitaire");
                double total = rs.getDouble("total");
                String code_categorie = rs.getString("code_categorie");
                String designation = rs.getString("designation");
                int qte = rs.getInt("qte");
                double pu = rs.getDouble("pu");
                Date date = rs.getDate("date");
                lesEnreg.add(new LignesFacture(code,
                        new Article(code_article, code_categorie, designation, qte, pu, date),
                        quantite,
                        prix_unitaire,
                        total));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la recherche : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return lesEnreg;
    }
}
