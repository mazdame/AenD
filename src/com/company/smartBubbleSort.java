package com.company;

import java.util.List;


    public class smartBubbleSort<T extends Comparable<T>> {

        // create generic list t to put all unsorted things in.
        public List<T> sortedList;

        // main functie om de Ant build blij te maken
        public void main(String[] args) {
        }

        public smartBubbleSort(List<T> legoArray) {
            sortedList = legoArray; // fill sorted list with all the unsorted things.

            int n = sortedList.size();
            for (int i = 0; i < n; i++) { // loop through all items
                boolean sorted = true; // create boolean to check if sorted
                for (int j = 1; j < (n - i); j++) { // create another loop to begin the check at the left side.
                    // call compareTo to start the check returning -1, 0 or >0. -1 = last one lower
                    // (do nothing), 0 = even, > 0 = last one higher (so swap)
                    if (sortedList.get(j - 1).compareTo(sortedList.get(j)) > 0) {
                        swap(j - 1, j); // swap the values.
                        sorted = false; // set boolean to false
                    }
                }
                // didn't swap so array is already sorted. no need for more passes
                if (sorted) {
                    break;
                }
            }
        }

        void swap(int i, int j) {
            T temp = sortedList.get(i); // get old, store in temp

            sortedList.set(i, sortedList.get(j)); // swap values
            sortedList.set(j, temp); // override temp
        }

        public List<T> returnSorted() {
            return sortedList; // return sorted list
        }

    }

