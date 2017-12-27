package models;

public class Antenne {

    public double frequence;
    public Coordonnee position;
    public double puissance;
    public double gain;

    public Coordonnee getPosition() {
        return position;
    }

    public void setPosition(Coordonnee position) {
        this.position = position;
    }




    public double getFrequence() {
        return frequence;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }


    public Antenne(Double frequence, Double puissance, Double gain) {
        this.frequence = frequence;
        this.puissance = puissance;
        this.gain = gain;
    }
}
