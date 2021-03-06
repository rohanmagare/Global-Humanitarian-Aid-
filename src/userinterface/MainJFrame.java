/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.donor.AddDonorJPanel;
import userinterface.statistics.StatisticalAnalysisJPanel;
import userinterface.victim.AddVictimJPanel;
import userinterface.volunteer.VolunteerEnrollJPanel;

/**
 *
 * @author rohan
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        masterPanel = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        btnStats = new javax.swing.JButton();
        btnVolEnroll = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAddDonor = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();
        chartJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jSplitPane.setDividerLocation(200);
        jSplitPane.setLastDividerLocation(200);
        jSplitPane.setMinimumSize(new java.awt.Dimension(1200, 498));
        jSplitPane.setPreferredSize(new java.awt.Dimension(798, 498));

        masterPanel.setPreferredSize(new java.awt.Dimension(150, 30));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUserName.setPreferredSize(new java.awt.Dimension(150, 30));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSubmit.setText("Login");
        btnSubmit.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("User Name:");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Password:");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.setEnabled(false);
        btnLogOut.setPreferredSize(new java.awt.Dimension(150, 30));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPass.setMinimumSize(new java.awt.Dimension(6, 37));
        txtPass.setPreferredSize(new java.awt.Dimension(150, 37));

        btnStats.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStats.setText("Statistics");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        btnVolEnroll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolEnroll.setText("Volunteer Enroll");
        btnVolEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolEnrollActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add Victim Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAddDonor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddDonor.setText("Add Donor");
        btnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDonorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout masterPanelLayout = new javax.swing.GroupLayout(masterPanel);
        masterPanel.setLayout(masterPanelLayout);
        masterPanelLayout.setHorizontalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddDonor)
                    .addComponent(jButton1)
                    .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolEnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterPanelLayout.setVerticalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddDonor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(masterPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());

        chartJPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chartJPanel.setLayout(new java.awt.BorderLayout());
        userProcessContainer.add(chartJPanel, "card2");

        jSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = txtPass.getPassword();
        String password = String.valueOf(passwordCharArray);
        //Step1: check in the  system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Network inNetwork = null;
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step 2: check inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {
                //check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //check against each organization
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);

                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork = network;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        inNetwork = network;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("WorkArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, inNetwork, system));
            layout.next(userProcessContainer);
        }

        btnSubmit.setEnabled(false);
        btnLogOut.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPass.setEnabled(false);

        btnSubmit.setEnabled(false);
        btnLogOut.setEnabled(true);
        txtUserName.setEnabled(false);
        txtPass.setEnabled(false);
        
        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        btnLogOut.setEnabled(false);
        txtUserName.setEnabled(true);
        txtPass.setEnabled(true);
        btnSubmit.setEnabled(true);

        txtUserName.setText("");
        txtPass.setText("");

        userProcessContainer.removeAll();
        JPanel blankJPanel = new JPanel();
        userProcessContainer.add("blankJPanel", blankJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed

        if (system != null) {
            if (system.getNetworkList() != null && system.getNetworkList().size() > 0) {
                StatisticalAnalysisJPanel statisticalAnalysisJPanel = new StatisticalAnalysisJPanel(userProcessContainer, system);
                userProcessContainer.add("statisticalAnalysisJPanel", statisticalAnalysisJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnStatsActionPerformed

    private void btnVolEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolEnrollActionPerformed
        // TODO add your handling code here:
        VolunteerEnrollJPanel volunteerEnrollJPanel = new VolunteerEnrollJPanel(userProcessContainer, system);
        userProcessContainer.add("volunteerEnrollJPanel", volunteerEnrollJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnVolEnrollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AddVictimJPanel addVictimJPanel = new AddVictimJPanel(userProcessContainer, system);
        userProcessContainer.add("addVictimJPanel", addVictimJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDonorActionPerformed
        
        
        AddDonorJPanel addDonorJPanel = new AddDonorJPanel(userProcessContainer, system);
        userProcessContainer.add("addDonorJPanel", addDonorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDonorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDonor;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnVolEnroll;
    private javax.swing.JPanel chartJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
