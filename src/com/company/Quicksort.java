package com.company;

public class Quicksort <T extends Comparable<T>>
{
    T array[];
    int n;

    public void sort(T [] a){
        n=a.length;
        array=a;
        quickSort(0,n-1);
    }

    public void quickSort(int p, int q){
        int j;
        if( p<q){
            j=partition(p,q);
            quickSort(p, j-1);
            quickSort(j+1,q);
        }
    }
    int partition(int p, int q){
        T pivot = array[q];
        int i = p-1;
        for(int j = p; j<q; j++){
            if(array[j].compareTo(pivot)<0){

                i=i+1;
                T temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i=i+1;
        T temp=array[i]; array[i]=array[q]; array[q]=temp;
        return i;
    }
}