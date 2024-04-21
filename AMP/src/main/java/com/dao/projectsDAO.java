package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.projects;




public class projectsDAO {
	
	private Connection conn;

	public projectsDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addHostels(projects h) {

		boolean f = false;
		try {

			String sql = "insert into hostel(name,description,field,status) values(?,?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, h.getName());
			ps.setString(2, h.getDescription());
			ps.setString(3, h.getField());
			ps.setString(4, h.getStatus());
			

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean addHostelForHostelAdmin(projects h, int hostelAdminId) {
	    boolean f = false;
	    try {
	        String sql = "INSERT INTO hostel (name, description, field, status, ) VALUES ( ?, ?, ?, ?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, h.getName());
	        ps.setString(2, h.getDescription());
	        ps.setString(3, h.getField());
	        ps.setString(4, h.getStatus());
	        
	       
	        int i = ps.executeUpdate();

	        if (i == 1) {
	            f = true;
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return f;
	}

}
