/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        // Set title for JFrame
        setTitle("Park Reservation Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Set layout manager
        setLayout(new BorderLayout());

        // Create and configure components
        JLabel lblTitle = new JLabel("Welcome to the Park Reservation System", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));

        // Create JPanel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1));
        JButton btnManageSlots = new JButton("Manage Slots");
        JButton btnViewReservations = new JButton("View Reservations");
        JButton btnBookSlot = new JButton("Book Slot");
        JButton btnViewHistory = new JButton("View History");

        buttonPanel.add(btnManageSlots);
        buttonPanel.add(btnViewReservations);
        buttonPanel.add(btnBookSlot);
        buttonPanel.add(btnViewHistory);

        // Add components to JFrame
        add(lblTitle, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true); // Menampilkan JFrame
            }
        });
    }
}


