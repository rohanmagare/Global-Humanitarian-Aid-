/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.roles.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 * This class is used to set the System administrator's user account
 * credentials.
 *
 * @author rohan
 */
public class ConfigureSystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("NGOSysAdmin");

        UserAccount userAccount = system.getUserAccountDirectory().createEmployeeUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;

    }

}
