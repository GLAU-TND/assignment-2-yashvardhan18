/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchobj class for creating binary obj
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        //taking hard-coded inputs
        obj.add(51);
        obj.add(39);
        obj.add(31);
        obj.add(54);
        obj.add(92);
        obj.add(42);
        obj.add(21);
        obj.add(10);
        obj.add(26);
        obj.add(52);
        obj.add(36);
        obj.add(47);
        obj.add(82);
        obj.add(5);
        obj.add(62);
        MyQueue queue = new MyQueue();
        queue.entry(obj.root);
        queue.printQ();
    }
}
