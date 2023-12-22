package entite;

public abstract class Personne {
  String code;
  String nom;
  String prenom;
  
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public String getNom() {
    return nom;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public String getPrenom() {
    return prenom;
  }
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  
    public Personne (String vCode, String vNom, String vPrenom) {
        code = vCode;
        nom = vNom;
        prenom = vPrenom;
  }
  public Personne (String vCode){
    code = vCode;
  }
  public Personne () {
  }
}

