package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTreeTest {

    private MyTree tree, tree2, tree3;


    @BeforeEach
    public void setUp(){

        //creating tree1
        Node root = new Node(5);
        tree = new MyTree(root);
        Node n1 = new Node(3);
        Node n2 = new Node(7);
        Node n3 = new Node(2);
        Node n4 = new Node(5);
        Node n5 = new Node(1);
        Node n6 = new Node(0);
        Node n7 = new Node(2);
        Node n8 = new Node(8);
        Node n9 = new Node(5);

        root.setLeftChild(n1);
        root.setRightChild(n2);
        n1.setLeftChild(n3);
        n1.setRightChild(n4);
        n2.setLeftChild(n5);
        n2.setRightChild(n6);
        n6.setLeftChild(n7);
        n6.setRightChild(n8);
        n8.setRightChild(n9);

        //creating tree2
        Node root2 = new Node(5);
        tree2 = new MyTree(root2);
        Node n21 = new Node(3);
        Node n22 = new Node(7);
        Node n23 = new Node(2);
        Node n24 = new Node(5);
        Node n25 = new Node(1);
        Node n26 = new Node(0);
        Node n27 = new Node(2);
        Node n28 = new Node(8);
        Node n29 = new Node(5);

        root2.setLeftChild(n21);
        root2.setRightChild(n22);
        n21.setLeftChild(n23);
        n21.setRightChild(n24);
        n22.setLeftChild(n25);
        n22.setRightChild(n26);
        n26.setLeftChild(n27);
        n26.setRightChild(n28);
        n28.setRightChild(n29);

        //creating tree3
        Node root3 = new Node(5);
        tree3 = new MyTree(root3);
        Node n31 = new Node(3);
        Node n32 = new Node(7);
        Node n33 = new Node(2);

        root3.setLeftChild(n31);
        root3.setRightChild(n32);
        n31.setLeftChild(n33);
    }

    @Test
    void ifGetNumberOfLeaves(){
        //given
        int expectedNumberOfLeaves = 5;

        //when
        int numberOfLeaves = tree.numberOfLeaves();

        //then
        Assertions.assertEquals(expectedNumberOfLeaves, numberOfLeaves);

    }

    @Test
    void ifGetHeightOfTree(){
        //given
        int expectedHeight = 5;

        //when
        int height = tree.treeHeight();

        //then
        Assertions.assertEquals(expectedHeight, height);
    }

    @Test
    void ifTreesAreEqual(){
        Assertions.assertTrue(tree.equals(tree2));
    }

    @Test
    void ifTreesAreNotEqual(){
        Assertions.assertFalse(tree.equals(tree3));
    }
}
