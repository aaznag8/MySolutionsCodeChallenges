package com.aznag;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringMatcher {

    public static String SimpleSymbols(String str) {
        String numMarks = str.replaceAll("[^0-9?]", "");
        Pattern p = Pattern.compile("(\\d\\?+\\d)");
        Matcher m = p.matcher(numMarks);
        boolean matched = false;
        while (m.find()) {
            String match = m.group();
            int a = Integer.parseInt(match.substring(0, 1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if (a + b == 10) {
                if (match.length() != 5) {
                    return "false";
                } else {
                    matched = true;
                }
            }
        }
        return matched ? "true" : "false";
//        String strL = str.toLowerCase();
//        if(!strL.isEmpty() && ((strL.charAt(0) >='a' && strL.charAt(0) <='z')
//                || (strL.charAt(strL.length()-1) >='a' && strL.charAt(strL.length()-1) <='z'))) {
//            return  String.valueOf(false);
//        }
//
//        for(int i=1; i<strL.length()-1; i++) {
//            if(strL.charAt(i) >='a' && strL.charAt(i) <='z') {
//                if(strL.charAt(i-1) != '+' || strL.charAt(i+1) != '+') {
//                    return String.valueOf(false);
//                }
//            }
//        }
//        return String.valueOf(true);
        //boolean b = str.toLowerCase().matches("([^a-z]*((\\Q+\\E)+?[a-z]?+(\\Q+\\E)+?)?[^a-zA-Z]*)*");
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        //System.out.print(SimpleSymbols(s.nextLine()));
        System.out.print(SimpleSymbols("+d===+a+"));
    }
}
