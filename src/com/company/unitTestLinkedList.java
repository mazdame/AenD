package com.company;
import jdk.nashorn.api.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class unitTestLinkedList {
    @Test
    public void testPushAndPop() {
        LinkListStack<Integer> st = new LinkListStack<>();
        st.push(50);
        st.push(70);
        st.push(190);
        assertEquals("1907050", st.toString());
        assertEquals(190, (int) st.pop());
        assertEquals("7050", st.toString());
    }

    @Test
    public void testPopUntilEmpty() {
        List<Integer> values = Arrays.asList(50, 70, 190, 20);
        LinkListStack<Integer> st = new LinkListStack<>();
        assertTrue(st.isEmpty());
        for (Integer value : values) {
            st.push(value);
        }
        assertFalse(st.isEmpty());
        for (int i = values.size(); i > 0; --i) {
            assertEquals(values.get(i - 1), st.pop());
        }
        assertTrue(st.isEmpty());
    }
}
