package com.aznag;

import java.util.Scanner;

public class FirstLetterCapitalizer {
    public static String LetterCapitalize(String str) {
        // code goes here
        if(str == null) return "";
        String [] strArr = str.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (String s: strArr) {
            sBuilder.append(s.substring(0,1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return sBuilder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}