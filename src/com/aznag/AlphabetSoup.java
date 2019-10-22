package com.aznag;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {

    /**
     * return a string of the given string's letters sorted in a ascending
     * @param str
     * @return
     */
    public static String alphabetSoupFun(String str) {
        //Handle the null case
        if(str==null) return "";
        //if not null
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr); // sorting the char array
        StringBuilder sortedString = new StringBuilder(charArr.length);
        for (int i=0; i<charArr.length; i++) { // building a new string from the sorted char array
            sortedString.append(charArr[i]);
        }
        return sortedString.toString().trim();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(alphabetSoupFun(s.nextLine()));
    }
}

