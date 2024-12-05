/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class User {
    private int id;
    private final String name;
    private final String email;
    private final String password;
    private boolean login;

    // Constructor
    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.login = false;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    // Method login
    public boolean login(String password) {
        if (this.password.equals(password)) {
            this.login = true;
            return true;
        }
        return false;
    }

    // Method logout
    public void logout() {
        this.login = false;
    }
}


