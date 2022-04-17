package org.example_8;

import java.sql.*;
import java.sql.PreparedStatement;

public class Functions {
    private Connection connection;

    public Functions(Connection connection) {
        this.connection = connection;
    }

    public void addBookingAccomodation(AccomodationEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT entries (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setString(2, entries.getType());
            preparedStatement.setString(3, entries.getBed_type());
            preparedStatement.setInt(4, entries.getMax_quest());
            preparedStatement.setString(5, entries.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBookingRoomFair(RoomFairEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT entries (?, ?, ?)");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setDouble(2, entries.getValue());
            preparedStatement.setString(3, entries.getSeason());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBookingFairRelation(AccomodationFairRelation entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT entries (?, ?, ?)");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setInt(2, entries.getId_room_fair());
            preparedStatement.setInt(3, entries.getId_accomodation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBooking(AccomodationEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE entries Id = ?, type = ? Bed_type = ?, Max_quest = ? , description = ?");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setString(2, entries.getType());
            preparedStatement.setString(3, entries.getBed_type());
            preparedStatement.setInt(4, entries.getMax_quest());
            preparedStatement.setString(5, entries.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRoomFair(RoomFairEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE entries Id = ?, value = ? season = ?");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setDouble(2, entries.getValue());
            preparedStatement.setString(3, entries.getSeason());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAccomodationFairRelation(AccomodationFairRelation entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE entries Id = ?, Id_room_fair ? Id_accomodation ?");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setDouble(2, entries.getId_room_fair());
            preparedStatement.setInt(3, entries.getId_accomodation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

