package Models;

public class Filters {
    private int annee;
    private String genre;
    private String langue;

    public Filters() {
        annee = 0;
        genre = null;
        langue = null;
    }

    public Filters(int annee, String genre, String langue) {
        this.annee = annee;
        this.genre = genre;
        this.langue = langue;
    }

    public boolean noFilters() {
        return annee == 0 && null == genre && null == langue;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}
