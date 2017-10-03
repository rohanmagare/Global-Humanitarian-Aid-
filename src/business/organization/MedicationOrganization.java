/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.NgoAccountantRole;
import business.roles.NgoAdminRole;
import business.roles.NgoDoctorRole;
import business.roles.NgoWorkerRole;
import business.roles.Role;
import java.util.ArrayList;

/**
 * This class defines the organization as medication org.
 *
 * @author Admin
 */
public class MedicationOrganization extends Organization {

    private String subOrgType;

    public MedicationOrganization() {
        super(Type.Medical.getValue());
        subOrgType = Type.Medical.getValue();
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
        roles.add(new NgoDoctorRole());
        roles.add(new NgoWorkerRole());
        return roles;
    }
}
