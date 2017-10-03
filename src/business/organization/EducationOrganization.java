/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.NgoAccountantRole;
import business.roles.Role;
import business.roles.NgoAdminRole;
import business.roles.NgoTeacherRole;
import business.roles.NgoWorkerRole;
import java.util.ArrayList;

/**
 * This class defines the organization as education org.
 *
 * @author Admin
 */
public class EducationOrganization extends Organization {

    private String subOrgType;

    public EducationOrganization() {
        super(Type.Education.getValue());
        subOrgType = Type.Education.getValue();
    }

    @Override
    public ArrayList<Role> getSupportedEmployeeRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NgoAccountantRole());
        return roles;
    }

    @Override
    public ArrayList<Role> getSupportedVolunteerRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NgoTeacherRole());
        roles.add(new NgoWorkerRole());
        return roles;
    }

}
