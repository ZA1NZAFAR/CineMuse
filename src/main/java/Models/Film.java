package Models;

public class Film {
    String nom;
    String genre;
    String langue;
    int annee;
    int duree;
    String addressPhoto;


    public Film(String nom, String genre, String langue, int annee, int duree) {
        this.nom = nom;
        this.genre = genre;
        this.langue = langue;
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
}
