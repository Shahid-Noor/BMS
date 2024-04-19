/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author shahid
 */
public class TestDBConnection {
    
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/test";    // test is the name of db created in xamp to store below data for accessing
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from Students where campus = 'hangu' ");
                  rs = statement.executeQuery("select * from Students where campus = 'Hangu' and Marks>=60");
                  rs = statement.executeQuery("select MIN(marks) As minimum marks from Students where marks<60");
                  rs = statement.executeQuery("select Distinct Name from Students");
                  rs = statement.executeQuery("Delete from students where name ='Aslam'");
        while(rs.next()) {
            System.out.println(rs.getInt("account_number") + " - " + rs.getString("account_title"));
        }
    }
    
}
