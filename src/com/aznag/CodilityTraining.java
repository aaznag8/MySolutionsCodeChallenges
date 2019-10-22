package com.aznag;

import java.util.*;

public class CodilityTraining {

    /**
     * Smallest positif number > 1 not conatined in the given int array
     * @param A
     * @return
     */
    public static int smallestNotContainedPosNumber(int[] A) {
        //
        if(A == null) return -1;
        Arrays.sort(A);
        int min = 1;
        for(int i:A) {
            if(min < i && i >0) {
                return min;
            } else if(i > 0) {
                min = i+1;
            }
        }
        return Math.max(A[A.length-1] +1 , 1);
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(smallestNotContainedPosNumber(new int[]{ 1,2,4,3,5,8,9,100 }));
    }
}
