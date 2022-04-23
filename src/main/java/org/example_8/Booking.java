package org.example_8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Main class with driver loading & reply from DB
 */

public class Booking {
    public static void main(String[] args) {
        ManageConnection manageConnection = new ManageConnection(); //driver loaded together with constructor
        Connection connection = ManageConnection.getconnection("jdbc:postgresql://localhost:5432/Booking","postgres","12345");

        int id = 0;
        Functions functions = new Functions(connection);

        //Creating statement - reply from DB
        try (Statement query =  connection.createStatement()){
            ResultSet reply = query.executeQuery("SELECT * FROM accomodation");
            while(reply.next()){
                id = (int) reply.getInt("id");
                String type = reply.getString("type");
                String bed_type = reply.getString("bed_type");
                Integer max_guests = reply.getInt("max_guests");
                String description = reply.getString("description");
                System.out.println(String.format("%s | %s | %s | %s | %s", id, type, bed_type,max_guests,description));

            }
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        AccomodationEntries entries = new AccomodationEntries(01, "spacious","large", 5,"common");
        functions.updateBooking(entries);
        System.out.println(entries.getId()+entries.getType()+entries.getBed_type()+entries.getmax_quest()+entries.getDescription());
    }
}
