/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.ArrayList;

/**
 * THis class has the list of donors.
 *
 * @author Admin
 */
public class DonorDirectory {

    private ArrayList<Donor> donorDirectory;
    
    public DonorDirectory(){
        donorDirectory = new ArrayList<Donor>();
    }
    
    public ArrayList<Donor> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donor> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public Donor createDonor() {
        Donor d = new Donor();
        donorDirectory.add(d);
        return d;
    }

    public void deleteDonor(Donor d) {
        donorDirectory.remove(d);
    }

}
