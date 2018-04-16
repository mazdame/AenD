package com.company;

public class Secsearch<T> {

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