/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

import java.util.ArrayList;

//to implement circular queue
public class MyCircularQueue {
    private Node front;
    private int size;

    public MyCircularQueue() {
        front = null;
        size = 0;
    }

    public void enqueue(ArrayList<Student> addData) {
        for (Student s : addData
        ) {
            if (s.getBackLog() - s.getAppearance() == 0) {
            } else if (s.getBackLog() - s.getAppearance() > 0) {

                Node temp = new Node(s);
                if (this.front == null) {
                    front = temp;
                    temp.setNext(temp);
                    size++;
                } else {
                    temp.setNext(this.front);
                    Node par = this.front;
                    while (par.getNext() != this.front) {
                        par = par.getNext();
                    }
                    par.setNext(temp);
                    front = temp;
                    size++;
                }
            } else {

                System.out.println("Wrong Data!!! ");
            }
        }

    }

    public int getSize() {
        return size;
    }

    public void printQ() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                System.out.print(temp.getData().toStrings() + "->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toStrings());
            }
        }
    }
}
