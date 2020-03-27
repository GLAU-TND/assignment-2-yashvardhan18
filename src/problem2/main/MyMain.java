/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of inputs :-");
        int i = sc.nextInt();
        while (i > 0) {
            obj.add(sc.nextInt());
            i--;

        }
        obj.preOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);

    }
}


