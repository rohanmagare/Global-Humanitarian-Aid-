/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;

import business.ngoWorkque.WorkRequestList;

/**
 * This class contains the enterprise lists and the work request list.
 *
 * @author Admin
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkRequestList ngoWorkqueList;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        ngoWorkqueList = new WorkRequestList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public WorkRequestList getNgoWorkqueList() {
        return ngoWorkqueList;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
