/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 * This class has the list of organizations.
 *
 * @author Admin
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Education.getValue())) {
            organization = new EducationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Food.getValue())) {
            organization = new FoodOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medical.getValue())) {
            organization = new MedicationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Shelter.getValue())) {
            organization = new ShelterOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public void deleteOrganization(Organization o) {
        organizationList.remove(o);
    }
}
