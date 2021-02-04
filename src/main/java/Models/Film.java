package Models;

import java.io.StringWriter;

public class Film {
    int id;

    String nom;
    String genre;
    String langue;
    String addressPhoto;

    int prix;
    int annee;
    int duree;

    public Film(int id, String nom, String genre, String langue, String addressPhoto, int prix, int annee, int duree) {
        this.id = id;
        this.nom = nom;
        this.genre = genre;
        this.langue = langue;
        this.addressPhoto = addressPhoto;
        this.prix = prix;
        this.annee = annee;
        this.duree = duree;
    }

    public Film(String nom, String genre, String langue, String addressPhoto, int prix, int annee, int duree) {
        this.nom = nom;
        this.genre = genre;
        this.langue = langue;
        this.addressPhoto = addressPhoto;
        this.prix = prix;
        this.annee = annee;
        this.duree = duree;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getAddressPhoto() {
        return addressPhoto;
    }

    public void setAddressPhoto(String addressPhoto) {
        this.addressPhoto = addressPhoto;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nom='" + nom + '\'' +
                ", genre='" + genre + '\'' +
                ", langue='" + langue + '\'' +
                ", addressPhoto='" + addressPhoto + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                ", duree=" + duree +
                '}';
    }

}
