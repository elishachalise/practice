package com.student.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {


    public static String DRIVER ="com.mysql.cj.jdbc.Driver";
    public static String URL ="jdbc:mysql://localhost:3306/student_db";
    public static String USER_NAME ="root";
    public static String PASSWORD ="root1234";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }

}