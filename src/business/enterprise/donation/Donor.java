/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.ArrayList;

/**
 * This class defines the donor details.
 *
 * @author Admin
 */
public class Donor {

    private int donorID;
    private String name;
    private String address;
    private String dob;
    private boolean maleSex;
    private ArrayList<Donation> donationList;
    private static int counter = 0;

    public Donor() {
        donorID = ++counter;
        donationList = new ArrayList<>();
    }

    public int getDonorID() {
        return donorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isMaleSex() {
        return maleSex;
    }

    public void setMaleSex(boolean maleSex) {
        this.maleSex = maleSex;
    }

    public double getTotalDonations() {
        double result = 0;
        for (Donation d : donationList) {
            result += d.getDonationAmount();
        }
        return result;
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<Donation> donationList) {
        this.donationList = donationList;
    }

    public void addDonation(Donation d) {
        this.donationList.add(d);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
