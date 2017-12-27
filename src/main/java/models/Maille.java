package models;

import java.util.Map;

public class Maille {

    public Position position;

    public Map<Antenne, Coordonnee> antenneCoordonneeMap;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map<Antenne, Coordonnee> getAntenneCoordonneeMap() {
        return antenneCoordonneeMap;
    }

    public void setAntenneCoordonneeMap(Map<Antenne, Coordonnee> antenneCoordonneeMap) {
        this.antenneCoordonneeMap = antenneCoordonneeMap;
    }
}
