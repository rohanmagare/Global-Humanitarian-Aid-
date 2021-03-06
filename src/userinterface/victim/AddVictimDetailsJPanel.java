/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.victim;

import business.project.Project;
import business.validation.Validator;
import business.victim.Victim;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author rohan
 */
public class AddVictimDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Project project;
    JRadioButton maleRB = new JRadioButton("male");
    JRadioButton femaleRB = new JRadioButton("Female");

    /**
     * Creates new form AddVictimDetailsJPanel
     */
    public AddVictimDetailsJPanel(JPanel userProcessContainer, Project project) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.project = project;
        populateGenderRadio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        genderPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        checkShelter = new javax.swing.JCheckBox();
        checkFood = new javax.swing.JCheckBox();
        checkEducation = new javax.swing.JCheckBox();
        checkMedication = new javax.swing.JCheckBox();

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Victim Details:");

        jLabel2.setText("Victim Name:");

        jLabel3.setText("Victim Age:");

        txtAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setText("Gender:");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setText("Help required in:");

        checkShelter.setText("Shelter");

        checkFood.setText("Food");

        checkEducation.setText("Education");

        checkMedication.setText("Medication");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtAge)
                                .addComponent(genderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkEducation)
                                    .addComponent(checkShelter))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkFood)
                                    .addComponent(checkMedication))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(checkShelter)
                    .addComponent(checkFood))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEducation)
                    .addComponent(checkMedication))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (!txtName.getText().isEmpty() && !txtAge.getText().isEmpty()) {
            
            Victim victim = project.getVictimDirectory().addVictim();
            victim.setAge(Integer.parseInt(txtAge.getText()));
            victim.setVictimName(txtName.getName());
            if(maleRB.isSelected()){
                victim.setMaleGender(true);
            }
            else if (femaleRB.isSelected()){
                victim.setMaleGender(false);
            }
            if (checkFood.isSelected()) {
                victim.setFoodRequired(true);
            }
            if (checkFood.isSelected()) {
                victim.setFoodRequired(true);
            }
            if (checkFood.isSelected()) {
                victim.setFoodRequired(true);
            }
            if (checkFood.isSelected()) {
                victim.setFoodRequired(true);
            }
            JOptionPane.showMessageDialog(null, "Victim Succeffully", "INFO Message", JOptionPane.INFORMATION_MESSAGE);
        }

            else {
                JOptionPane.showMessageDialog(null, "All Fields Mandatory", "Warning Message", JOptionPane.WARNING_MESSAGE);
            }

    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox checkEducation;
    private javax.swing.JCheckBox checkFood;
    private javax.swing.JCheckBox checkMedication;
    private javax.swing.JCheckBox checkShelter;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateGenderRadio() {

        ButtonGroup genderBG = new ButtonGroup();
        genderBG.add(maleRB);
        genderBG.add(femaleRB);
        genderPanel.setSize(100, 200);
        genderPanel.setLayout(new FlowLayout());
        genderPanel.add(maleRB);
        genderPanel.add(femaleRB);
        maleRB.setSelected(true);
        genderPanel.setVisible(true);
    }
}
