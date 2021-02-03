package com.student.st;

import com.student.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL="update student_tbl set  student_name='abhinav' ,faculty='management' ,parent_name='aditya' where id=1";

    public static void main(String[] args) {
        try(Statement st = DbUtil.getConnection().createStatement()){
            st.executeUpdate(SQL);
            System.out.println("Data Updated....");

        } catch (ClassNotFoundException|SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
