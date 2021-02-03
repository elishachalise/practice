package com.student.st;

import com.student.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL="delete from student_tbl where id=7";

    public static void main(String[] args) {
        try(Statement st = DbUtil.getConnection().createStatement()){
            st.executeUpdate(SQL);
            System.out.println("data deleted.....");

        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}
