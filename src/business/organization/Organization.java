/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.roles.Role;
import business.useraccount.UserAccountDirectory;
import business.volunteer.VolunteerDirectory;
import java.util.ArrayList;

/**
 ** This class defines the organization details.
 *
 * @author Pranjal
 */
public abstract class Organization {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    private VolunteerDirectory volunteerDirectory;
    private String subOrgType;

    public enum Type {
        Education("Education Organization"), Food("Food Organization"), Medical("Medical Organization"), Shelter("Shelter Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = ++counter;
        volunteerDirectory = new VolunteerDirectory();
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public abstract ArrayList<Role> getSupportedEmployeeRole();

    public abstract ArrayList<Role> getSupportedVolunteerRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubOrgType() {
        return subOrgType;
    }

    public void setSubOrgType(String subOrgType) {
        this.subOrgType = subOrgType;
    }

    @Override
    public String toString() {
        return name;
    }
}
