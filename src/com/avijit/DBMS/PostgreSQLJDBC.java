package com.avijit.DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    private final String url = "jdbc:postgresql://localhost:5432/nytaxi";
    private final String user = "postgres";
    private final String password = "avizyt@89";
    public static void main(String[] args) {

        PostgreSQLJDBC app = new PostgreSQLJDBC();
        app.connect();
//
//
////        Statement stmt = con.createStatement();
////        ResultSet rs = stmt.executeQuery("SELECT y.'VendorID', y.fare_amount, y.extra, y.total_amount FROM yellow_taxi_data as y LIMIT (100)")
    }

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return conn;
    }
}
