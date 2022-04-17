package org.example_8;

public class AccomodationEntries {
    private int id;
    private String type;
    private String bed_type;
    private int max_quest;
    private String description;

    public AccomodationEntries(int id, String type, String bed_type, int max_quest, String description) {
        this.id = id;
        this.type = type;
        this.bed_type = bed_type;
        this.max_quest = max_quest;
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

    public int getMax_quest() {
        return max_quest;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (String.format("%s | %s | %s | %s | %s", id, type, bed_type,max_quest,description));
    }
}
