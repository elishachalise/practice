package com.student.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class student_db {
    public static String DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/";
    public static String USER_NAME="root";
    public static String PASSWORD="root1234";
    public static String SQL="create database student_db";

    public static void main(String[] args) {
        Connection con=null;
        Statement st = null;

        try {
            Class.forName(DRIVER);
            con= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            st=con.createStatement();
            st.execute(SQL);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
