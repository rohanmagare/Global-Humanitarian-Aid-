/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.volunteer;

import business.project.Project;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Volunteer {

    private int volunteerID;
    private static int count = 0;
    private String name;
    private String address;
    private boolean isAvailable = false;
    private String contactNumber;
    private String volunteerRole;
    private ArrayList<Project> projectHistory;

    public int getVolunteerID() {
        return volunteerID;
    }

    public void setVolunteerID(int volunteerID) {
        this.volunteerID = volunteerID;
    }

//    public enum VolunteerRoleType {
//        Chef, Doctor, Teacher, Worker;
//    }
    public Volunteer() {
        volunteerID = ++count;
        projectHistory = new ArrayList<>();
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getVolunteerRole() {
        return volunteerRole;
    }

    public void setVolunteerRole(String volunteerRole) {
        this.volunteerRole = volunteerRole;
    }

    public ArrayList<Project> getProjectHistory() {
        return projectHistory;
    }

    public void setProjectHistory(ArrayList<Project> projectHistory) {
        this.projectHistory = projectHistory;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public void addProject(Project p){
        this.projectHistory.add(p);
    }
    
    public void removeProject(Project p){
        this.projectHistory.remove(p);
    }

    @Override
    public String toString() {
        return this.name;
    }

}
