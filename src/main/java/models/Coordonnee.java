package models;

public class Coordonnee {

    public Double x;

    public Double y;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }


    public Coordonnee(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
}
