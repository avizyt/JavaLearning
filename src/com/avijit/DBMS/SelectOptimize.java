package com.avijit.DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class SelectOptimize {
    public static void main(String[] args) {

        final String url = "jdbc:postgresql://localhost:5432/nytaxi";
        final String user = "postgres";
        final String password = "avizyt@89";
        Connection conn = null;

        int v1 = 0;
        int v2 = 0;
        HashMap<Integer, Double> map = new HashMap<>();

        map.put(1, 0.0);
        map.put(2, 0.0);

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection(url,user, password);
            conn.setAutoCommit(false);
            System.out.println("Open database successfully!");


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from yellow_taxi_data limit (10000)");
            while (rs.next()){
                int id = rs.getInt("VendorID");
                double TripDist = rs.getDouble("trip_distance");
                if (id == 1){
                    v1 += 1;
                }else {
                    v2 += 1;
                }
                if (map.containsKey(id)){
                    map.put(id, map.get(id) + TripDist);
                }

            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Vendor One Count: "+ v1);
        System.out.println("Vendor Two Count: "+ v2);
        System.out.println("====================================");
        System.out.println("Vendor One Trip: "+ map.get(1));
        System.out.println("Vendor Two Trip: "+ map.get(2));
        System.out.println("====================================");

        System.out.println("Avg distance vendor One: " + map.get(1)/ v1);
        System.out.println("Avg distance vendor two: " + map.get(2)/ v2);
    }
}
