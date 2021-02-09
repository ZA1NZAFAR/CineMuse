package Models;

import Tools.DbTools;

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

    public int getIdReservation() {
        return idReservation;
    }

    public String getDate() {
        return date;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public int getIdTarif() {
        return idTarif;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public String getPlacesToReserve() {
        return placesToReserve;
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

    public String getHtmlCell() throws Exception {
        String s = "    <tr>\n" +
                "        <td>" + this.idReservation + " </td>\n" +
                "        <td>" + this.date + " </td>\n" +
                "        <td>" + new DbTools().getFilmById(idFilm) + " </td>\n" +
                "        <td> Salle " + idSalle + " </td>\n" +
                "        <td>" + this.placesToReserve + " </td>\n" +
                "        <td>" + this.prixTotal + " </td>\n" +
                "    </tr>";
        return s;
    }
}
