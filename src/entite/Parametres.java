/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

public class Parametres {
    private String nomUtilisateur;
    private String motDePasse;
    private String serveurBD;
    private String driverSGBD;

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtililisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getServeurBD() {
        return serveurBD;
    }

    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }

    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }

    public Parametres() {
        nomUtilisateur="root";
        motDePasse="tempo";
        driverSGBD="org.gjt.mm.mysql.Driver";
        serveurBD="jdbc:mysql://localhost/xelfi";
 
}}
