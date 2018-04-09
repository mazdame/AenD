package com.company;

public interface Sortable {
    <T extends Comparable<T>> void sortAscending(T[] values);
    <T extends Comparable<T>> void sortDescending(T[] values);
}

public class Utils {
    public static <T> void printArray(T[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%-2s", values[i]);
        }

        System.out.println();
    }
}

public abstract class Sorter {
    protected <T> void swap(T[] values, int first, int second) {
        T temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
}

public class BubbleSort extends Sorter implements Sortable {
    @Override
    public <T extends Comparable<T>> void sortAscending(T[] values) {
        sort02(values, 0, 1);
    }

    @Override
    public <T extends Comparable<T>> void sortDescending(T[] values) {
        sort02(values, 1, 0);
    }


public class SorterApp {
    public static void main(String[] args) {
        SorterApp app = new SorterApp();
        app.run();
    }

    private void run() {
        sort(new Integer[] { 1, 2, 3, 4, 5 });
        sort(new Integer[] { 3, 1, 5, 4, 2 });
        sort(new Integer[] { 5, 4, 3, 2, 1 });

        System.out.println();

        sort(new String[] { "a", "b", "c", "d", "e" });
        sort(new String[] { "c", "a", "e", "d", "b" });
        sort(new String[] { "e", "d", "c", "b", "a" });
    }

    private <T extends Comparable<T>> void sort(T[] values) {
        Sortable sorter = new BubbleSort();
        sorter.sortAscending(values);
        // sorter.sortDescending(values);
        Utils.printArray(values);
    }
}

    private <T extends Comparable<T>> void sort02(T[] values, int first, int second) {
        if ((null == values) || (values.length < 2)) {
            return;
        }

        int length = values.length;
        int count = 0;
        boolean isOrdered;

        for (int i = 1; i < length; i++) {
            isOrdered = true;
            for (int j = 0; j < length - i; j++) {
                count++;
                if (values[j + first].compareTo(values[j + second]) > 0) {
                    isOrdered = false;
                    swap(values, j + first, j + second);
                }
            }

            if (isOrdered) {
                break;
            }
        }
        System.out.printf("%2s: ", count);
    }