package com.aznag;

import java.util.Scanner;

public class ChessQueens {
    /**
     * Returns the first queen that would attack onother one in the given Array
     * returns "True" if the no one can attack another one
     * @param strArr
     * @return
     */
    public String EightQueens(String[] strArr) {
        // code goes here
        for (int i = 0; i<strArr.length; i++) {
            String[]  sNum = strArr[i].replaceAll("[^0-9,]", "").split("[,]");
            int x1 = Integer.valueOf(sNum[0]);
            int y1 = Integer.valueOf(sNum[1]);

            // other Queens should ot be in the same line or same row
            for(int j=i+1; j<strArr.length; j++) {
                String[]  sNum2 = strArr[j].replaceAll("[^0-9,]", "").split("[,]");
                int x2 = Integer.valueOf(sNum2[0]);
                int y2 = Integer.valueOf(sNum2[1]);
                if(x1 == x2 || y1 == y2) {
                    return strArr[i];
                }
                // Here we check the diagonal movement
                //Moving forward
                for(int k=1; k<=8-Math.max(x1,y1); k++) {
                    if(x1+k == x2 && y1+k == y2) {
                        return strArr[i];
                    }
                }
                // Moving backward
                for(int k=1; k<=Math.min(x1,y1); k++) {
                    if(x1-k == x2 && y1-k == y2) {
                        return strArr[i];
                    }
                }

                int x3 = x1+1;
                int y3 = y1-1;
                while(x3 <=8 && y3>=1) {
                    if(x3 == x2 && y3 == y2) {
                        return strArr[i];
                    }
                    x3++; y3--;
                }

                int x4 = x1-1;
                int y4 = y1+1;
                while(x4 >=1 && y4<=8) {
                    if(x4 == x2 && y4 == y2) {
                        return strArr[i];
                    }
                    x4--; y4++;
                }
            }
        }
        return "True";
    }

}