/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.organization.Organization;
import business.roles.Role;
import business.roles.SystemAdminRole;
import java.util.ArrayList;

/**
 * This class is used to define the ecosystem with the singleton design pattern
 * and defines the network list.
 *
 * @author rohan
 */
public abstract class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem() {
            };
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public Boolean checkIfUserNameIsUnique(String username) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedEmployeeRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Role> getSupportedVolunteerRole() {
        return null;
    }

}
