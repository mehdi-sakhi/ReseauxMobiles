package models;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.geojson.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Forme {
    private List<Coordonnee> coordonnees=new LinkedList<>();

    public Forme(List<Coordonnee> coordonnees) {
        this.coordonnees = coordonnees;
    }
    public Forme(String cheminFichierGeoJSON) {
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(cheminFichierGeoJSON);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            GeoJsonObject object = new ObjectMapper().readValue(inputStream, GeoJsonObject.class);
            if (object instanceof Polygon) {
                System.out.println("Polygon");

            } else if (object instanceof Feature) {

                //solution temporaire
               String coords=((Feature) object).getGeometry().toString();
               String s="";
                for (int i=0;i<coords.length();i++)
                {
                  if (coords.charAt(i)==',' || coords.charAt(i)=='.' || Character.isDigit(coords.charAt(i)))
                  {
                      s+=coords.charAt(i);
                  }
                }
                String[] nombres=s.split(Pattern.quote(",,"));
                for (int i=0;i<nombres.length;i=i+1)
                {
                    String[] ss=nombres[i].split(Pattern.quote(","));
                    coordonnees.add(new Coordonnee(Double.parseDouble(ss[0]),Double.parseDouble(ss[1])));
                }
               System.out.println(coordonnees);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Coordonnee> getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(List<Coordonnee> coordonnees) {
        this.coordonnees = coordonnees;
    }
}
