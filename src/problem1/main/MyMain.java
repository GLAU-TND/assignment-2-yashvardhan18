/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;
// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree ob = new MyBinarySearchTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of inputs:-");
        int i = sc.nextInt();
        while (i > 0) {
            ob.add(sc.nextInt());
        }
    }
}
