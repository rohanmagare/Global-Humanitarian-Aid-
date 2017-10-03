/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseadministrator;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.project.Project;
import business.volunteer.Volunteer;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranjal
 */
public class ManageProjectVolunteer extends javax.swing.JPanel {
    JPanel userProcessContainer; 
    Project project;
    Enterprise enterprise;
    /**
     * Creates new form ManageProjectVolunteer
     */
    public ManageProjectVolunteer(JPanel userProcessContainer, Project project, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.project = project;
        this.enterprise = enterprise;
        populateTable();
        populateNetworkComboBox();
    }
    
    public void populateTable() {
          
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        
        model.setRowCount(0);
        
        for (Volunteer v : project.getVolunteers()){
            Object[] row = new Object[1];
            row[0] = v;
            model.addRow(row);
        }
    }
    
    private void populateNetworkComboBox(){
        comboVolunteer.removeAllItems();
        
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            boolean present = false;
            for(Volunteer v: o.getVolunteerDirectory().getVolunteers()){
                for(Volunteer vPro: project.getVolunteers()){
                    if(v.equals(vPro)){
                        present = true;
                    }
                }
                if(!present)
                    comboVolunteer.addItem(v);
                //comboVolunteer
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteer = new javax.swing.JTable();
        comboVolunteer = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnAddVol = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Project Volunteers");

        tblVolunteer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Volunteer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVolunteer);
        if (tblVolunteer.getColumnModel().getColumnCount() > 0) {
            tblVolunteer.getColumnModel().getColumn(0).setResizable(false);
        }

        comboVolunteer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVolunteerActionPerformed(evt);
            }
        });

        jLabel2.setText("Add Volunteer");

        btnAddVol.setText("Add Volunteer");
        btnAddVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVolActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton2.setText("Remove Volunteer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAddVol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(comboVolunteer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddVol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVolActionPerformed
        Volunteer v = (Volunteer) comboVolunteer.getSelectedItem();
        project.addVolunteer(v);
        v.addProject(project);
        populateTable();
        populateNetworkComboBox();
    }//GEN-LAST:event_btnAddVolActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tblVolunteer.getSelectedRow();
        
        if(selectedRow >= 0){
            Volunteer v = (Volunteer)tblVolunteer.getValueAt(selectedRow, 0);
            project.removeVolunteer(v);
            v.removeProject(project);
            populateTable();
            populateNetworkComboBox();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVolunteerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVolunteerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVol;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboVolunteer;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVolunteer;
    // End of variables declaration//GEN-END:variables
}