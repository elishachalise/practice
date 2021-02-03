package com.student.st;

import com.student.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InserDemo {

    public static String SQL ="insert into student_tbl(student_name ,faculty ,parent_name ,email,mobile_no )values('gg','gg','gg','gg@gmail.com',9638527410)";


    public static void main(String[] args) {


        try (
                Statement st= DbUtil.getConnection().createStatement(); ){

            st.executeUpdate(SQL);
            System.out.println("Data Inserted....");


        } catch ( ClassNotFoundException| SQLException e) {
            e.printStackTrace();
        }
    }
}
