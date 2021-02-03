package com.student.PreparedStatement;

import com.student.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectWhere {
    public static final String SQL="select * from student_tbl where id=?";

    public static void main(String[] args) {
        try(PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL)){
            ps.setInt(1,2);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Student Name: "+rs.getString(2));
                System.out.println("Faculty: "+rs.getString(3));
                System.out.println("Parent's Name: "+rs.getString(4));
                System.out.println("Email: "+rs.getString(5));
                System.out.println("Mobile no: "+rs.getLong(6));
                System.out.println("==============================================");
            }
        } catch (ClassNotFoundException| SQLException e) {
            e.printStackTrace();
        }
    }

}
