package Models;

public class Sceance {
    double heure;
    int nbPlaceDispo;
    int nbPlaceOccupe;
    Film film;
    Salle salle;


    public Sceance(double heure, int nbPlaceDispo, int nbPlaceOccupe, Film film, Salle salle) {
        this.heure = heure;
        this.nbPlaceDispo = nbPlaceDispo;
        this.nbPlaceOccupe = nbPlaceOccupe;
        this.film = film;
        this.salle = salle;
    }

    public double getHeure() {
        return heure;
    }

    public void setHeure(double heure) {
        this.heure = heure;
    }

    public int getNbPlaceDispo() {
        return nbPlaceDispo;
    }

    public void setNbPlaceDispo(int nbPlaceDispo) {
        this.nbPlaceDispo = nbPlaceDispo;
    }

    public int getNbPlaceOccupe() {
        return nbPlaceOccupe;
    }

    public void setNbPlaceOccupe(int nbPlaceOccupe) {
        this.nbPlaceOccupe = nbPlaceOccupe;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
}
