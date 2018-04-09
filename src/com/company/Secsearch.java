package com.company;

public class Secsearch<T> {
    /**
     * @param searchArr the array you want to search in
     * @param search the element you want to search in the array
     * @return the position of the element that has been found or -1 if the item is not in the array
     */
    public int search(T[] searchArr, T search)
    {
        for (int i = 0; i < searchArr.length; i++)
        {
            if (searchArr[i] == search)
                return i;
        }

        return -1;
    }
}