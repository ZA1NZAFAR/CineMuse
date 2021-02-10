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

    public int[] getPlaces() {
        return places;
    }

    public String getSql() {
        String sql = "UPDATE  places " +
                "SET \n";
        boolean comma = true;
        for (int i = 0; i < 50; i++) {
            if (places[i] == 1) {
                if (comma) {
                    sql += "    p" + i + " = " + places[i];
                    comma = false;
                } else
                    sql += ",\n p" + i + " = " + places[i];
            }
        }
        sql += "\n WHERE IdPlaces = " + IdPlace + ";";
        return sql;
    }


    public String getHtml() {
        StringWriter out = new StringWriter();
        out.write("<table>");
        for (int i = 0; i < 5; i++) {
            out.write("<tr>");
            for (int j = 0; j < 10; j++) {
                out.write("<td bgcolor = \"" + (places[((10 * i) + j)] == 0 ? "Green" : "Red") + "\">");
                if (places[((10 * i) + j)] == 0)
                    out.write("<input style=\"zoom:2;\"type=\"checkbox\" value=\"" + ((10 * i) + j) + "\" name=\"idPlaceToReserve" + ((10 * i) + j) + "\">\n");
                else if (places[((10 * i) + j)] == 1)
                    out.write("<h3>Reserved</h3>");
                out.write("</td>");
            }
            out.write("</tr>");
        }
        out.write("</table>");

        return out.toString();
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < places.length; i++) {
            if (places[i] > 0)
                res += "Place " + i + " - ";
        }
        return res;
    }
}
