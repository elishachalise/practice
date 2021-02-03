package com.student.PreparedStatement;

import com.student.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePS {
    public static final String SQL="update student_tbl set student_name=?,faculty=?,parent_name=? where id=?";

    public static void main(String[] args) {
        try(PreparedStatement ps= DbUtil.getConnection().prepareStatement(SQL)){
            ps.setString(1,"elisha");
            ps.setString(2,"humanities");
            ps.setString(3,"elish");
            ps.setInt(4,5);
            ps.executeUpdate();
            System.out.println("Data Updated using prepared statement.....");


        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}
