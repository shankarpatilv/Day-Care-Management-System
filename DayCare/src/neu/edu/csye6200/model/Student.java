
package neu.edu.csye6200.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author shreyas
 */
public class Student extends Person {
    private int stuId;
    private int age;// monthly age
    private String fatherName;
    private String motherName;
    private List<Immunization> immunizations;
    private String address;
    private long phoneNo;
    private double GPA;
    private String emailid;
    private String password;
    // private

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student() {

    }

    public Student(String firstName, String lastName, Date registerTime,
            int stuId, int age, String fatherName, String motherName,
            String address, long phoneNo, double GPA,
            String emailid, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registerTime = registerTime;
        this.stuId = stuId;
        this.age = age;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.GPA = GPA;
        this.emailid = emailid;
        this.password = password;
        immunizations = new ArrayList<>();

    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<Immunization> getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(List<Immunization> immunizations) {
        this.immunizations = immunizations;
    }

    public String toString() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(registerTime);
        return firstName + "," + lastName + "," + date + "," + stuId + "," + age + "," + fatherName + "," + motherName
                + "," + address + "," + phoneNo + "," + GPA + "," + emailid + "," + password;
    }

}
