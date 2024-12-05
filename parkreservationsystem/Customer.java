/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class Customer extends User {
    private final int memberId;

    public Customer(int id, String name, String email, String password, int memberId) {
        super(id, name, email, password);
        this.memberId = memberId;
    }

    public void bookSlot() {
        System.out.println("Booking parking slot...");
    }

    public void viewHistory() {
        System.out.println("Viewing reservation history...");
    }
}
