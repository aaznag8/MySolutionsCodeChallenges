package com.aznag;

import java.util.Scanner;

public class SimpleAdding {

    public static int LetterChanges(int num) {
        return num*(num+1)/2;
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextInt()));
    }
}
