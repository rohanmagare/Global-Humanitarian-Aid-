/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.employee.Employee;
import business.enterprise.donation.Donor;
import business.roles.Role;
import business.volunteer.Volunteer;

/**
 *
 * @author Admin
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Volunteer volunteer;
    private Donor donor;
    private Role role;
//    private NGOWorkRequest ngoWorkqueue;
    

    public UserAccount() {
        
    }

//    public NGOWorkRequest getNgoWorkqueue() {
//        return ngoWorkqueue;
//    }
//
//    public void setNgoWorkqueue(NGOWorkRequest ngoWorkqueue) {
//        this.ngoWorkqueue = ngoWorkqueue;
//    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
       
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }    

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
    
    @Override
    public String toString() {
        return username;
    }
}
