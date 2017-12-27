package models;

import java.util.List;

public class Territoire extends Forme{

    private  String nom;

    private List<Maille> mailleList;

    public Territoire(List<Coordonnee> coordonnees,String nom) {
        super(coordonnees);
        this.nom=nom;
    }

    public Territoire(String cheminFichierGeoJSON,String nom) {
        super(cheminFichierGeoJSON);
        this.nom=nom;
    }

    public List<Maille> getMailleList() {
        return mailleList;
    }

    public void setMailleList(List<Maille> mailleList) {
        this.mailleList = mailleList;
    }

}
