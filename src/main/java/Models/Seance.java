package Models;

public class Seance {
    int idSeance;
    double heure;
    String date;
    int IdSalle;
    int IdFilm;
    int IdPlaces;

    public Seance(int idSeance, double heure, String date, int idSalle, int idFilm, int idPlaces) {
        this.idSeance = idSeance;
        this.heure = heure;
        this.date = date;
        IdSalle = idSalle;
        IdFilm = idFilm;
        IdPlaces = idPlaces;
    }

    public Seance(int idFilm, String dateSeance, int idSalle, int heure) {
        this.heure = heure;
        this.date = dateSeance;
        IdSalle = idSalle;
        IdFilm = idFilm;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public double getHeure() {
        return heure;
    }

    public void setHeure(double heure) {
        this.heure = heure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public int getIdSalle() {
        return IdSalle;
    }

    public void setIdSalle(int idSalle) {
        IdSalle = idSalle;
    }

    public int getIdFilm() {
        return IdFilm;
    }

    public void setIdFilm(int idFilm) {
        IdFilm = idFilm;
    }

    public int getIdPlaces() {
        return IdPlaces;
    }

    public void setIdPlaces(int idPlaces) {
        IdPlaces = idPlaces;
    }
}
