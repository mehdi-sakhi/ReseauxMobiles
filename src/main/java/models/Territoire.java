package models;

import java.util.List;

public class Territoire {

    public Position position;

    public List<Maille> mailleList;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Maille> getMailleList() {
        return mailleList;
    }

    public void setMailleList(List<Maille> mailleList) {
        this.mailleList = mailleList;
    }

}
