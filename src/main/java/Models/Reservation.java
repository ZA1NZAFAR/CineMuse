package Models;

import java.sql.Date;

public class Reservation {
    Date date;
    Sceance sceance;
    Person person;
    Salle salle;
    Tarif tarif;

    public Reservation(Date date, Sceance sceance, Person person, Salle salle, Tarif tarif) {
        this.date = date;
        this.sceance = sceance;
        this.person = person;
        this.salle = salle;
        this.tarif = tarif;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Sceance getSceance() {
        return sceance;
    }

    public void setSceance(Sceance sceance) {
        this.sceance = sceance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }
}
