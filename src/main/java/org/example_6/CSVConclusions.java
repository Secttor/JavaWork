package org.example_6;

/**
 * Main Class for results
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CSVConclusions {

    public static void main(String[] args) {
        CSVConclusions csv = new CSVConclusions();
        ArrayList<AthleteWork> athletes = csv.doCSV();
        AthleteWork[] athletes2 = athletes.toArray(new AthleteWork[0]); //converting from arraylist to array
        Comparator<AthleteWork> comparingAthletes = Comparator.comparing(AthleteWork::getFinalTime); //comparator to compare the final time
        Arrays.sort(athletes2, comparingAthletes);                      //only accepts array
        Arrays.stream(athletes2).forEach(System.out::println);          //print


    }

    public ArrayList<AthleteWork> doCSV() {
        ArrayList<AthleteWork> athletes = new ArrayList<>();
        String path = "C:\\Programming\\CSV.csv";                   //path of CSV file
        String line = "";                                           //variable for..nothing
        //try-catch block
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));       //BufferedReader object - pass to FileReader ;
            while ((line = br.readLine()) != null) {                            //read one line and store in line
                String[] values = line.split(",");
                athletes.add(new AthleteWork(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return athletes;
    }

}
