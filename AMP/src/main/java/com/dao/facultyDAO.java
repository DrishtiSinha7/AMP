package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Faculty;

public class facultyDAO {

    private Connection conn;

    public facultyDAO(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addFaculty(Faculty faculty) {
        boolean success = false;
        try {
            String sql = "INSERT INTO faculty (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, faculty.getName());
            ps.setString(2, faculty.getEmail());
            ps.setString(3, faculty.getPassword());
            

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }

    public boolean validateFaculty(String email, String password) {
        boolean isValid = false;
        try {
            String sql = "SELECT * FROM faculty WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            isValid = rs.next(); // If result set has next, credentials are valid
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
