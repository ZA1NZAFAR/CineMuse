package Models;

public class Person {
    String prenom;
    String nom;
    String email;
    String numTel;
    String login;
    String motDePasse;
    String dateNaissance;
    char sexe;


    public Person(String prenom, String nom, String email, String numTel, String login, String motDePasse, String dateNaissance, char sexe) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.numTel = numTel;
        this.login = login;
        this.motDePasse = motDePasse;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public String getNumTel() {
        return numTel;
    }
    public String getLogin() {
        return login;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }
    public char getSexe() {
        return sexe;
    }

}
