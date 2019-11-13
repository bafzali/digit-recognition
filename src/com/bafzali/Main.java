package com.bafzali;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] gridInputThreeByThree = {scanner.nextLine().toUpperCase().toCharArray(),
                scanner.nextLine().toUpperCase().toCharArray(), scanner.nextLine().toUpperCase().toCharArray()};
        int[][] value = new int[3][3];
        int number;

        // Populate value matrix with 1 or zero based on user input
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (gridInputThreeByThree[i][j] == 'X') {
                    value[i][j] = 1;
                }
                if (gridInputThreeByThree[i][j] == '_') {
                    value[i][j] = 0;
                }
            }
        }

        int aOne = value[0][0];
        int aTwo = value[0][1];
        int aThree = value[0][2];
        int aFour = value[1][0];
        int aFive = value[1][1];
        int aSix = value[1][2];
        int aSeven = value[2][0];
        int aEight = value[2][1];
        int aNine = value[2][2];
        int aTen = aOne*2 + aTwo*1 + aThree*2 + aFour*4 + aFive*(-4) + aSix*4 + aSeven*2 + aEight*(-1) + aNine*2 - 5;

        if (aTen > 0) {
            number = 0;
        } else {
            number = 1;
        }
        System.out.println("This number is " + number);
    }
}
