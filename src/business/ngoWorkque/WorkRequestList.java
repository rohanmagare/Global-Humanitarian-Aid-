/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;


import business.project.Project;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class WorkRequestList {

    private ArrayList<WorkRequest> ngoWorkRequests;

    public WorkRequestList() {
        ngoWorkRequests  = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getNgoWorkRequests() {
        return ngoWorkRequests;
    }

    public void setNgoWorkRequests(ArrayList<WorkRequest> ngoWorkRequests) {
        this.ngoWorkRequests = ngoWorkRequests;
    }

    /**
     * createWorkRequest method gets project as a parameter creates a work queue
 object and sets the project to it
     */
    public WorkRequest createWorkRequest(Project project) {
        WorkRequest ngoWorkque = new WorkRequest(project);
        ngoWorkque.setProject(project);
        ngoWorkRequests.add(ngoWorkque);
        return ngoWorkque;
    }
}
