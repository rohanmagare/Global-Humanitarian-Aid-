/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.Date;

/**
 * This class defines the donation details.
 *
 * @author Admin
 */
public class Donation {

    private int donationID;
    private static int count = 0;
    private Donor donor;
    private int donationAmount;
    private Date donationDate;

    public Donation(Donor donor, int donationAmount) {

        donationID = ++count;
        this.donor = donor;
        this.donationAmount = donationAmount;
        this.donationDate = new Date();
    }

    public int getDonationID() {
        return donationID;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Date getDonationDate() {
        return donationDate;
    }

}
