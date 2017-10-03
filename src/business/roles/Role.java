/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public abstract class Role {

    public enum RoleType {
        NgoAdmin("NgoAdmin"),
        NgoDoctor("NgoDoctor"),
        NgoAccountant("NgoAccountant"),
        NgoWorker("NgoWorker"),
        NgoTeacher("NgoTeacher"),
        NgoDonor("Donor"),
        SystemAdmin("SystemAdmin");
        
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
