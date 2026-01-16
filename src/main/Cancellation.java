package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import db.DBConnection;

public class Cancellation {

    public void cancelTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PNR Number: ");
        int pnr = sc.nextInt();

        try {
            Connection con = DBConnection.getConnection();

            String checkSql = "SELECT * FROM reservations WHERE pnr=?";
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setInt(1, pnr);

            ResultSet rs = checkPs.executeQuery();

            if (rs.next()) {
                System.out.println("PNR Found for Passenger: " + rs.getString("name"));
                System.out.print("Confirm Cancellation (yes/no): ");
                String confirm = sc.next();

                if (confirm.equalsIgnoreCase("yes")) {
                    String deleteSql = "DELETE FROM reservations WHERE pnr=?";
                    PreparedStatement deletePs = con.prepareStatement(deleteSql);
                    deletePs.setInt(1, pnr);
                    deletePs.executeUpdate();

                    System.out.println("Ticket Cancelled Successfully.");
                } else {
                    System.out.println("Cancellation Aborted.");
                }
            } else {
                System.out.println("Invalid PNR Number.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
