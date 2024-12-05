/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkreservationsystem;

public class MemberVIP extends Customer {
    private final String vipLevel;
    private final double discountRate;

    public MemberVIP(int id, String name, String email, String password, int memberId, String vipLevel, double discountRate) {
        super(id, name, email, password, memberId);
        this.vipLevel = vipLevel;
        this.discountRate = discountRate;
    }

    public String getVipBenefits() {
        return "VIP benefits for level: " + vipLevel;
    }

    public double applyDiscount(double rate) {
        return rate - (rate * discountRate);
    }
}

