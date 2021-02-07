package Models;

public class Reservation {
    int idReservation;
    String date;
    int idSeance;
    int idPerson;
    int idSalle;
    int idTarif;
    int idFilm;
    double prixTotal;
    String placesToReserve;


    public Reservation(String date, int idSeance, int idPerson, int idSalle, int idTarif, double prixTotal, int idFilm, String placesToReserve) {
        this.date = date;
        this.idSeance = idSeance;
        this.idPerson = idPerson;
        this.idSalle = idSalle;
        this.idTarif = idTarif;
        this.prixTotal = prixTotal;
        this.idFilm = idFilm;
        this.placesToReserve = placesToReserve;
    }

    public Reservation(int idReservation, String date, int idSeance, int idPerson, int idSalle, int idTarif, double prixTotal, int idFilm, String placesToReserve) {
        this.idReservation = idReservation;
        this.date = date;
        this.idSeance = idSeance;
        this.idPerson = idPerson;
        this.idSalle = idSalle;
        this.idTarif = idTarif;
        this.prixTotal = prixTotal;
        this.idFilm = idFilm;
        this.placesToReserve = placesToReserve;
    }

    public String getSql() {
        String sql = "INSERT INTO `reservation`\n" +
                "(`DATE`, `IdSeance`, `IdFilm`, `IdPerson`, `IdSalle`, `Prix`, `IdTarif`, `PlacesReserves`) \n" +
                "VALUES \n" +
                "(\"" + date + "\"," + idSeance + "," + idFilm + "," + idPerson + "," + idSalle + "," + prixTotal + "," + idTarif + ",\"" + placesToReserve + "\")";
        return sql;
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

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", date='" + date + '\'' +
                ", idSeance=" + idSeance +
                ", idPerson=" + idPerson +
                ", idSalle=" + idSalle +
                ", idTarif=" + idTarif +
                ", idFilm=" + idFilm +
                ", prixTotal=" + prixTotal +
                ", placesToReserve='" + placesToReserve + '\'' +
                '}';
    }
}
