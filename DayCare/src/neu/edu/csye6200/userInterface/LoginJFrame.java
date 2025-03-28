/**
 * 
 */
package neu.edu.csye6200.userInterface;

import java.awt.event.ActionEvent;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.util.List;

import javax.swing.JOptionPane;

import neu.edu.csye6200.controller.MainController;
import neu.edu.csye6200.model.Student;
import neu.edu.csye6200.model.Teacher;
import neu.edu.csye6200.util.FileIO;

/**
 * @author shreyas
 *
 */
public class LoginJFrame extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtFieldPassword;
    private javax.swing.JTextField txtFieldUsername;

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        initComponents();
        this.setSize(1240, 830);
    }

    public void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        txtFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconmonstr-user-29-240.png")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 170, 220, 180);

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 590, 210, 60);

        txtFieldUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFieldUsername.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(txtFieldUsername);
        txtFieldUsername.setBounds(500, 400, 210, 50);

        jLabel3.setFont(new java.awt.Font("Al Bayan", 0, 12)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 380, 80, 20);

        jLabel6.setFont(new java.awt.Font("Al Bayan", 0, 12)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 480, 70, 20);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 450, 71, 18);

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Al Bayan", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DAYCARE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 10, 1230, 100);

        txtFieldPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldPassword);
        txtFieldPassword.setBounds(500, 500, 210, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 1230, 870);

        jLabel5.setFont(new java.awt.Font("Al Bayan", 0, 12)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 380, 80, 20);

        pack();

    }

    /**
     * @param evt
     */
    protected void txtFieldPasswordActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub

    }

    /**
     * @param evt
     */
    protected void jButton1ActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub

        // GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean credentialsCorrect = false;
        char[] passwordChars = txtFieldPassword.getPassword();
        String password = new String(passwordChars);

        if (txtFieldUsername.getText().equalsIgnoreCase("admin")
                && password.equalsIgnoreCase("admin")) {
            credentialsCorrect = true;
            MainJFrame mainjframe = new MainJFrame();
            mainjframe.setVisible(true);
            MainController controller = new MainController(mainjframe);
            dispose();

        }

        List<Teacher> teacher = null;
        try {
            teacher = FileIO.readFile(Teacher.class, "teacher.csv");
            System.out.println(teacher);
        } catch (ParseException ex) {
            // Logger.getLogger(LoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Teacher t : teacher) {
            if (t.getEmailid().equalsIgnoreCase(txtFieldUsername.getText())
                    && t.getPassword().equalsIgnoreCase(password)) {
                credentialsCorrect = true;
                TeacherJFrame teacherjframe = new TeacherJFrame(t);
                teacherjframe.setVisible(true);
                dispose();

            }
        }

        List<Student> student = null;
        try {
            student = FileIO.readFile(Student.class, "student.csv");
        } catch (ParseException ex) {
            // Logger.getLogger(LoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Student s : student) {
            if (s.getEmailid().equalsIgnoreCase(txtFieldUsername.getText())
                    && s.getPassword().equalsIgnoreCase(password)) {
                credentialsCorrect = true;
                StudentJFrame studentjframe = new StudentJFrame(s);
                studentjframe.setVisible(true);
                dispose();

            }
        }

        if (!credentialsCorrect) {
            JOptionPane.showMessageDialog(this, "Please provide correct credentials", "Login Failed",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
