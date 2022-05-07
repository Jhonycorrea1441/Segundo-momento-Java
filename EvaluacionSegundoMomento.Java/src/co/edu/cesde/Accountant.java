package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;

public class Accountant extends Person {
    private String leader;
    private String parking;

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
