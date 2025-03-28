/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author karthik
 */
public class UpdateTeacherJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateTeacherJPanel
     */
    public UpdateTeacherJPanel() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFieldFName = new javax.swing.JTextField();
        txtFieldLName = new javax.swing.JTextField();
        textFieldClassRoomAssigned = new javax.swing.JTextField();
        textFieldTeacherId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Teacher");
        add(jLabel1);
        jLabel1.setBounds(140, 30, 624, 50);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        add(jLabel2);
        jLabel2.setBounds(290, 170, 140, 16);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        add(jLabel3);
        jLabel3.setBounds(290, 210, 140, 20);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Class Room Assigned:");
        add(jLabel4);
        jLabel4.setBounds(290, 250, 180, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Id:");
        add(jLabel5);
        jLabel5.setBounds(290, 290, 140, 17);
        add(txtFieldFName);
        txtFieldFName.setBounds(460, 170, 193, 26);
        add(txtFieldLName);
        txtFieldLName.setBounds(460, 210, 193, 26);

        textFieldClassRoomAssigned.setEditable(false);
        add(textFieldClassRoomAssigned);
        textFieldClassRoomAssigned.setBounds(460, 250, 193, 26);

        textFieldTeacherId.setEditable(false);
        textFieldTeacherId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTeacherIdActionPerformed(evt);
            }
        });
        add(textFieldTeacherId);
        textFieldTeacherId.setBounds(460, 290, 193, 26);

        btnUpdate.setText("Update");
        add(btnUpdate);
        btnUpdate.setBounds(450, 340, 210, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/teacher-back.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(-1490, -80, 2870, 1640);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldTeacherIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_textFieldTeacherIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_textFieldTeacherIdActionPerformed

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JTextField getTextFieldClassRoomAssigned() {
        return textFieldClassRoomAssigned;
    }

    public void setTextFieldClassRoomAssigned(JTextField textFieldClassRoomAssigned) {
        this.textFieldClassRoomAssigned = textFieldClassRoomAssigned;
    }

    public JTextField getTextFieldTeacherId() {
        return textFieldTeacherId;
    }

    public void setTextFieldTeacherId(JTextField textFieldTeacherId) {
        this.textFieldTeacherId = textFieldTeacherId;
    }

    public JTextField getTxtFieldFName() {
        return txtFieldFName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtFieldFName = txtFieldFName;
    }

    public JTextField getTxtFieldLName() {
        return txtFieldLName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtFieldLName = txtFieldLName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textFieldClassRoomAssigned;
    private javax.swing.JTextField textFieldTeacherId;
    private javax.swing.JTextField txtFieldFName;
    private javax.swing.JTextField txtFieldLName;
    // End of variables declaration//GEN-END:variables
}
