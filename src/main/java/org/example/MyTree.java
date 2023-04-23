package org.example;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.max;

public class MyTree {
    private Node root;

    public MyTree(Node root){
        this.root = root;
    }

    public int numberOfLeaves(){
        int leavesCounter = 0;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(this.root);

        while(!nodeQueue.isEmpty()){
            Node node = nodeQueue.remove();
            Node leftChild = node.getLeftChild();
            Node rightChild = node.getRightChild();

            if(leftChild == null && rightChild == null){
                leavesCounter ++;
            }
            if(leftChild != null){
                nodeQueue.add(leftChild);
            }
            if(rightChild != null){
                nodeQueue.add(rightChild);
            }
        }
        return leavesCounter;
    }

    public int treeHeight(){
       return heightRecursion(root);
    }

    private int heightRecursion(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightRecursion(root.getLeftChild());
        int rightHeight = heightRecursion(root.getRightChild());

        return max(rightHeight, leftHeight) + 1;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        if (!(o instanceof MyTree)) {
            return false;
        }

       return areTreesEqual(this.root, ((MyTree) o).getRoot());
    }

    private boolean areTreesEqual(Node root1, Node root2){
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        return root1.equals(root2) &&
                areTreesEqual(root1.getLeftChild(), root2.getLeftChild()) &&
                areTreesEqual(root1.getRightChild(), root2.getRightChild());
    }

    public Node getRoot() {
        return root;
    }
}
