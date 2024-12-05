/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class CarParkingSlot extends ParkingSlot {
    private final String carSize;

    public CarParkingSlot(int id, String location, double ratePerHour, String status, boolean isAvailable, String carSize) {
        super(id, location, ratePerHour, status, isAvailable);
        this.carSize = carSize;
    }

    public String getCarSize() {
        return carSize;
    }
}
