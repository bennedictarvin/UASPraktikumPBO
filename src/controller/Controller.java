/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;

public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table users
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setUserEmail(rs.getString("userEmail"));
                user.setUserGender(rs.getString("userGender"));
                user.setUserCategory(rs.getString("userCategory"));
                user.setUserFollowers(rs.getInt("userFollowers"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return (users);
    }

    // INSERT
    public static boolean insertNewUser(User user) {
        conn.connect();
        String query = "INSERT INTO user VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, user.getUserId());
            stmt.setString(2, user.getUserName());
            stmt.setString(3, user.getUserEmail());
            stmt.setString(4, user.getUserGender());
            stmt.setString(5, user.getUserCategory());
            stmt.setInt(6, user.getUserFollowers());
            stmt.executeUpdate();
            conn.disconnect();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            conn.disconnect();
            return (false);
        }
    }

}
