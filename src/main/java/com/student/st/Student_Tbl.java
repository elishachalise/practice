package com.student.st;

import com.student.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Tbl {

    public static String SQL ="create table student_tbl(id int not null auto_increment,student_name varchar(50),faculty varchar(50),parent_name varchar(50),email varchar(50),mobile_no bigint(100),primary key(id))";


    public static void main(String[] args) {


        try (
                Statement st= DbUtil.getConnection().createStatement(); ){

            st.executeUpdate(SQL);
            System.out.println("table created...");


        } catch ( ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}
