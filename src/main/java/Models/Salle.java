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

    public void setNbSalle(int nbSalle) {
        this.nbSalle = nbSalle;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
}
