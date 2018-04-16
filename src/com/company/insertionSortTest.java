package com.company;

import org.junit.Assert;
import org.junit.Test;

public class insertionSortTest {


        @Test
        public void main() {
                 class InsertionSortTester {
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
                                insertionSort.GenericInsertionSorter ss = new insertionSort.GenericInsertionSorter();
                                ss.sort(unsortedNames);
                                Assert.assertArrayEquals(unsortedNames, sortedNames);

                        }
                }
        }

        @Test
        public void swap() {
        }

        @Test
        public void returnSorted() {
        }
    }

