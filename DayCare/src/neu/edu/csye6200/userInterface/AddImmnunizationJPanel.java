/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author vivek
 */
public class AddImmnunizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddImmnunizationJPanel
     */
    public AddImmnunizationJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioBtnYes = new javax.swing.JRadioButton();
        raadioBtnNo = new javax.swing.JRadioButton();
        btnAddImmunization = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textFieldDuration = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Immunization");
        add(jLabel1);
        jLabel1.setBounds(150, 10, 577, 33);

        jLabel2.setText("Immunization Name:");
        add(jLabel2);
        jLabel2.setBounds(300, 190, 131, 24);

        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });
        add(textFieldName);
        textFieldName.setBounds(300, 220, 250, 26);

        jLabel3.setText("Immunization Date:");
        add(jLabel3);
        jLabel3.setBounds(300, 260, 170, 24);
        add(textFieldDate);
        textFieldDate.setBounds(300, 290, 250, 26);

        jLabel4.setText("Is Immunization Taken:");
        add(jLabel4);
        jLabel4.setBounds(300, 340, 148, 16);

        radioBtnYes.setText("Yes");
        radioBtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnYesActionPerformed(evt);
            }
        });
        add(radioBtnYes);
        radioBtnYes.setBounds(320, 380, 54, 23);

        raadioBtnNo.setText("No");
        raadioBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raadioBtnNoActionPerformed(evt);
            }
        });
        add(raadioBtnNo);
        raadioBtnNo.setBounds(470, 380, 50, 23);

        btnAddImmunization.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddImmunization.setText("Add Immunization");
        btnAddImmunization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImmunizationActionPerformed(evt);
            }
        });
        add(btnAddImmunization);
        btnAddImmunization.setBounds(300, 510, 260, 36);

        jLabel5.setText("Duration:");
        add(jLabel5);
        jLabel5.setBounds(300, 430, 111, 16);

        textFieldDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDurationActionPerformed(evt);
            }
        });
        add(textFieldDuration);
        textFieldDuration.setBounds(300, 460, 260, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(300, 150, 250, 27);

        jLabel6.setText("Select vaccine Id");
        add(jLabel6);
        jLabel6.setBounds(300, 110, 130, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pexels-anna-shvets-3786215.jpg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(-120, -150, 1520, 1090);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddImmunizationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddImmunizationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnAddImmunizationActionPerformed

    private void radioBtnYesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radioBtnYesActionPerformed
        raadioBtnNo.setSelected(false);
    }// GEN-LAST:event_radioBtnYesActionPerformed

    private void raadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_raadioBtnNoActionPerformed
        // TODO add your handling code here:
        radioBtnYes.setSelected(false);
    }// GEN-LAST:event_raadioBtnNoActionPerformed

    private void textFieldDurationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldDurationActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_textFieldDurationActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_textFieldNameActionPerformed

    public JTextField getTextFieldDuration() {
        return textFieldDuration;
    }

    public void setTextFieldDuration(JTextField textFieldDuration) {
        this.textFieldDuration = textFieldDuration;
    }

    public JButton getBtnAddImmunization() {
        return btnAddImmunization;
    }

    public void setBtnAddImmunization(JButton btnAddImmunization) {
        this.btnAddImmunization = btnAddImmunization;
    }

    public JRadioButton getRaadioBtnNo() {
        return raadioBtnNo;
    }

    public void setRaadioBtnNo(JRadioButton raadioBtnNo) {
        this.raadioBtnNo = raadioBtnNo;
    }

    public JRadioButton getRadioBtnYes() {
        return radioBtnYes;
    }

    public void setRadioBtnYes(JRadioButton radioBtnYes) {
        this.radioBtnYes = radioBtnYes;
    }

    public JTextField getTextFieldDate() {
        return textFieldDate;
    }

    public void setTextFieldDate(JTextField textFieldDate) {
        this.textFieldDate = textFieldDate;
    }

    public JTextField getTextFieldName() {
        return textFieldName;
    }

    public void setTextFieldName(JTextField textFieldName) {
        this.textFieldName = textFieldName;
    }

    public javax.swing.JComboBox<String> getImmId() {
        return this.jComboBox1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImmunization;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton raadioBtnNo;
    private javax.swing.JRadioButton radioBtnYes;
    private javax.swing.JTextField textFieldDate;
    private javax.swing.JTextField textFieldDuration;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}
