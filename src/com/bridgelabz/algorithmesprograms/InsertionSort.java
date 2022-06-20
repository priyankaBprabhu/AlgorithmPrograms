package com.bridgelabz.algorithmesprograms;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertion = new InsertionSort();
        String array[] = {"hi","friends", "hello","welcome", "to", "bridgeLabz"};

        insertion.insertionSort(array);
        for(int i = 0;  i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void insertionSort(String [] array) {

        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            int index = i - 1;
            while(index >= 0 && array[index].compareTo(temp) > 0) {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = temp;

        }
    }
}
