package com.aznag;

import java.util.Scanner;

public class TimeConverter {
    public static String timeConvert(int num) {
        int hours = num/60;
        int min = num % 60;
        return ""+hours + ":" + min;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(timeConvert(s.nextInt()));
    }
}
