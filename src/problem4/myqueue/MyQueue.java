/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;

import problem1.node.TreeNode;
import problem4.node.Node;

import static problem1.mybst.MyBinarySearchTree.preOrder;
import static problem1.mybst.MyBinarySearchTree.preString;

public class MyQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void entry(TreeNode root) {
        preOrder(root);
        String[] data = preString.toString().split(" ");
        for (int i = 0; i < data.length; i++) {
            Node node = new Node(Integer.parseInt(data[i]));
            if (front == null) {
                rear = node;
                front = node;
                size++;
            } else {
                rear.setNext(node);
                rear = node;
                size++;
            }
        }
    }

    public void printQ() {
        Node temp = this.front.getNext();
        for (int i = 0; i < this.size - 1; i++) {
            if (i != this.size - 2) {
                System.out.print(temp.getData() + "->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData());
            }
        }
    }
}
