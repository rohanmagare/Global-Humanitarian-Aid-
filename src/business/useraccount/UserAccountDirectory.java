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
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createEmployeeUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createVolunteerUserAccount(String username, String password, Volunteer volunteer, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setVolunteer(volunteer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount createDonorUserAccount(String username, String password, Donor donor, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setDonor(donor);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUser(UserAccount userAccount){
        this.userAccountList.remove(userAccount);
    }
}
