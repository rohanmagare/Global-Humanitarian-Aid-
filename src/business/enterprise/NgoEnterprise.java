/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import business.roles.Role;
import java.util.ArrayList;

/**
 * This class is used to define the enterprise as NGO.
 *
 * @author rohan
 */
public class NgoEnterprise extends Enterprise {

    public NgoEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    // @Override
    public ArrayList<Role> getSupportedEmployeeRole() {
        return null;
    }

    public ArrayList<Role> getSupportedVolunteerRole() {
        return null;
    }

}
