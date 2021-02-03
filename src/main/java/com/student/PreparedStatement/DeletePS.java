package com.student.PreparedStatement;

import com.student.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePS {

    public static final String SQL="delete from student_tbl where id=?";

    public static void main(String[] args) {
        try(PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL)){
            ps.setInt(1,6);
            ps.executeUpdate();
            System.out.println("data deleted using prepared statement....");

        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}
