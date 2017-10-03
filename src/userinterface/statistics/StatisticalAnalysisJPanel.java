/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.statistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rohan
 */
public class StatisticalAnalysisJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form NetworkAnalysisJPanel
     */
    public StatisticalAnalysisJPanel(JPanel userProcessContainer, EcoSystem system) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkComboBox();
    }

    private void populateNetworkComboBox() {

        comboNetwork.removeAllItems();
        for (Network network : system.getNetworkList()) {
            comboNetwork.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {

        comboEnterprise.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            comboEnterprise.addItem(enterprise);
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

        btnNetworkAna = new javax.swing.JButton();
        btnEnterpriseAna = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOrganizationAna = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox();
        comboEnterprise = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        btnNetworkAna.setText("Network Level Analysis");
        btnNetworkAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkAnaActionPerformed(evt);
            }
        });

        btnEnterpriseAna.setText("Enterprise Level Analysis");
        btnEnterpriseAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseAnaActionPerformed(evt);
            }
        });

        jLabel1.setText("Statistical Data Analysis at different Levels of Ecosystem");

        btnOrganizationAna.setText("Organization Level Analysis");
        btnOrganizationAna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizationAnaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ecosystem/Network Stats:");

        jLabel3.setText("Enterprise Stats:");

        comboNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetworkActionPerformed(evt);
            }
        });

        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEnterpriseActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Network:");

        jLabel5.setText("Select Enterprise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnEnterpriseAna)
                    .addComponent(btnOrganizationAna)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnNetworkAna))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnNetworkAna))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEnterpriseAna)
                .addGap(18, 18, 18)
                .addComponent(btnOrganizationAna)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNetworkAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkAnaActionPerformed

        NetworkLevelAnalysisJPanel networkLevelAnalysisJPanel = new NetworkLevelAnalysisJPanel(userProcessContainer, system);
        userProcessContainer.add("networkLevelAnalysisJPanel", networkLevelAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNetworkAnaActionPerformed

    private void btnEnterpriseAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseAnaActionPerformed

        EnterpriseLevelAnalysisJPanel enterpriseLevelAnalysisJPanel = new EnterpriseLevelAnalysisJPanel(userProcessContainer, (Enterprise) comboEnterprise.getSelectedItem());
        userProcessContainer.add("enterpriseLevelAnalysisJPanel", enterpriseLevelAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEnterpriseAnaActionPerformed

    private void comboEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEnterpriseActionPerformed
        
//        Enterprise enterprise = (Enterprise) comboEnterprise.getSelectedItem();
//        if (enterprise != null) {
//            populateOrgComboBox(enterprise);
//        }
    }//GEN-LAST:event_comboEnterpriseActionPerformed

//    private void populateOrgComboBox(Enterprise enterprise) {
//        
//        
//        comboOrg.removeAllItems();
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            comboOrg.addItem(organization);
//        }
//    }
    
    private void comboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetworkActionPerformed
        Network network = (Network) comboNetwork.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_comboNetworkActionPerformed

    private void btnOrganizationAnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizationAnaActionPerformed
        
        OrganizationLevelAnalysisJPanel organizationLevelAnalysisJPanel = new OrganizationLevelAnalysisJPanel(userProcessContainer, (Enterprise) comboEnterprise.getSelectedItem());
        userProcessContainer.add("organizationLevelAnalysisJPanel", organizationLevelAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrganizationAnaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterpriseAna;
    private javax.swing.JButton btnNetworkAna;
    private javax.swing.JButton btnOrganizationAna;
    private javax.swing.JComboBox comboEnterprise;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    
}
