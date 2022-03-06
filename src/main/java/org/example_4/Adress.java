package org.example_4;

/**
 * Class for Adress constructor & toString
 */
public class Adress {

    String country, region, city;
    int postalcode;

    @Override
    public String toString() {
        return "adress : " +
                "country ='" + country + '\'' +
                ", region ='" + region + '\'' +
                ", city ='" + city + '\'' +
                ", postalcode = " + postalcode + "."
                ;
    }

    public Adress(String country, String region, String city, int postalcode) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.postalcode = postalcode;
    }
}
