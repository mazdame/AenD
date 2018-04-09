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
                //swap array[i+1] and array[j]
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
    public  void displayArray(){

        for(int i=0; i< n-1; i++)
            System.out.print(array[i]+" < ");
        System.out.println(array[n-1]);
    }

    public  void displayArray(T [] la){
        int ln = la.length;
        for(int i=0; i< ln-1; i++)
            System.out.print(la[i]+" < ");
        System.out.println(la[ln-1]);
    }
//    public static void main(String args[]){
//        Quicksort qs1= new Quicksort();
//        Quicksort qs2= new Quicksort();
//        Quicksort qs4= new Quicksort();
//
//        Double  [] a1 = {0.12, 0.92, 0.23, .89, 0.42, 0.73, 0.34, 0.64, 0.51, 0.42, 0.5};
//        Integer [] a2 = {1, 9, 2, 8, 3, 7, 4, 6, 5};
//        String  [] a3 = {"me", "she", "you", "he"};
//        Character    [] a4 = {'a', 'p', 'p', 'l','e','m','a','c','h','i','n','t','o','s','h'};
//        qs4.sort(a4); //On completition of this call, a4 is sorted, but the result is printed later.
//        qs1.sort(a1);
//        qs2.sort(a2);
//        qs1.displayArray();
//        qs2.displayArray();
//        qs2.sort(a3);
//        qs2.displayArray(); // How do you print the result of sorted array a2 now?
//        qs4.displayArray();
//        qs1.displayArray(a2); //this would work with any instance qs1, qs2, qs3, qs4 or a new one.
//        new Quicksort().displayArray(a3) ; // an instance with no name is created to print a3
//    }
}