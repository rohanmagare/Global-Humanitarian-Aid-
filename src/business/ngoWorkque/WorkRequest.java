/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import business.enterprise.Enterprise;
import business.project.Project;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class WorkRequest {
    private int workRequestID;
    private static int count = 0;
    private ArrayList<WorkResponse> NGOworkquResponses;
    private Project project;
    private Enterprise enterprise;

    public WorkRequest(Project project) {
        this.project = project;
        this.NGOworkquResponses = new ArrayList<>();
        workRequestID = ++count;
    }

    public ArrayList<WorkResponse> getNGOworkquResponses() {
        return NGOworkquResponses;
    }

    public void setNGOworkquResponses(ArrayList<WorkResponse> NGOworkquResponses) {
        this.NGOworkquResponses = NGOworkquResponses;
    }
    
    public WorkResponse createWorkResponse(){
        WorkResponse workResponse =  new WorkResponse();
        NGOworkquResponses.add(workResponse);
        return workResponse;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    @Override 
    public String toString(){
        return String.valueOf(workRequestID);
    }

}
