/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.funds;

import business.project.Project;

/**
 * This class is used to allocate funds to the project.
 *
 * @author Admin
 */
public class FundAllocation {

    private int fundDistributionID;
    private static int count = 0;
    private Project project;
    private double fundsAllocated;

    public FundAllocation(Project project, double fundsAllocated) {
        fundDistributionID = ++count;
        this.project = project;
        this.fundsAllocated = fundsAllocated;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public double getFundsAllocated() {
        return fundsAllocated;
    }

    public void setFundsAllocated(double fundsAllocated) {
        this.fundsAllocated = fundsAllocated;
    }
    
    @Override
    public String toString(){
        return this.project.getProjectName();
    }
}
