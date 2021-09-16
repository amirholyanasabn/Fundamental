package com.guccu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a first word : ");
        String firstWord = scan.next();

        System.out.println("Please enter your second word : ");
        String secondWord = scan.next();

        char[] firstArr = firstWord.toLowerCase().toCharArray();
        char[] secondArr = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        if (!Arrays.equals(firstArr,secondArr))
            System.out.println("not anagram");
        if (Arrays.equals(firstArr,secondArr))
            System.out.printf("%s and %s is anagram .",secondWord,secondWord);

    }
}
