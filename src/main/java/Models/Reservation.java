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

    public int getIdSalle() {
        return idSalle;
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
