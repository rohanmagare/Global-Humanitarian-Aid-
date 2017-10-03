/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.statistics;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.volunteer.Volunteer;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rohan
 */
public class OrganizationLevelAnalysisJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Enterprise enterprise;; 
    
    /**
     * Creates new form OrganizationLevelAnalysisJPanel
     */
    public OrganizationLevelAnalysisJPanel(JPanel userProcessContainer, Enterprise enterprise) {
       
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.enterprise = enterprise;
         getEmployeeToVolunteerRation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empToVolRatioJPanel = new javax.swing.JPanel();
        nosOfOrgsOfEachTypeJPanel = new javax.swing.JPanel();
        brnBack = new javax.swing.JButton();

        empToVolRatioJPanel.setLayout(new java.awt.BorderLayout());

        nosOfOrgsOfEachTypeJPanel.setLayout(new java.awt.BorderLayout());

        brnBack.setText("<<Back");
        brnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empToVolRatioJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(nosOfOrgsOfEachTypeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(brnBack))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empToVolRatioJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nosOfOrgsOfEachTypeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brnBack)
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_brnBackActionPerformed

    private void getEmployeeToVolunteerRation() {
       
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        ArrayList<Organization> organizations = enterprise.getOrganizationDirectory().getOrganizationList();
        
        if (organizations != null && organizations.size() > 0) {
            for (Organization organization : organizations) {
                float employeeToVolunteerRatio = 0;
                ArrayList<Employee> employees = organization.getEmployeeDirectory().getEmployeeList();
                ArrayList<Volunteer> volunteers = organization.getVolunteerDirectory().getVolunteers();
                if(volunteers.size()>0){
                    employeeToVolunteerRatio = ((float) employees.size())/(float) volunteers.size();
                    barchartdata.setValue(employeeToVolunteerRatio, "Employee to Volunteers Ratio", organization.getName());
                }
                
            }
        }
        
        JFreeChart barchart = ChartFactory.createBarChart("Employee to volnteer ratio per organization", "In year 2016", "Employee/Volunteer", barchartdata, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel barchartPanel = new ChartPanel(barchart);
        empToVolRatioJPanel.removeAll();
        empToVolRatioJPanel.add(barchartPanel);
        empToVolRatioJPanel.validate();
        
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBack;
    private javax.swing.JPanel empToVolRatioJPanel;
    private javax.swing.JPanel nosOfOrgsOfEachTypeJPanel;
    // End of variables declaration//GEN-END:variables

   
}