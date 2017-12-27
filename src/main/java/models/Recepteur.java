package models;

public class Recepteur {

    public Coordonnee coordonnee    ;

    public Double gainRecu;

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }

    public Double getGainRecu() {
        return gainRecu;
    }

    public void setGainRecu(Double gainRecu) {
        this.gainRecu = gainRecu;
    }

    public Recepteur(Double gainRecu) {
        this.gainRecu = gainRecu;
    }
}
