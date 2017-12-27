package models;

import java.util.List;
import java.util.Map;

public class Maille extends Territoire{


    public List<Antenne> antennes;

    public Maille(List<Coordonnee> coordonnees, String nom) {
        super(coordonnees, nom);
    }

    public Maille(String cheminFichierGeoJSON, String nom) {
        super(cheminFichierGeoJSON, nom);
    }


    public List<Antenne> getAntennes() {
        return antennes;
    }

    public void setAntennes(List<Antenne> antennes) {
        this.antennes = antennes;
    }
    public void ajouterAntenne(Antenne antenne)
    {
        antennes.add(antenne);
    }
    public void supprimerAntenne(Antenne antenne)
    {
        antennes.remove(antenne);
    }
}
