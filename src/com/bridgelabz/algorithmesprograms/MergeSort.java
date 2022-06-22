package com.bridgelabz.algorithmesprograms;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        String sentence = "hi,this,priya,how ,are,you";
        String array[] = sentence.toLowerCase().split(",");

        sort.mergeSort(array, 0, array.length - 1);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public void mergeSort(String[] array, int low, int high) {

        if (high - low < 1)
            return;

        int mid = (high + low) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    public void merge(String[] array, int low, int mid, int high) {

        String[] firstArray = new String[mid - low + 1];
        String[] secondArray = new String[high - mid];

        for (int i = 0; i < mid - low + 1; i++)
            firstArray[i] = array[low + i];
        for (int i = 0; i < high - mid; i++)
            secondArray[i] = array[mid + i + 1];

        int k = low, i = 0, j = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i].compareTo(secondArray[j]) > 0)
                array[k++] = firstArray[i++];
            else
                array[k++] = secondArray[j++];
        }

        while (i < firstArray.length)
            array[k++] = firstArray[i++];
        while (j < secondArray.length)
            array[k++] = secondArray[j++];

    }
}
