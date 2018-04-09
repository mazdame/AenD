package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test
    public void InputTest() {
        BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(4);
        tree.add(5);
        assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
    }

    @Test
    public void InputTest2() {
        BinaryTree tree = new BinaryTree();
        tree.add(4);
        tree.add(5);
        tree.add(3);
        assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
    }
}
