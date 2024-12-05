/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class BikeParkingSlot extends ParkingSlot {
    private String bikeType;

    public BikeParkingSlot(int id, String location, double ratePerHour, String status, boolean isAvailable, String bikeType) {
        super(id, location, ratePerHour, status, isAvailable);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }
}
