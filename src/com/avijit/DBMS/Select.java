package com.avijit.DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Select {
    public static void main(String[] args) {

        final String url = "jdbc:postgresql://localhost:5432/nytaxi";
        final String user = "postgres";
        final String password = "avizyt@89";
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection(url,user, password);
            conn.setAutoCommit(false);
            System.out.println("Open database successfully!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from yellow_taxi_data limit (100)");
            while (rs.next()){
                int id = rs.getInt("VendorID");
                double TripDist = rs.getDouble("trip_distance");

                System.out.println("VendorID = " + id);
                System.out.println("Trip distance = " + TripDist);
            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

    }
}
