/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "Yash", 0, 0));
        studentList.add(new Student(2, "Rahul", 5, 2));
        studentList.add(new Student(3, "Taran", 4, 1));
        studentList.add(new Student(4, "Divyanshu", 2, 2));
        studentList.add(new Student(5, "Elaine", 0, 0));
        studentList.add(new Student(6, "Fank", 2, 1));
        studentList.add(new Student(7, "Gordon", 4, 1));
        studentList.add(new Student(8, "Harvey", 3, 1));
        studentList.add(new Student(9, "Irene", 0, 0));
        studentList.add(new Student(10, "James", 2, 0));
        studentList.add(new Student(11, "Kevin", 1, 1));

        MyCircularQueue ob = new MyCircularQueue();
        ob.enqueue(studentList);

        ob.printQ();


    }
}
