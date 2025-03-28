
package neu.edu.csye6200.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sanjay
 */
public class Teacher extends Person {
    private int teachID;
    private boolean isAssigned;
    private String classRoomName;
    private String emailid;
    private String password;
    private int credits;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, Date registerTime, int teachID,
            boolean isAssigned, String classRoomName,
            String emailid, String password, int credit) {
        this.registerTime = registerTime;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teachID = teachID;
        this.classRoomName = classRoomName;
        this.isAssigned = isAssigned;
        this.emailid = emailid;
        this.password = password;
        this.credits = credit;
    }

    public int getTeachID() {
        return teachID;
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

    public void setTeachID(int teachID) {
        this.teachID = teachID;
    }

    public boolean getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(registerTime);
        String name = isAssigned ? classRoomName : "";
        return firstName + "," + lastName + "," + date + "," + teachID + "," + isAssigned + "," + name + "," + emailid
                + "," + password + "," + credits;
    }

}
