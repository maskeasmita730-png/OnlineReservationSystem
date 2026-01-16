package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;
import db.DBConnection;

public class Reservation {

    public void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNo = sc.nextLine();

        String trainName = getTrainName(trainNo);
        System.out.println("Train Name: " + trainName);

        System.out.print("Enter Class Type: ");
        String classType = sc.nextLine();

        System.out.print("Enter Journey Date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("From: ");
        String from = sc.nextLine();

        System.out.print("To: ");
        String to = sc.nextLine();

        int pnr = generatePNR();

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO reservations VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, pnr);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, trainNo);
            ps.setString(5, trainName);
            ps.setString(6, classType);
            ps.setString(7, date);
            ps.setString(8, from);
            ps.setString(9, to);

            ps.executeUpdate();

            System.out.println("\n--- TICKET CONFIRMED ---");
            System.out.println("PNR Number: " + pnr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getTrainName(String trainNo) {
        if (trainNo.equals("101")) return "Express Line";
        if (trainNo.equals("202")) return "Superfast Express";
        return "General Passenger";
    }

    private int generatePNR() {
        return 100000 + new Random().nextInt(900000);
    }
}
