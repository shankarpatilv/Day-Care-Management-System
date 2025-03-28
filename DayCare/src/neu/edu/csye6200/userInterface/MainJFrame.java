package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author karan
 */

public class MainJFrame extends javax.swing.JFrame {
    private StudentJPanel studentJPanel;
    private TeacherJPanel teacherJPanel;
    private RenewalJPanel renewalJPanel;
    private ClassRoomJPanel classRoomJPanel;
    private StateRulesJPanel StateRulesjPanel;
    private StatsJPanel statsJPanel;

    public MainJFrame() {
        initComponents();
        this.setSize(1240, 830);
    }

    @SuppressWarnings({ "unchecked", "deprecation" })
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        containerJPanel = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        studentBtn1 = new javax.swing.JButton();
        btnStateRules = new javax.swing.JButton();
        btnRenewal = new javax.swing.JButton();
        btnRenewal1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        userProcessControllerJPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        containerJPanel.setBackground(new java.awt.Color(255, 255, 255));

        splitPane.setDividerLocation(200);
        splitPane.setDividerSize(0);
        splitPane.setMinimumSize(new java.awt.Dimension(800, 25));

        controlJPanel.setBackground(new java.awt.Color(140, 108, 95));
        controlJPanel.setForeground(new java.awt.Color(140, 108, 95));

