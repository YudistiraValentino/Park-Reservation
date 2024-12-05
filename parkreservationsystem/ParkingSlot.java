/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class ParkingSlot {
    private final int id;
    private final String location;
    private final double ratePerHour;
    private String status;
    private boolean isAvailable;

    public ParkingSlot(int id, String location, double ratePerHour, String status, boolean isAvailable) {
        this.id = id;
        this.location = location;
        this.ratePerHour = ratePerHour;
        this.status = status;
        this.isAvailable = isAvailable;
    }

    public void reserve() {
        if (isAvailable) {
            this.status = "Reserved";
            this.isAvailable = false;
            System.out.println("Slot reserved.");
        } else {
            System.out.println("Slot is not available.");
        }
    }
}

