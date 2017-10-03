/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.funds;

import business.project.Project;
import java.util.ArrayList;

/**
 * This class defines the funds available.
 *
 * @author Admin
 */
public class Funds {

    private int totalFundsAvailable;
    private ArrayList<FundAllocation> fundsDistributionHistory;
    
    public Funds(){
        
        fundsDistributionHistory = new ArrayList<>();
    }

    public int getTotalFundsAvailable() {
        return totalFundsAvailable;
    }

    public ArrayList<FundAllocation> getFundsDistributionHistory() {
        return fundsDistributionHistory;
    }

    public void setFundsDistributionHistory(ArrayList<FundAllocation> fundsDistributionHistory) {
        this.fundsDistributionHistory = fundsDistributionHistory;
    }

    public FundAllocation createFundAllocation(Project project, double fundsAllocated) {
        
        FundAllocation fd = new FundAllocation(project, fundsAllocated);
        fundsDistributionHistory.add(fd);
        totalFundsAvailable -= fundsAllocated;
        return fd;
    }

    public void addFunds(int donationAmount) {
        this.totalFundsAvailable += donationAmount;
    }

}
