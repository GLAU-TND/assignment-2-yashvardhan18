/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder preString;
    static int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = null;
        preString = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preString.append(root.getTree() + "   ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public TreeNode addService(final TreeNode treeRoot, final int addValue) {
        if (treeRoot == null) {
            return new TreeNode(addValue);
        }
        if (addValue < treeRoot.getTree()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(), addValue));
        } else if (addValue == treeRoot.getTree()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addValue));
        }

        return treeRoot;
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getTree() + "   ");
    }

}
