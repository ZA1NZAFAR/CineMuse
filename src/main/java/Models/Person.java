package Models;

import java.util.Date;

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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getLogin() {
        return login;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.login = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
}
