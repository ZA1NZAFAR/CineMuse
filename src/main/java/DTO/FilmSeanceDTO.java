package DTO;

import Models.Film;
import Models.Places;
import Models.Seance;

import java.io.StringWriter;

public class FilmSeanceDTO {
    Seance seanceID;
    Film film;

    public FilmSeanceDTO(Seance seanceID, Film film) {
        this.seanceID = seanceID;
        this.film = film;
    }

    public Seance getSeanceID() {
        return seanceID;
    }

    public void setSeanceID(Seance seanceID) {
        this.seanceID = seanceID;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getHtml() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("<img style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"" + film.getAddressPhoto() + "\" alt=\"\" width=\"300\" height=\"200\" />");
        stringWriter.write("<h1 style=\"text-align: center;\">" + film.getNom() + "(" + film.getAnnee() + ")" + "</h1>");
        stringWriter.write("<p style=\"text-align: center;\">Horaires : " + seanceID.getHeure() + "&nbsp;</p>");
        stringWriter.write("<p style=\"text-align: center;\">Genre : " + film.getGenre() + "&nbsp;</p>");
        stringWriter.write("<p style=\"text-align: center;\">Duration : " + film.getDuree() + " minutes</p>");
        stringWriter.write("<p style=\"text-align: center;\">Price : $" + film.getPrix() + "</p>");
        return stringWriter.toString();
    }

    public String getForm() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("<form style=\"text-align: center\" action=\"Reservation.jsp\" method=\"post\">");
        stringWriter.write(getHtml());
        stringWriter.write(getFields());
        stringWriter.write("<input type=\"submit\" value=\"Reserver\">");
        stringWriter.write("</form>");
        return stringWriter.toString();
    }

    public String getFields() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("<input type=\"hidden\" value=\"" + film.getId() + "\" name=\"CurrentFilmId\">\n");
        stringWriter.write("<input type=\"hidden\" value=\"" + film.getNom() + "\" name=\"CurrentFilmName\">\n");
        stringWriter.write("<input type=\"hidden\" value=\"" + film.getPrix() + "\" name=\"CurrentFilmPrice\">\n");
        stringWriter.write("<input type=\"hidden\" value=\"" + seanceID.getIdSeance() + "\" name=\"CurrentSessionId\">\n");
        stringWriter.write("<input type=\"hidden\" value=\"" + seanceID.getIdSalle() + "\" name=\"CurrentSalleId\">\n");
        stringWriter.write("<input type=\"hidden\" value=\"" + seanceID.getDate() + "\" name=\"CurrentSessionDate\">\n");
        return stringWriter.toString();
    }
}

