package Models;

public class Tarif {
    double prix;
    String type;

    public Tarif(double prix, String type) {
        this.prix = prix;
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
