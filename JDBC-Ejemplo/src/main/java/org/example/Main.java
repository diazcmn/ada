package org.example;

import java.net.URL;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String USER = "root";
        String PASSWORD = "root";
        String url = "jdbc:mysql://locahost/jdbc?useSSL=false";

        try{

            Connection connection = DriverManager.getConnection(url, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from registros");

            while (resultSet.next()){

                System.out.println(resultSet.getString("nombre"));
            }
            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLException e ){

            e.printStackTrace();
        }
    }
}