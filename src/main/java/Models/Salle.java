package Models;

public class Salle {
    int nbSalle;
    int nbPlace;

    public Salle(int nbSalle, int nbPlace) {
        this.nbSalle = nbSalle;
        this.nbPlace = nbPlace;
    }


    public int getNbSalle() {
        return nbSalle;
    }
    public int getNbPlace() {
        return nbPlace;
    }
}
