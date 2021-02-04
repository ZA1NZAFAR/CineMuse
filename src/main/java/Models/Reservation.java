package Models;

public class Reservation {
    int idReservation;
    int idSeance;
    int idPerson;
    int idSalle;
    int idTarif;
    String date;
    double prixTotal;

    public Reservation(int idReservation, int idSeance, int idPerson, int idSalle, int idTarif, String date, double prixTotal) {
        this.idReservation = idReservation;
        this.idSeance = idSeance;
        this.idPerson = idPerson;
        this.idSalle = idSalle;
        this.idTarif = idTarif;
        this.date = date;
        this.prixTotal = prixTotal;
    }

    public Reservation(String date, int idSeance, int idPerson, int idSalle, int idTarif, double prixTotal) {
        this.date = date;
        this.idSeance = idSeance;
        this.idPerson = idPerson;
        this.idSalle = idSalle;
        this.idTarif = idTarif;
        this.prixTotal = prixTotal;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }
}
