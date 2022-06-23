package com.bridgelabz.algorithmesprograms;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = sc.next();
        System.out.println("Enter second string");
        String string2 = sc.next();

        Anagram anagram = new Anagram();
        anagram.anagramFun(string1,string2);

    }

    public void anagramFun(String string1, String string2) {
        char[] stringArray1 =string1.toCharArray();
        char[] stringArray2 = string2.toCharArray();

        sortMethod(stringArray1);
        sortMethod(stringArray2);

        string1 = new String(stringArray1);
        string2 = new String(stringArray2);

        if(string1.equals(string2))
            System.out.println(" They are anagrams");
        else
            System.out.println(" They are not anagrams");

    }
    public static void sortMethod(char [] array) {
        char temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > (array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
