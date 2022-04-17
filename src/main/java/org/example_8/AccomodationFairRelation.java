package org.example_8;

public class AccomodationFairRelation {
    private int id;
    private int id_accomodation;
    private int id_room_fair;

    public AccomodationFairRelation(int id, int id_accomodation, int id_room_fair) {
        this.id = id;
        this.id_accomodation = id_accomodation;
        this.id_room_fair = id_room_fair;
    }

    public int getId() {
        return id;
    }

    public int getId_accomodation() {
        return id_accomodation;
    }

    public int getId_room_fair() {
        return id_room_fair;
    }

    @Override
    public String toString() {
        return (String.format("%s | %s | %s", id, id_accomodation, id_room_fair));
    }
}
