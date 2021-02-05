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

    public String getSql() {
        String sql = "UPDATE  places " +
                "SET \n";
        boolean comma = true;
        for (int i = 0; i < 50; i++) {
            if (places[i] == 1) {
                if (comma) {
                    sql += "    p" + i + " = " + places[i];
                    comma = false;
                }
                else
                    sql += ",\n p" + i + " = " + places[i];
            }
        }
        sql += "\n WHERE IdPlaces = " + IdPlace + ";";
        return sql;
    }


    public String getHtml() {
        StringWriter out = new StringWriter();
        out.write("<form style=\"text-align: center\" action=\"/CineMuse-V1/Reservation\" method=\"post\">");
        out.write("<table>");
        for (int i = 0; i < 5; i++) {
            out.write("<tr>");
            for (int j = 0; j < 10; j++) {
                out.write("<td bgcolor = \"" + (places[((10 * i) + j)] == 0 ? "Green" : "Red") + "\">");
                out.write("<input type=\"checkbox\" value=\"" + ((10 * i) + j) + "\" name=\"idPlaceToReserve" + ((10 * i) + j) + "\">\n");
                out.write("</td>");
            }
            out.write("</tr>");
        }
        out.write("<tr>");
        out.write("<td> <input type=\"submit\" value=\"Reserver\"></td>");
        out.write("</form>");
        out.write("</tr>");

        out.write("</table>");

        return out.toString();
    }
}
