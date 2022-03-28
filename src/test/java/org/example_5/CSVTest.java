package org.example_5;

import org.example_6.AthleteWork;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.example_6.CSVConclusions.doCSV;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Testing the timing for each athlete
 */

public class CSVTest {
    @Test
    public void calculateFinalTimeTest() {
        AthleteWork a = new AthleteWork("11", "Umar Jorgson", "SK", "30:27:00", "xxxox", "xxxxx", "xxoxo");
        assertEquals("30:57", a.getFinalTime(), "Incorrect for Umar Jorgson");

        AthleteWork b = new AthleteWork("1", "Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo");
        assertEquals("30:15", b.getFinalTime(), "Incorrect for Jimmy Smiles");

        AthleteWork c = new AthleteWork("27", "Piotr Smitzer", "CZ", "30:10", "xxxxx", "xxxxx", "xxxxx");
        assertEquals("30:10", c.getFinalTime(), "Incorrect for Piotr Smitzer");
    }

    @Test
    public void doCSVTest(){
        ArrayList<AthleteWork> athletes = new ArrayList<>();
        athletes.add(new AthleteWork("11", "Umar Jorgson", "SK", "30:27:00", "xxxox", "xxxxx", "xxoxo"));
        athletes.add(new AthleteWork("1", "Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo"));
        athletes.add(new AthleteWork("27", "Piotr Smitzer", "CZ", "30:10", "xxxxx", "xxxxx", "xxxxx"));
        assertEquals(athletes,doCSV());

    }
}
