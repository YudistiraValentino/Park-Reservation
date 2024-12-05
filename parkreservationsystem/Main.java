/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkreservationsystem;

import parkreservationsystem.Dashboard;

public class Main {
    public static void main(String[] args) {
        // Menampilkan menu utama untuk memilih jenis user
        System.out.println("Welcome to the Park Reservation System!");
        System.out.println("Please select a user type:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. VIP Member");

        // Membaca input dari user untuk memilih user type
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice = scanner.nextInt();
        public class Main {
    
 


        // Menangani pilihan user
        switch (choice) {
            case 1 -> {
                // Admin login dan mengelola slot parkir
                System.out.println("Admin selected.");
                Admin admin = new Admin(1, "Admin", "admin@example.com", "adminPass", 101);
                if (admin.login("adminPass")) {
                    System.out.println("Admin logged in successfully.");
                    admin.manageSlots();
                    admin.viewReservations();
                    
                    // Menampilkan Dashboard setelah login Admin
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        new Dashboard().setVisible(true);
                    });
                } else {
                    System.out.println("Invalid login for admin.");
                }
            }
            case 2 -> {
                // Customer login dan melakukan booking
                System.out.println("Customer selected.");
                Customer customer = new Customer(2, "Customer", "customer@example.com", "customerPass", 1001);
                if (customer.login("customerPass")) {
                    System.out.println("Customer logged in successfully.");
                    customer.bookSlot();
                    customer.viewHistory();
                    
                    // Menampilkan Dashboard setelah login Customer
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        new Dashboard().setVisible(true);
                    });
                } else {
                    System.out.println("Invalid login for customer.");
                }
            }
            case 3 -> {
                // VIP Member login dan mendapatkan benefits
                System.out.println("VIP Member selected.");
                MemberVIP memberVIP = new MemberVIP(3, "VIP Member", "vip@example.com", "vipPass", 1002, "Gold", 0.2);
                if (memberVIP.login("vipPass")) {
                    System.out.println("VIP Member logged in successfully.");
                    System.out.println(memberVIP.getVipBenefits());
                    double finalRate = memberVIP.applyDiscount(100); // Diskon 20%
                    System.out.println("Discounted rate: " + finalRate);
                    
                    // Menampilkan Dashboard setelah login VIP Member
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        new Dashboard().setVisible(true);
                    });
                } else {
                    System.out.println("Invalid login for VIP Member.");
                }
            }
            default -> System.out.println("Invalid selection. Please choose a valid user type.");
        }
    }
}

