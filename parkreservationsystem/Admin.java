/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class Admin extends User {

    public Admin(int id, String name, String email, String password, int employeeId) {
        super(id, name, email, password);
    }

    public void manageSlots() {
        System.out.println("Managing parking slots...");
    }

    public void viewReservations() {
        System.out.println("Viewing all reservations...");
    }
}
