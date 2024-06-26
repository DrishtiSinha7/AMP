package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Student;

public class studentDAO {

    private Connection conn;

    public studentDAO(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addStudent(Student u) {
        boolean f = false;
        try {
            String sql = "INSERT INTO student (name, email, password, phone) VALUES (?, ?, ?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getPhone());
            
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public Student login(String em, String psw) {
        Student u = null;
        try {
            String sql = "SELECT * FROM student WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, em);
            ps.setString(2, psw);
           
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Student();
                u.setSid(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
                u.setPhone(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    public boolean validateStudent(String em, String psw) {
        boolean isValid = false;
        try {
            String sql = "SELECT * FROM student WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, em);
            ps.setString(2, psw);

            ResultSet rs = ps.executeQuery();
            isValid = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
