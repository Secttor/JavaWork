package org.example_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingTest {
    @Test
    public void insertInfo() {
        AccomodationEntries entries = new AccomodationEntries(1, "something", "something2", 12, "common");
        Functions functions = new Functions(ManageConnection.getconnection("jdbc:postgresql://localhost:5432/Booking", "postgres", "12345")); //makes the connection with username/password
        functions.updateBooking(entries); //persist info into the DB

        Connection connection = ManageConnection.getconnection("jdbc:postgresql://localhost:5432/Booking", "postgres", "12345");
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM accomodation WHERE id = ?");
            preparedStatement.setInt(1, 1);
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){                                               //get the information when the id is the same
                System.out.println(result.getInt(1));
            }
            Assertions.assertEquals(1,result.getInt(1));   //compare sent value with the one from DB
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

