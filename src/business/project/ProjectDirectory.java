/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.project;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProjectDirectory {

    private ArrayList<Project> projectList;

    public ProjectDirectory() {
        projectList = new ArrayList<>();
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public Project addProject(String projectName) {

        Project project = new Project(projectName);
        projectList.add(project);
        return project;

    }
    
    public void removeProject(Project p){
         projectList.remove(p);
    }

}
