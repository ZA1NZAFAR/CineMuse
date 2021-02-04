package Models;

import java.io.StringWriter;

public class Places {
    int IdPlace;
    int[] places = new int[50];

    public Places(int idPlace, int[] places) {
        IdPlace = idPlace;
        this.places = places;
    }

    public int getIdPlace() {
        return IdPlace;
    }

    public void setIdPlace(int idPlace) {
        IdPlace = idPlace;
    }

    public int[] getPlaces() {
        return places;
    }

    public void setPlaces(int[] places) {
        this.places = places;
    }

    public String getHtml() {
        StringWriter out = new StringWriter();
        out.write("<table>");
        for (int i = 0; i < 5; i++) {
            out.write("<tr>");
            for (int j = 0; j < 10; j++) {
                out.write("<td bgcolor = \"" + (places[((10 * i) + j)] == 0 ? "Green" : "Red") + "\">" + ((10 * i) + j) + "</td>");
            }
            out.write("</tr>");
        }

        out.write("</table>");

        return out.toString();
    }
}
