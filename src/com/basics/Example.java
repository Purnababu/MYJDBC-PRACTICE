package com.basics;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/purna", "root", "root");
        Statement st = c.createStatement();
       // st.executeUpdate("create table student(sno int(5), sname varchar(30))"); // Added the missing parenthesis
        st.executeUpdate("insert into student values(24,'purna')");
        System.out.println("table created");
        c.close();
    }
}

