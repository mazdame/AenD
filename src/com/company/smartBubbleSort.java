package com.company;

import java.util.List;


    public class smartBubbleSort<T extends Comparable<T>> {


        public List<T> sortedList;


        public void main(String[] args) {
        }

        public smartBubbleSort(List<T> legoArray) {
            sortedList = legoArray;

            int n = sortedList.size();
            for (int i = 0; i < n; i++) {
                boolean sorted = true;
                for (int j = 1; j < (n - i); j++) {

                    if (sortedList.get(j - 1).compareTo(sortedList.get(j)) > 0) {
                        swap(j - 1, j);
                        sorted = false;
                    }
                }

                if (sorted) {
                    break;
                }
            }
        }

        void swap(int i, int j) {
            T temp = sortedList.get(i);

            sortedList.set(i, sortedList.get(j));
            sortedList.set(j, temp);
        }

        public List<T> returnSorted() {
            return sortedList;

        }
    }

