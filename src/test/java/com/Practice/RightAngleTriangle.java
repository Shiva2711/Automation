package com.Practice;
public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // Print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}