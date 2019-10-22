package com.aznag;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterChanger {
    public static String LetterChanges(String str) {
        String  strLoc = str.toLowerCase();
        StringBuilder sResult = new StringBuilder();
        String origin = "abcdefghijklmnopqrstuvwxyz";
        String replacement = "bcdEfghIjklmnOpqrstUvWxyzA";
        for (int i=0; i< strLoc.length(); i++) {
            if(strLoc.charAt(i)>='a' && strLoc.charAt(i)<'z') {
                sResult.append(replacement.charAt(origin.indexOf(strLoc.charAt(i))));
            } else if(strLoc.charAt(i) == 'z') {
                sResult.append('a');
            } else {
                sResult.append(strLoc.charAt(i));
            }
        }
        // result
        return sResult.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }
}
