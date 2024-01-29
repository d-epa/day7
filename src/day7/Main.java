package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3307/student";
        String username = "root";
        String password = "root";
        String qurey = "select *from students";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");
        String qu = " create table user_s(\n" + "id int,\n" + "Name varchar(200));";
        Statement stm = con.createStatement();
        stm.execute(qu);
        con.close();
        System.out.println("connection closed");
    }
}