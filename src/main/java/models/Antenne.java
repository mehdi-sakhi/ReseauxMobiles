package models;

public class Antenne {

    public Double frequence;

    public Double puissance;

    public Double gain;

    public Coordonnee coordonnee;

    public Double getFrequence() {
        return frequence;
    }

    public void setFrequence(Double frequence) {
        this.frequence = frequence;
    }

    public Double getPuissance() {
        return puissance;
    }

    public void setPuissance(Double puissance) {
        this.puissance = puissance;
    }

    public Double getGain() {
        return gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }

    public Antenne(Double frequence, Double puissance, Double gain) {
        this.frequence = frequence;
        this.puissance = puissance;
        this.gain = gain;
    }
}
