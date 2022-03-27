package org.example_6;

/**
 * Additional Class for calculations
 */

public class AthleteWork {
    private int AthleteNumber;
    private String AthleteName;
    private String CountryCode;
    private String SkiTimeResult;

    private String FinalTime;

    public AthleteWork(String athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingRange, String secondShooting, String thirdShootingRange) {
        this.AthleteNumber = Integer.parseInt(athleteNumber);              //from String to Integer
        this.AthleteName = athleteName;
        this.CountryCode = countryCode;
        this.SkiTimeResult = skiTimeResult;
        this.calculateFinalTime(firstShootingRange, secondShooting, thirdShootingRange);      //calls the method to calculate the final time
    }

    public void calculateFinalTime(String firstShootingRange, String secondShooting, String thirdShootingRange) {
        char[] first = firstShootingRange.toCharArray();                                      //each character is an index of array
        char[] second = secondShooting.toCharArray();
        char[] third = thirdShootingRange.toCharArray();
        if (first.length < 5 || second.length < 5 || third.length < 5) {
            throw new IllegalArgumentException("Not enough tryings");           //exception for less number of tryings
        }
        if (first.length > 5 || second.length > 5 || third.length > 5)
            throw new IllegalArgumentException("Too many tries");               //exception for larger number of tryings
        int addedtime = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == 'o') {
                addedtime += 10;
            }
            if (second[i] == 'o') {
                addedtime += 10;
            }
            if (third[i] == 'o') {
                addedtime += 10;
            }
        }
        StringBuilder finaltime = new StringBuilder();          //StringBuilder = String with additional methods to manipulate
        int seconds = addedtime % 60;
        int minutes = addedtime / 60;
        String[] time = SkiTimeResult.split(":");
        finaltime.append(Integer.parseInt(time[0]) + minutes + ":");
        finaltime.append(Integer.parseInt(time[1]) + seconds);
        FinalTime = finaltime.toString();
    }

    public String getFinalTime() {
        return FinalTime;
    }

    public String toString() {
        return "Name: " + AthleteName + " Country: " + CountryCode + " Time: " + FinalTime;
    }
}
