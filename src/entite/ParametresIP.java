package entite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class ParametresIP {
    private String nomUtilisateur;
    private String motDePasse;
    private String serveurBD;
    private String driverSGBD;
    private String adresseIPserveur;
    private String nomBD;
    
    public ParametresIP() throws IOException {
        nomUtilisateur = "Commerciaux";
        motDePasse = "aaa";
        driverSGBD = "org.gjt.mm.mysql.Driver";
        serveurBD = lireFichier();
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }
    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }
    public String getServeurBD() {
        return serveurBD;
    }
    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }    
    public String getAdresseIPserveur() {
        return adresseIPserveur;
    }
    public String getNomBD() {
        return nomBD;
    }
    
    public File cheminFichier() throws IOException {
        String repertoire = System.getProperty("user.dir");
        repertoire = repertoire + "/Reseau/";
        File fichierIP = new File(repertoire
                + "ParametresConnexion.txt");
        if (!fichierIP.exists()) {
            fichierIP.createNewFile();
        }
        return fichierIP;
    }
    public String lireFichier() throws IOException {
        File fichierIP = cheminFichier();
        String lesParametres = "jdbc:mysql://localhost";
        try (BufferedReader entree = 
                new BufferedReader(new FileReader(fichierIP))) {
            String[] ligneTab = new String[2];
            for (int i = 0; i < 2; i++) {
                ligneTab[i] = entree.readLine();
                if (i == 0) {
                    lesParametres = lesParametres 
                            + ligneTab[i] + "/";
                    adresseIPserveur = ligneTab[i];
                } else {
                    lesParametres = lesParametres + ligneTab[i];
                    nomBD = ligneTab[i];
                }
                System.out.println(ligneTab[i]);
            }
            System.out.println("sortie finale : " + lesParametres);
        }
        return lesParametres;
    }
}
