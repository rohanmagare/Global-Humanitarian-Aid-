/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.ArrayList;

/**
 * This class defines the donation history.
 *
 * @author Admin
 */
public class DonationHistory {

    private ArrayList<Donation> donationDirectory;
    
    public DonationHistory(){
        donationDirectory = new ArrayList<>();
    }

    public ArrayList<Donation> getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(ArrayList<Donation> donationDirectory) {
        this.donationDirectory = donationDirectory;
    }

    public Donation addDonation(Donor donor, int donationAmount) {
        Donation d = new Donation(donor, donationAmount);
        donationDirectory.add(d);
        return d;
    }

}
