package com.avijit.DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


public class Select {
    public static void main(String[] args) {

        final String url = "jdbc:postgresql://localhost:5432/nytaxi";
        final String user = "postgres";
        final String password = "avizyt@89";
        Connection conn = null;
        ArrayList<Integer> ID = new ArrayList<>();
        ArrayList<Double> TRIPDIST = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection(url,user, password);
            conn.setAutoCommit(false);
            System.out.println("Open database successfully!");


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from yellow_taxi_data limit (1000)");
            while (rs.next()){
                int id = rs.getInt("VendorID");
                ID.add(id);
                double TripDist = rs.getDouble("trip_distance");
                TRIPDIST.add(TripDist);


            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("VendorID :" + ID);
        System.out.println("Trip distance :" + TRIPDIST);

        int vendor1 = 0;
        int vendor2 = 0;

        double vendor_one_dist = 0.0;
        double vendor_two_dist = 0.0;

        for (int i = 0; i < ID.size(); i++) {
            if (ID.get(i) == 1){
                vendor1 += 1;
                vendor_one_dist += TRIPDIST.get(i);
            }else {
                vendor2 += 1;
                vendor_two_dist += TRIPDIST.get(i);
            }
        }

        System.out.println("Vendor One Count :" + vendor1);
        System.out.println("Vendor Two Count :" + vendor2);

        System.out.println("Total Distance by Vendor 1: " + vendor_one_dist);
        System.out.println("Total Distance by Vendor 2: " + vendor_two_dist);

        System.out.println("Avg of vendor 1: " + vendor_one_dist / vendor1);
        System.out.println("Avg of vendor 2: " + vendor_two_dist / vendor2);

    }
}
