/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import neu.edu.csye6200.interfaces.ImmunizationDataManagementFactory;
import neu.edu.csye6200.interfaces.StudentDataMangementFactory;
import neu.edu.csye6200.model.Immunization;
import neu.edu.csye6200.model.Student;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author karan
 */
public class GraphUtil {
    public static final String KEY_1 = "Students Immunized";
    public static final String KEY_2 = "Students not Immunized";
    public static final String CLASS_1 = "Classroom-1";
    public static final String CLASS_2 = "Classroom-2";
    public static final String CLASS_3 = "Classroom-3";
    public static final String CLASS_4 = "Classroom-4";
    public static final String CLASS_5 = "Classroom-5";
    public static final String CLASS_6 = "Classroom-6";

    public void createBarChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Student enrollment in each class",
                "Classes",
                "Students",
                createBarChartDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        chartPanel.setDomainZoomable(true);

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(chartPanel, BorderLayout.NORTH);

        JFrame frame = new JFrame();
        frame.add(jPanel4);
        frame.pack();
        frame.setVisible(true);
    }

    private CategoryDataset createBarChartDataset() {
        int[] studentCounter = new int[] { 0, 0, 0, 0, 0, 0 };
        List<Student> students = StudentDataMangementFactory.getFactoryInstance().getObject().getDataList();
        for (Student s : students) {
            int age = s.getAge();
            if (age >= 6 && age <= 12) {
                studentCounter[0] = studentCounter[0] + 1;
            } else if (age >= 13 && age <= 24) {
                studentCounter[1] = studentCounter[1] + 1;
            } else if (age >= 25 && age <= 35) {
                studentCounter[2] = studentCounter[2] + 1;
            } else if (age >= 36 && age <= 47) {
                studentCounter[3] = studentCounter[3] + 1;
            } else if (age >= 48 && age <= 59) {
                studentCounter[4] = studentCounter[4] + 1;
            } else {
                studentCounter[5] = studentCounter[5] + 1;
            }
        }
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(studentCounter[0], CLASS_1, CLASS_1);
        dataset.addValue(studentCounter[1], CLASS_2, CLASS_2);
        dataset.addValue(studentCounter[2], CLASS_3, CLASS_3);
        dataset.addValue(studentCounter[3], CLASS_4, CLASS_4);
        dataset.addValue(studentCounter[4], CLASS_5, CLASS_5);
        dataset.addValue(studentCounter[5], CLASS_6, CLASS_6);

        return dataset;
    }

    public void createPieChart() {
        JFreeChart pieCHart = ChartFactory.createPieChart("Student Immunization data", createPieChartDataset());

        PiePlot plot = (PiePlot) pieCHart.getPlot();
        plot.setSectionPaint(KEY_1, Color.green);
        plot.setSectionPaint(KEY_2, Color.red);
        plot.setExplodePercent(KEY_1, 0.10);
        plot.setSimpleLabels(true);

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        ChartPanel chartPanel = new ChartPanel(pieCHart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        chartPanel.setDomainZoomable(true);

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(chartPanel, BorderLayout.NORTH);

        JFrame frame = new JFrame();
        frame.add(jPanel4);
        frame.pack();
        frame.setVisible(true);
    }

    private DefaultPieDataset createPieChartDataset() {
        int[] immuCounter = new int[] { 0, 0 }; // 0 for true values and 1 for false values
        List<Immunization> immu = ImmunizationDataManagementFactory.getFactoryInstance().getObject().getDataList();
        for (Immunization i : immu) {
            if (i.isStatus()) {
                immuCounter[0] += 1;
            } else {
                immuCounter[1] += 1;
            }
        }
        final DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue(KEY_1, immuCounter[0]);
        dataset.setValue(KEY_2, immuCounter[1]);
        return dataset;
    }
}
