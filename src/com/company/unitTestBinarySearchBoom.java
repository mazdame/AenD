package com.company;
import jdk.nashorn.api.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class unitTestBinarySearchBoom {
    @Test
    public void testInput() {
        BinaryTreee tree = new BinaryTreee();
        tree.add(3);
        tree.add(4);
        tree.add(5);
        assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
    }

    @Test
    public void SecondInputTest() {
        BinaryTreee tree = new BinaryTreee();
        tree.add(4);
        tree.add(5);
        tree.add(3);
        assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
    }
}
