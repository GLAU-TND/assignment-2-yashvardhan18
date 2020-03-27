/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.entry(new Node(new Student(56, "Yash")));
        obj.entry(new Node(new Student(45, "Rahul")));
        obj.entry(new Node(new Student(1, "Arjun")));
        obj.entry(new Node(new Student(54, "Taran")));
        obj.entry(new Node(new Student(12, "Anushka")));
        obj.printQ();
    }
}
