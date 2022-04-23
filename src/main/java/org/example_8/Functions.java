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
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setString(2, entries.getType());
            preparedStatement.setString(3, entries.getBed_type());
            preparedStatement.setInt(4, entries.getmax_quest());
            preparedStatement.setString(5, entries.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addBookingRoomFair(RoomFairEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO room_fair VALUES (?, ?, ?)");
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
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation_fair_relation VALUES (?, ?, ?)");
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
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE accomodation SET type = ?, max_quests = ?, bed_type = ?,description = ? WHERE id = ?");
            preparedStatement.setString(1, entries.getType());
            preparedStatement.setString(2, entries.getBed_type());
            preparedStatement.setInt(3, entries.getmax_quest());
            preparedStatement.setString(4, entries.getDescription());
            preparedStatement.setInt(5, entries.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRoomFair(RoomFairEntries entries) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE room_fair SET Id = ?, value = ? season = ?");
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
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE accomodation_fair_relation WHERE Id = ?, Id_room_fair ? Id_accomodation ?");
            preparedStatement.setInt(1, entries.getId());
            preparedStatement.setDouble(2, entries.getId_room_fair());
            preparedStatement.setInt(3, entries.getId_accomodation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

