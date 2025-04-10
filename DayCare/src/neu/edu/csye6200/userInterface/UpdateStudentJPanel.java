/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sanjay
 */
public class UpdateStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateStudentJPanel
     */
    private JPanel userProcessControllerJPanel;
    private AddImmnunizationJPanel addImmunJPanel;
    private UpdateImmuizationJPanel updateImmunJPanel;

    public UpdateStudentJPanel(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
        initComponents();
    }

    public void addImmunization() {
        addImmunJPanel = new AddImmnunizationJPanel();
        userProcessControllerJPanel.add("AddImmunizationJPanel", addImmunJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void updateImmunization() {
        updateImmunJPanel = new UpdateImmuizationJPanel();
        userProcessControllerJPanel.add("updateImmunizationJPanel", updateImmunJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public AddImmnunizationJPanel getAddImmunJPanel() {
        return addImmunJPanel;
    }

    public void setAddImmunJPanel(AddImmnunizationJPanel addImmunJPanel) {
        this.addImmunJPanel = addImmunJPanel;
    }

    public UpdateImmuizationJPanel getUpdateImmunJPanel() {
        return updateImmunJPanel;
    }

    public void setUpdateImmunJPanel(UpdateImmuizationJPanel updateImmunJPanel) {
        this.updateImmunJPanel = updateImmunJPanel;
    }

    public JTextField getTxtFieldAddress() {
        return txtFieldAddress;
    }

    public void setTxtFieldAddress(JTextField txtFieldAddress) {
        this.txtFieldAddress = txtFieldAddress;
    }

    public JTextField getTxtFieldPhone() {
        return txtFieldPhone;
    }

    public void setTxtFieldPhone(JTextField txtFieldPhone) {
        this.txtFieldPhone = txtFieldPhone;
    }

    public JTextArea getjTextArea2() {
        return jTextArea2;
    }

    public void setjTextArea2(JTextArea jTextArea2) {
        this.jTextArea2 = jTextArea2;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldFName = new javax.swing.JTextField();
        txtFieldAge = new javax.swing.JTextField();
        txtFieldLName = new javax.swing.JTextField();
        txtFieldFatherName = new javax.swing.JTextField();
        txtFieldMotherName = new javax.swing.JTextField();
        txtFieldStudentId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblImmunInfo = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnUpdateImmun = new javax.swing.JButton();
        btnDeleteImmun = new javax.swing.JButton();
        btnAddImmun = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldPhone = new javax.swing.JTextField();
        txtFieldAddress = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alerts");
        add(jLabel1);
        jLabel1.setBounds(650, 20, 184, 26);

        jLabel2.setText("FirstName:");
        add(jLabel2);
        jLabel2.setBounds(60, 70, 154, 19);

        jLabel3.setText("LastName:");
        add(jLabel3);
        jLabel3.setBounds(60, 100, 154, 14);

        jLabel4.setText("Age:");
        add(jLabel4);
        jLabel4.setBounds(60, 130, 154, 16);

        jLabel5.setText("Father Name:");
        add(jLabel5);
        jLabel5.setBounds(60, 160, 154, 16);

        jLabel6.setText("MotherName:");
        add(jLabel6);
        jLabel6.setBounds(60, 190, 154, 16);

        jLabel7.setText("Student Id:");
        add(jLabel7);
        jLabel7.setBounds(60, 220, 154, 16);
        add(txtFieldFName);
        txtFieldFName.setBounds(220, 70, 236, 26);
        add(txtFieldAge);
        txtFieldAge.setBounds(220, 130, 236, 26);
        add(txtFieldLName);
        txtFieldLName.setBounds(220, 100, 236, 26);

        txtFieldFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFatherNameActionPerformed(evt);
            }
        });
        add(txtFieldFatherName);
        txtFieldFatherName.setBounds(220, 160, 236, 26);

        txtFieldMotherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldMotherNameActionPerformed(evt);
            }
        });
        add(txtFieldMotherName);
        txtFieldMotherName.setBounds(220, 190, 236, 26);

        txtFieldStudentId.setEditable(false);
        txtFieldStudentId.setToolTipText("ID cant be changed");
        txtFieldStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldStudentIdActionPerformed(evt);
            }
        });
        add(txtFieldStudentId);
        txtFieldStudentId.setBounds(220, 220, 236, 26);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        add(btnUpdate);
        btnUpdate.setBounds(220, 330, 240, 31);

        tblImmunInfo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Immun Name", "Immun Id", "Date", "Status", "Immunization Anniversary"
                }));
        jScrollPane2.setViewportView(tblImmunInfo);

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 430, 630, 130);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Immunization Info");
        add(jLabel8);
        jLabel8.setBounds(130, 400, 224, 17);

        btnUpdateImmun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateImmun.setText("Update Immunization");
        add(btnUpdateImmun);
        btnUpdateImmun.setBounds(710, 480, 186, 30);

        btnDeleteImmun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteImmun.setText("Delete Immunization");
        add(btnDeleteImmun);
        btnDeleteImmun.setBounds(710, 530, 190, 30);

        btnAddImmun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddImmun.setText("Add Immunization");
        btnAddImmun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImmunActionPerformed(evt);
            }
        });
        add(btnAddImmun);
        btnAddImmun.setBounds(710, 430, 190, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(164, 10, 170, 80);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(160, 130, 180, 50);

        jButton1.setText("Renew Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 200, 170, 29);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alerts:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 30, 50, 30);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Immunization status:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 150, 160, 16);

        add(jPanel1);
        jPanel1.setBounds(550, 60, 352, 236);

        jLabel10.setText("Address:");
        add(jLabel10);
        jLabel10.setBounds(60, 260, 154, 16);

        jLabel11.setText("Phone:");
        add(jLabel11);
        jLabel11.setBounds(60, 300, 154, 16);

        txtFieldPhone.setEditable(false);
        txtFieldPhone.setToolTipText("ID cant be changed");
        txtFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPhoneActionPerformed(evt);
            }
        });
        add(txtFieldPhone);
        txtFieldPhone.setBounds(220, 290, 236, 26);

        txtFieldAddress.setEditable(false);
        txtFieldAddress.setToolTipText("ID cant be changed");
        txtFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAddressActionPerformed(evt);
            }
        });
        add(txtFieldAddress);
        txtFieldAddress.setBounds(220, 260, 230, 26);
        add(jSeparator1);
        jSeparator1.setBounds(-70, 380, 1080, 10);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(500, -50, 30, 430);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Student details");
        add(jLabel13);
        jLabel13.setBounds(140, 20, 184, 26);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tea.jpg"))); // NOI18N
        jLabel14.setAutoscrolls(true);
        add(jLabel14);
        jLabel14.setBounds(-420, -230, 1850, 1140);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldFatherNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldFatherNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldFatherNameActionPerformed

    private void btnAddImmunActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddImmunActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnAddImmunActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtFieldStudentIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldStudentIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldStudentIdActionPerformed

    private void txtFieldMotherNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldMotherNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldMotherNameActionPerformed

    private void txtFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldPhoneActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldPhoneActionPerformed

    private void txtFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldAddressActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldAddressActionPerformed

    public JTable getTblImmunInfo() {
        return tblImmunInfo;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public javax.swing.JTextArea getAlert() {

        return this.jTextArea1;
    }

    public void setTblImmunInfo(JTable tblImmunInfo) {
        this.tblImmunInfo = tblImmunInfo;
    }

    public JTextField getTxtFieldAge() {
        return txtFieldAge;
    }

    public void setTxtFieldAge(JTextField txtFieldAge) {
        this.txtFieldAge = txtFieldAge;
    }

    public JTextField getTxtFieldFName() {
        return txtFieldFName;
    }

    public void setTxtFieldFName(JTextField txtFieldFName) {
        this.txtFieldFName = txtFieldFName;
    }

    public JTextField getTxtFieldFatherName() {
        return txtFieldFatherName;
    }

    public void setTxtFieldFatherName(JTextField txtFieldFatherName) {
        this.txtFieldFatherName = txtFieldFatherName;
    }

    public JTextField getTxtFieldLName() {
        return txtFieldLName;
    }

    public void setTxtFieldLName(JTextField txtFieldLName) {
        this.txtFieldLName = txtFieldLName;
    }

    public JTextField getTxtFieldMotherName() {
        return txtFieldMotherName;
    }

    public void setTxtFieldMotherName(JTextField txtFieldMotherName) {
        this.txtFieldMotherName = txtFieldMotherName;
    }

    public JTextField getTxtFieldStudentId() {
        return txtFieldStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtFieldStudentId = txtFieldStudentId;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JButton getBtnDeleteImmun() {
        return btnDeleteImmun;
    }

    public JButton getBtnUpdateImmun() {
        return btnUpdateImmun;
    }

    public JButton getBtnAddImmun() {
        return btnAddImmun;
    }

    public void setBtnAddImmun(JButton btnAddImmun) {
        this.btnAddImmun = btnAddImmun;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImmun;
    private javax.swing.JButton btnDeleteImmun;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateImmun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tblImmunInfo;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldAge;
    private javax.swing.JTextField txtFieldFName;
    private javax.swing.JTextField txtFieldFatherName;
    private javax.swing.JTextField txtFieldLName;
    private javax.swing.JTextField txtFieldMotherName;
    private javax.swing.JTextField txtFieldPhone;
    private javax.swing.JTextField txtFieldStudentId;
    // End of variables declaration//GEN-END:variables
}
