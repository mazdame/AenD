package com.company;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import com.company.LinkedListStack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class unitTestLinkedList {
    @Test
    public void testPushAndPop() {
        LinkedListStack<Integer> Link = new LinkedListStack<>();
        Link.push(60);
        Link.push(10);
        Link.push(120);
        assertEquals("1201060", Link.toString());
        assertEquals(120, (int) Link.pop());
        assertEquals("1060", Link.toString());
    }

    @Test
    public void testPopUntilEmpty() {
        List<Integer> values = Arrays.asList(60, 10, 120, 80);
        LinkedListStack<Integer> Link = new LinkedListStack<>();
        assertTrue(Link.isEmpty());
        for (Integer value : values) {
            Link.push(value);
        }
        assertFalse(Link.isEmpty());
        for (int i = values.size(); i > 0; --i) {
            assertEquals(values.get(i - 1), Link.pop());
        }
        assertTrue(Link.isEmpty());
    }
}
