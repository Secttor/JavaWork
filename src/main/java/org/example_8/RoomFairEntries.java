package org.example_8;

public class RoomFairEntries {
    private int id;
    private double value;
    private String season;

    public RoomFairEntries(int id, double value, String season){
        this.id = id;
        this.value = value;
        this.season = season;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getSeason() {
        return season;
    }
    @Override
    public String toString() {
        return (String.format("%s | %s | %s", id, value, season));
    }
}
