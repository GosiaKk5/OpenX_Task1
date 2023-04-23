package org.example;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        if (!(o instanceof Node)) {
            return false;
        }
        return ((Node) o).getValue() == this.value;
    }

    public void setValue(int value){
        this.value = value;
    }
    public void setLeftChild(Node child){
        this.leftChild = child;
    }

    public void setRightChild(Node child){
        this.rightChild = child;
    }

    public int getValue(){
        return this.value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild(){
        return this.rightChild;
    }


}
