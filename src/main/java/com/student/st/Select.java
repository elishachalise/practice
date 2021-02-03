package com.student.st;

import com.student.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

    public static final String SQL="select * from student_tbl";

    public static void main(String[] args) {
        try(Statement st = DbUtil.getConnection().createStatement()){
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1));
                System.out.println("Student Name: "+rs.getString(2));
                System.out.println("Facult: "+rs.getString(3));
                System.out.println("Parents Name: "+rs.getString(4 ));
                System.out.println("Email: "+rs.getString(5));
                System.out.println("Mobile: "+rs.getLong(6));
                System.out.println("==========================================");
            }

        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}
