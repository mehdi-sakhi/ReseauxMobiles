package models;

import java.util.List;

public class Forme {
    private List<Coordonnee> coordonnees;

    public Forme(List<Coordonnee> coordonnees) {
        this.coordonnees = coordonnees;
    }
    public Forme(String cheminFichierGeoJSON) {
       // lecture du fichier ...
    }
}
