package org.example_8;

/** Class to define the constructor, getters & toString for Accomodation
 */
public class AccomodationEntries {
    private int id;
    private String type;
    private String bed_type;
    private int max_quests;
    private String description;

    public AccomodationEntries(int id, String type, String bed_type, int max_quests, String description) {
        this.id = id;
        this.type = type;
        this.bed_type = bed_type;
        this.max_quests = max_quests;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public int getmax_quest() {
        return max_quests;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (String.format("%s | %s | %s | %s | %s", id, type, bed_type,max_quests,description));
    }
}
