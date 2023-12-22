package controle.connexion;

import com.sun.jdi.connect.spi.Connection;
import entite.Parametres;
import java.io.IOException;
import javax.swing.JOptionPane;

public abstract class ControleConnexion {

    static Parametres lesParametres;
    static boolean etatConnexion;
    static Connection laConnectionStatique;

    public static boolean controle(String leNom, String leMotDePasse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  static {
  boolean ok = true;
  lesParametres = new Parametres();
  try{
  Class.forName(lesParametres.getDriverSGBD());
  etatConnexion=true;
  }catch(ClassNotFoundException e){
      JOptionPane.showMessageDialog(null,
              "Classe non trouvée"
      + "pour le chargement"
      +"du pilote JDBC MySQL",
              "ALERTE",JOptionPane.ERROR_MESSAGE);
  ok =false;
  etatConnexion = false;
  }
  if (ok){
     try{
    String urlBD = lesParametres.getServeurBD();
    String nomUtilisateur = lesParametres.getNomUtilisateur();
    String MDP =lesParametres.getMotDePasse();
    laConnectionStatique = DriverManager.getConnection(urlBD,nomUtilisateur,MDP);
    etatConnexion=true;
     }catch(Exception e) {
         JoptionPane.showMessageDialog(null,"impossible de se connecter à la base de données","ALERTE", JOptionPane.ERROR_MESSAGE);
        etatConnexion =false; 
     }} 
  }

    public static boolean isEtatConnexion() {
        return etatConnexion;
    }
    public static Connection getLaConnectionStatique() {
        return laConnectionStatique;
    }
    public static Parametres getLesParametres() {
        return lesParametres;
    }
    public static void fermetureSession() throws IOException {
        laConnectionStatique.close();
    }

  
    }

