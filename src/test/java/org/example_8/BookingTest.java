package org.example_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Test for AccomodationEntries - changing the id is required for a new try
 */
public class BookingTest {
    @Test
    public void insertInfo() {
        AccomodationEntries entries = new AccomodationEntries(21,"spacious", "large", 5, "common");
        Functions functions = new Functions(ManageConnection.getconnection("jdbc:postgresql://localhost:5432/Booking", "postgres", "12345")); //makes the connection with username/password
        functions.addBookingAccomodation(entries); //persist info into the DB

        Connection connection = ManageConnection.getconnection("jdbc:postgresql://localhost:5432/Booking", "postgres", "12345");
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM accomodation WHERE id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet result = preparedStatement.executeQuery();

            String description = "";
            int id = 0;

            while (result.next()) {                                               //get the information when the id is the same
                //See information
                System.out.println(result.getInt("id"));
                System.out.println(result.getString("type"));
                System.out.println(result.getString("description"));
                id = result.getInt("id");
                description = result.getString("description");
            }

            Assertions.assertEquals("common", description);        //compare sent value with the one from DB
            Assertions.assertEquals(21, id);   //compare sent value with the one from DB

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


