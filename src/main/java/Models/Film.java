package Models;

public class Film {
    int id;

    String nom;
    String genre;
    String langue;
    String addressPhoto;

    double prix;
    int annee;
    int duree;

    public Film(int id, String nom, String genre, String langue, String addressPhoto, double prix, int annee, int duree) {
        this.id = id;
        this.nom = nom;
        this.genre = genre;
        this.langue = langue;
        this.addressPhoto = addressPhoto;
        this.prix = prix;
        this.annee = annee;
        this.duree = duree;
    }

    public Film(String nom, String genre, String langue, String addressPhoto, double prix, int annee, int duree) {
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
    public String getGenre() {
        return genre;
    }
    public String getLangue() {
        return langue;
    }
    public String getAddressPhoto() {
        return addressPhoto;
    }
    public double getPrix() {
        return prix;
    }
    public int getAnnee() {
        return annee;
    }
    public int getDuree() {
        return duree;
    }
    public int getId() {
        return id;
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
