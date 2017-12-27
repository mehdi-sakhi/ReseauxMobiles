package models;

public class Position

{

    public Double width;

    public Double leght;

    public Coordonnee origine;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLeght() {
        return leght;
    }

    public void setLeght(Double leght) {
        this.leght = leght;
    }

    public Position(Double width, Double leght, Coordonnee origine) {
        this.width = width;
        this.leght = leght;
        this.origine = origine;
    }
}
