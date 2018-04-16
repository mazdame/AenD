package com.company;

import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.Assert;
import org.junit.Test;

public class insertionSort {
    static class GenericInsertionSorter {
        public <T extends Comparable<T>> void sort(T[] elems) {
            int size = elems.length;
            for (int outerLoopIdx = 1; outerLoopIdx < size; ++outerLoopIdx) {
                for (int innerLoopIdx = outerLoopIdx; innerLoopIdx > 0; --innerLoopIdx) {
                    if (elems[innerLoopIdx - 1].compareTo(elems[innerLoopIdx]) > 0) {
                        T temp = elems[innerLoopIdx - 1];
                        elems[innerLoopIdx - 1] = elems[innerLoopIdx];
                        elems[innerLoopIdx] = temp;
                    }
                }
            }
        }
    }

    public class InsertionSortTester {
        private String[] unsortedNames = new String[]{
                "olifant",
                "vis",
                "dier",
                "antiloop",
                "walvis",
                "rog",
                "hond",
                "kat",
                "marmot",
                "koala",
                "struisvogel"};
        private String[] sortedNames = new String[]{
                "antiloop",
                "dier",
                "hond",
                "kat",
                "koala",
                "marmot",
                "olifant",
                "rog",
                "struisvogel",
                "vis",
                "walvis"};

        @Test
        public void testStringSort() {
            GenericInsertionSorter ss = new GenericInsertionSorter();
            ss.sort(unsortedNames);
            Assert.assertArrayEquals(unsortedNames, sortedNames);

        }
    }
}
