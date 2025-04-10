/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neu.edu.csye6200.userInterface;

import javax.swing.JOptionPane;
import neu.edu.csye6200.controller.StudentController;
import neu.edu.csye6200.interfaces.TeacherDataManagement;
import neu.edu.csye6200.interfaces.TeacherDataManagementFactory;
import neu.edu.csye6200.model.Student;
import neu.edu.csye6200.model.Teacher;

/**
 *
 * @author shreyas
 */
public class StudentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentJFrame
     */
    private Student st;
    private Teacher t;

    public StudentJFrame(Student s) {
        initComponents();
        this.setSize(850, 620);
        this.st = s;
        setData(s);
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        txtFieldFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldLname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldEmailId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFieldGpa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFieldTeacherName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFieldReview = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 130, 80, 20);
        getContentPane().add(txtFieldFname);
        txtFieldFname.setBounds(430, 130, 130, 26);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 160, 80, 16);

        txtFieldLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldLnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldLname);
        txtFieldLname.setBounds(430, 160, 130, 26);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Age:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 190, 40, 20);
        getContentPane().add(txtFieldAge);
        txtFieldAge.setBounds(430, 190, 130, 26);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("EmailId:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 220, 60, 30);

        txtFieldEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldEmailId);
        txtFieldEmailId.setBounds(430, 220, 130, 26);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("GPA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 250, 40, 30);
        getContentPane().add(txtFieldGpa);
        txtFieldGpa.setBounds(430, 250, 130, 26);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Teacher Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 420, 110, 20);
        getContentPane().add(txtFieldTeacherName);
        txtFieldTeacherName.setBounds(430, 420, 130, 26);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Rating:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 460, 50, 16);
        getContentPane().add(txtFieldReview);
        txtFieldReview.setBounds(430, 460, 130, 26);

        btnDone.setText("Submit");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnDone);
        btnDone.setBounds(380, 500, 140, 29);

        jBtnBack.setText("Logout");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnBack);
        jBtnBack.setBounds(750, 30, 88, 40);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel9.setText("Give Rating");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 310, 220, 100);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 300, 860, 12);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel10.setText("Student Detail");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 20, 270, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/light.jpeg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 860, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldLnameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldLnameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldLnameActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        int rating = Integer.parseInt(txtFieldReview.getText());
        StudentController studC = new StudentController();
        Teacher te = studC.getTeacherFromStudent(st);
        te.setCredits(rating);
        TeacherDataManagementFactory.getFactoryInstance().getObject().updateOneObject(te);

        JOptionPane.showMessageDialog(null, "Updated Successfully!");

    }// GEN-LAST:event_btnDoneActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
        LoginJFrame view = new LoginJFrame();
        view.setVisible(true);
        dispose();
    }// GEN-LAST:event_jBtnBackActionPerformed

    private void txtFieldEmailIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtFieldEmailIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtFieldEmailIdActionPerformed

    /**
     * @param args the command line arguments
     */
    private void setData(Student stud) {

        txtFieldFname.setText(stud.getFirstName());
        txtFieldLname.setText(stud.getLastName());
        txtFieldAge.setText(String.valueOf(stud.getAge()));
        txtFieldGpa.setText(String.valueOf((int) stud.getGPA()));
        txtFieldEmailId.setText(stud.getEmailid());

        StudentController studC = new StudentController();
        this.t = studC.getTeacherFromStudent(stud);
        txtFieldTeacherName.setText(t.getFirstName() + " " + t.getLastName());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtFieldAge;
    private javax.swing.JTextField txtFieldEmailId;
    private javax.swing.JTextField txtFieldFname;
    private javax.swing.JTextField txtFieldGpa;
    private javax.swing.JTextField txtFieldLname;
    private javax.swing.JTextField txtFieldReview;
    private javax.swing.JTextField txtFieldTeacherName;
    // End of variables declaration//GEN-END:variables
}
