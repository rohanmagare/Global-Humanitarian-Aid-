/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.entepriseaccountant;

import business.enterprise.Enterprise;
import business.enterprise.funds.FundAllocation;
import business.project.Project;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pranjal
 */
public class FundAllocationJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Project project;
    Enterprise enterprise;
    /**
     * Creates new form FundAllocation
     */
    public FundAllocationJPanel(JPanel userProcessContainer, Enterprise enterprise,Project project) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.project = project;
        this.enterprise = enterprise;
        populateDetails();
    }
    
    public void populateDetails(){
        
        txtProjectId.setText(String.valueOf(project.getProjectID()));
        txtProjectName.setText(project.getProjectName());
        txtFundRequired.setText(String.valueOf(project.fundsRemaining()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProjectId = new javax.swing.JLabel();
        lblProjecctName = new javax.swing.JLabel();
        lblFundsAllocation = new javax.swing.JLabel();
        txtProjectId = new javax.swing.JTextField();
        txtProjectName = new javax.swing.JTextField();
        txtFundRequired = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnAllocateFunds = new javax.swing.JButton();
        lblFundsAllocation1 = new javax.swing.JLabel();
        txtFundAllocation = new javax.swing.JTextField();

        lblProjectId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProjectId.setText("Project ID :");

        lblProjecctName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProjecctName.setText("Project Name :");

        lblFundsAllocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFundsAllocation.setText("Funds Required:");

        txtProjectId.setEditable(false);
        txtProjectId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtProjectName.setEditable(false);
        txtProjectName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtFundRequired.setEditable(false);
        txtFundRequired.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAllocateFunds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAllocateFunds.setText("Allocate Funds");
        btnAllocateFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllocateFundsActionPerformed(evt);
            }
        });

        lblFundsAllocation1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFundsAllocation1.setText("Funds Allocation:");

        txtFundAllocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFundAllocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundAllocationActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProjectId)
                            .addComponent(lblProjecctName)
                            .addComponent(lblFundsAllocation))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFundRequired, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFundsAllocation1)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAllocateFunds)
                            .addComponent(txtFundAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjectId)
                    .addComponent(txtProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjecctName)
                    .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFundsAllocation)
                    .addComponent(txtFundRequired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFundsAllocation1)
                    .addComponent(txtFundAllocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAllocateFunds))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FundsAllocationHistoryJPanel fahjp = (FundsAllocationHistoryJPanel) component;
        fahjp.refreshTable();
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAllocateFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllocateFundsActionPerformed
        try{
            double fundsAllocated = Double.parseDouble(txtFundAllocation.getText());
            FundAllocation fa = enterprise.getFunds().createFundAllocation(project, fundsAllocated);
            project.addFundAllocation(fa);
            JOptionPane.showMessageDialog(null, "Funds Allocated", "Information",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Fund Amount", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAllocateFundsActionPerformed

    private void txtFundAllocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundAllocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundAllocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllocateFunds;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblFundsAllocation;
    private javax.swing.JLabel lblFundsAllocation1;
    private javax.swing.JLabel lblProjecctName;
    private javax.swing.JLabel lblProjectId;
    private javax.swing.JTextField txtFundAllocation;
    private javax.swing.JTextField txtFundRequired;
    private javax.swing.JTextField txtProjectId;
    private javax.swing.JTextField txtProjectName;
    // End of variables declaration//GEN-END:variables
}
