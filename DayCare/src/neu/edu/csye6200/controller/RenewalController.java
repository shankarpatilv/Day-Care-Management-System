/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import neu.edu.csye6200.interfaces.ImmunizationDataManagementFactory;
import neu.edu.csye6200.userInterface.RenewalJPanel;
import neu.edu.csye6200.interfaces.StudentDataMangementFactory;
import neu.edu.csye6200.model.Immunization;
import neu.edu.csye6200.model.Student;

/**
 *
 * @author karthik
 */
public class RenewalController {
    private static RenewalController instance;
    private RenewalJPanel renewalJPanel;

    public static RenewalController getInstance(RenewalJPanel renewalJPanel) {
        instance = new RenewalController(renewalJPanel);
        return instance;
    }

    private RenewalController(RenewalJPanel renewalJPanel) {
        this.renewalJPanel = renewalJPanel;
        setRenewalRecords();

    }

    public void setRenewalRecords() {
        List<Student> students = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();
        List<Student> studentsRenewalRequired = new ArrayList<>();
        for (Student s : students) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(s.getRegisterTime());
            Date dateNow = new Date();
            Calendar calendarToday = Calendar.getInstance();
            calendarToday.setTime(dateNow);
            int diff = calendarToday.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
            int diffMOnth = calendarToday.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
            int diffOfDate = calendarToday.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH);
            if (diff == 0) {
                continue;
            }
            if (diff >= 2) {

                studentsRenewalRequired.add(s);
            } else if (diff == 1 && diffMOnth >= 0) {
                if (diffMOnth == 0 && diffOfDate >= 0) {
                    studentsRenewalRequired.add(s);
                } else if (diffMOnth >= 1) {
                    studentsRenewalRequired.add(s);
                }

            }
        }
        DefaultTableModel dtm = (DefaultTableModel) renewalJPanel.getTblRenewalRecords().getModel();
        dtm.setRowCount(0);
        for (Student student : studentsRenewalRequired) {
            Object[] row = new Object[dtm.getColumnCount()];
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(student.getRegisterTime());
            row[0] = student.getFirstName();
            row[1] = student.getLastName();
            row[2] = date;
            row[3] = student.getAge();
            row[4] = Integer.toString(student.getStuId());
            dtm.addRow(row);

        }
        renewalJPanel.getBtnRenew().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                renewTheRecord();
            }
        });
    }

    public void renewTheRecord() {
        int selectedRow = renewalJPanel.getTblRenewalRecords().getSelectedRow();
        if (selectedRow >= 0) {
            String studentId = (String) renewalJPanel.getTblRenewalRecords().getValueAt(selectedRow, 4);
            List<Student> student = StudentDataMangementFactory.getFactoryInstance().getObject()
                    .getDataList(Integer.parseInt(studentId));
            if (!student.isEmpty()) {
                Student st = student.get(0);
                st.setRegisterTime(new Date());
                StudentDataMangementFactory.getFactoryInstance().getObject().updateOneObject(st);
                JOptionPane.showMessageDialog(null, "Renewal Done Succesfully");
                setRenewalRecords();

            }
        } else {
            // if user didn't selected a row show message
            JOptionPane.showMessageDialog(null, "Please select a row from table first to renew!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

    }
}
