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
import userinterface.donor.DonorWorkAreaJPanel;

/**
 *
 * @author Pranjal
 */
public class NgoDonorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        //return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
        return new DonorWorkAreaJPanel(userProcessContainer, enterprise, account);
    }

    @Override
    public String toString() {
        return "NGO Donor";
    }
}
