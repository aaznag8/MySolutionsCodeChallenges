package com.aznag;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class LongestWord {
    public static String LongestWord(String sen) {
        //ArrayList<String>
        String [] senArray = sen.split("[^A-Za-z0-9]");
        String longestWord ="";
        int senArrayLength = senArray.length;
        for(int i = 0; i<=(senArrayLength/2); i++){
            if (senArray[i].length() >= longestWord.length()) {
                longestWord = senArray[i];
            }
            if(senArray[senArrayLength-1-i].length() > longestWord.length()) {
                longestWord = senArray[senArrayLength-1-i];
            }
        }
        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
