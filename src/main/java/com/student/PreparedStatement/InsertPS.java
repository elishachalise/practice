package com.student.PreparedStatement;

import com.student.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPS {
    public static final String SQL="insert into student_tbl (student_name,faculty,parent_name,email,mobile_no)values(?,?,?,?,?)";

    public static void main(String[] args) {
        try(PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL)){

            ps.setString(1,"gg");
            ps.setString(2,"science");
            ps.setString(3,"gg");
            ps.setString(4,"gg@gmail.com");
            ps.setLong(5,95623471);
            ps.executeUpdate();
            System.out.println("data inserted with prepared statement.....");
        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }


}
