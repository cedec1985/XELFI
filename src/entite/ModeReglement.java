package entite;

import controle.connexion.ControleConnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ModeReglement {
    private int code;
    private String type;
    private static Connection laConnexion =
            (Connection) ControleConnexion.getLaConnectionStatique();
    private final ArrayList<ModeReglement> lesEnreg =
            new ArrayList<>();

    public ModeReglement() {
        lireRecupCRUD();
    }
    public ModeReglement(int code, String type) {
        this.code = code;
        this.type = type;
    }
    public ModeReglement(String vType) {
        type = vType;
    }

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public ArrayList<ModeReglement> getLesEnreg() {
        return lesEnreg;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public void lireRecupCRUD() {
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM mode_reglements");
            while (rs.next()) {
                int code = rs.getInt("code");
                String type = rs.getString("type");
                lesEnreg.add(new ModeReglement(code, type));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de la lecture : \n" 
                    + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
}