        adminBtn.setBackground(new java.awt.Color(247, 226, 214));
        adminBtn.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        adminBtn.setForeground(new java.awt.Color(0, 0, 0));
        adminBtn.setText("ADMIN");
        adminBtn.setToolTipText("Admin");
        adminBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adminBtn.setNextFocusableComponent(adminBtn);
        adminBtn.setOpaque(true);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        teacherBtn.setBackground(new java.awt.Color(247, 226, 214));
        teacherBtn.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        teacherBtn.setForeground(new java.awt.Color(0, 0, 0));
        teacherBtn.setText("TEACHER");
        teacherBtn.setToolTipText("Teacher");
        teacherBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacherBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        teacherBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teacherBtn.setOpaque(true);
        teacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherBtnActionPerformed(evt);
            }
        });

        studentBtn1.setBackground(new java.awt.Color(247, 226, 214));
        studentBtn1.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        studentBtn1.setForeground(new java.awt.Color(0, 0, 0));
        studentBtn1.setText("STUDENT");
        studentBtn1.setToolTipText("Student");
        studentBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentBtn1.setOpaque(true);
        studentBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtn1ActionPerformed(evt);
            }
        });

        btnStateRules.setBackground(new java.awt.Color(247, 226, 214));
        btnStateRules.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        btnStateRules.setForeground(new java.awt.Color(0, 0, 0));
        btnStateRules.setText("STATE RULES");
        btnStateRules.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnStateRules.setOpaque(true);
        btnStateRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateRulesActionPerformed(evt);
            }
        });

        btnRenewal.setBackground(new java.awt.Color(247, 226, 214));
        btnRenewal.setFont(new java.awt.Font("Al Bayan", 0, 18)); // NOI18N
        btnRenewal.setForeground(new java.awt.Color(0, 0, 0));
        btnRenewal.setText("RENEWAL ");
        btnRenewal.setToolTipText("Student");
        btnRenewal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRenewal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRenewal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenewal.setOpaque(true);
        btnRenewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewalActionPerformed(evt);
            }
        });

        btnRenewal1.setBackground(new java.awt.Color(247, 226, 214));
        btnRenewal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRenewal1.setForeground(new java.awt.Color(0, 0, 0));
        btnRenewal1.setText("STATISTICS");
        btnRenewal1.setToolTipText("Student");
        btnRenewal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRenewal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRenewal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRenewal1.setOpaque(true);
        btnRenewal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewal1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome");

        logOutBtn.setBackground(new java.awt.Color(247, 226, 214));
        logOutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        logOutBtn.setText("LOGOUT");
        logOutBtn.setToolTipText("Student");
        logOutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logOutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOutBtn.setOpaque(true);
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
                controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlJPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addContainerGap(15, Short.MAX_VALUE))
                        .addGroup(controlJPanelLayout.createSequentialGroup()
                                .addGroup(controlJPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(controlJPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(controlJPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(teacherBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(studentBtn1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnStateRules,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRenewal, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRenewal1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(controlJPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));
        controlJPanelLayout.setVerticalGroup(
                controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlJPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)
                                .addGap(210, 210, 210)
                                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnStateRules, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRenewal, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRenewal1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121,
                                        Short.MAX_VALUE)
                                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)));

        splitPane.setLeftComponent(controlJPanel);

        userProcessControllerJPanel.setBackground(new java.awt.Color(247, 226, 214));
        userProcessControllerJPanel.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dayCare1.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(800, 491));
        userProcessControllerJPanel.add(jLabel4, "card2");

        splitPane.setRightComponent(userProcessControllerJPanel);

        javax.swing.GroupLayout containerJPanelLayout = new javax.swing.GroupLayout(containerJPanel);
        containerJPanel.setLayout(containerJPanelLayout);
        containerJPanelLayout.setHorizontalGroup(
                containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerJPanelLayout.createSequentialGroup()
                                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1275,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        containerJPanelLayout.setVerticalGroup(
                containerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(containerJPanelLayout.createSequentialGroup()
                                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 874,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        getContentPane().add(containerJPanel);
        containerJPanel.setBounds(0, 0, 1240, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminBtnActionPerformed

    }// GEN-LAST:event_adminBtnActionPerformed

    private void studentBtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_studentBtn1ActionPerformed

    }// GEN-LAST:event_studentBtn1ActionPerformed

    private void btnStateRulesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStateRulesActionPerformed

    }// GEN-LAST:event_btnStateRulesActionPerformed

    private void btnRenewalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRenewalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnRenewalActionPerformed

    private void teacherBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_teacherBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_teacherBtnActionPerformed

    private void btnRenewal1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRenewal1ActionPerformed
        // TODO add your handling code here:
        statsJPanel();
    }// GEN-LAST:event_btnRenewal1ActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        System.out.print("Logout");
        JFrame o = new LoginJFrame();
        o.setVisible(true);
        dispose();
    }// GEN-LAST:event_logOutBtnActionPerformed

    public void classRoomJPanel() {
        classRoomJPanel = new ClassRoomJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("classRoomJPanel", classRoomJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public JPanel StateRulesJpanel() {
        StateRulesjPanel = new StateRulesJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("stateRulesJPanel", StateRulesjPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
        return StateRulesjPanel;
    }

    public void renewalJPanel() {
        renewalJPanel = new RenewalJPanel();
        userProcessControllerJPanel.add("renewalJPanel", renewalJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void studentJPanel() {
        studentJPanel = new StudentJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("studentJPanel", studentJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void teacherJPanel() {
        teacherJPanel = new TeacherJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("teacherJPanel", teacherJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public void statsJPanel() {
        statsJPanel = new StatsJPanel(userProcessControllerJPanel);
        userProcessControllerJPanel.add("statsJPanel", statsJPanel);
        CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
        layout.next(userProcessControllerJPanel);
    }

    public JButton getAdminBtn() {
        return adminBtn;
    }

    public JButton getStudentBtn1() {
        return studentBtn1;
    }

    public JButton getTeacherBtn() {
        return teacherBtn;
    }

    public void setStudentJPanel(StudentJPanel studentJPanel) {
        this.studentJPanel = studentJPanel;
    }

    public void setTeacherJPanel(TeacherJPanel teacherJPanel) {
        this.teacherJPanel = teacherJPanel;
    }

    public StudentJPanel getStudentJPanel() {
        return studentJPanel;
    }

    public TeacherJPanel getTeacherJPanel() {
        return teacherJPanel;
    }

    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public RenewalJPanel getRenewalJPanel() {
        return renewalJPanel;
    }

    public void setRenewalJPanel(RenewalJPanel renewalJPanel) {
        this.renewalJPanel = renewalJPanel;
    }

    public ClassRoomJPanel getClassRoomJPanel() {
        return classRoomJPanel;
    }

    public void setClassRoomJPanel(ClassRoomJPanel classRoomJPanel) {
        this.classRoomJPanel = classRoomJPanel;
    }

    public JButton getBtnStateRules() {
        return btnStateRules;
    }

    public void setBtnStateRules(JButton btnStateRules) {
        this.btnStateRules = btnStateRules;
    }

    public StateRulesJPanel getStateRulesjPanel() {
        return StateRulesjPanel;
    }

    public void setStateRulesjPanel(StateRulesJPanel StateRulesjPanel) {
        this.StateRulesjPanel = StateRulesjPanel;
    }

    public JButton getBtnRenewal() {
        return btnRenewal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton btnRenewal;
    private javax.swing.JButton btnRenewal1;
    private javax.swing.JButton btnStateRules;
    private javax.swing.JPanel containerJPanel;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton studentBtn1;
    private javax.swing.JButton teacherBtn;
    private javax.swing.JPanel userProcessControllerJPanel;
    // End of variables declaration//GEN-END:variables
}
