/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.project;

import business.enterprise.funds.FundAllocation;
import business.victim.VictimDirectory;
import business.volunteer.Volunteer;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Project {

    private int projectID;
    private String projectName;
    private static int count = 0;
    private ArrayList<FundAllocation> projectFunds;
    private ArrayList<Volunteer> volunteers;
    private VictimDirectory victimDirectory;
    private  String event;
    private double totalFundsRequired;
    private int volunteersRequired;
    
    
    public Project(String projectName) {
        projectID = ++count;
        this.projectName = projectName;
        projectFunds = new ArrayList<FundAllocation>();
        volunteers = new ArrayList<Volunteer>();
        victimDirectory =new VictimDirectory();
    }

    
    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public ArrayList<FundAllocation> getProjectFunds() {
        return projectFunds;
    }

    public void setProjectFunds(ArrayList<FundAllocation> projectFunds) {
        this.projectFunds = projectFunds;
    }

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public VictimDirectory getVictimDirectory() {
        return victimDirectory;
    }

    public void setVictimDirectory(VictimDirectory victimDirectory) {
        this.victimDirectory = victimDirectory;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public void addFundAllocation(FundAllocation fa){
        projectFunds.add(fa);
    }
    
    public void removeFundAllocation(FundAllocation fa){
        projectFunds.remove(fa);
    }
    
    public void addVolunteer(Volunteer v){
        volunteers.add(v);
    }
    
    public void removeVolunteer(Volunteer v){
        volunteers.remove(v);
    }

    public double getTotalFundsRequired() {
        return totalFundsRequired;
    }

    public void setTotalFundsRequired(double totalFundsRequired) {
        this.totalFundsRequired = totalFundsRequired;
    }
    
    public double getTotalFundsAllocated(){
        double result = 0;
        for(FundAllocation fa: getProjectFunds()){
            result += fa.getFundsAllocated();
        }
        return result;
    }
    
    public double fundsRemaining(){
        return (totalFundsRequired - getTotalFundsAllocated());
    }
    
    public int getVolunteersRemaining(){
        return (volunteersRequired - volunteers.size());
    }

    public int getVolunteersRequired() {
        return volunteersRequired;
    }

    public void setVolunteersRequired(int volunteersRequired) {
        this.volunteersRequired = volunteersRequired;
    }
    
    @Override
        public String toString() {
            return projectName;
        }
}
