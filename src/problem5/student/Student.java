/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {

    private int rno;
    private String Name;
    private int backLog;
    private int appearance;

    public Student(int rno, String name) {
        this.rno = rno;
        Name = name;
    }

    public Student(int rno, String name, int backLog, int appearance) {
        this.rno = rno;
        Name = name;
        this.backLog = backLog;
        this.appearance = appearance;
    }

    public int getRollNumber() {
        return rno;
    }

    public void setRollNumber(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBackLog() {
        return backLog;
    }

    public void setBackLog(int backLog) {
        this.backLog = backLog;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNumber=" + rno +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String toStrings() {
        return "Student{" +
                "RollNumber=" + rno +
                ", Name='" + Name + '\'' +
                ", backLogs=" + backLog +
                ", appearances=" + appearance +
                '}';
    }
}

