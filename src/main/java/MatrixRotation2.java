/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
public class MatrixRotation2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt(), r = in.nextInt();
        int[][] num = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = in.nextInt();
            }
        }

        int[][] ar = rot(m, n, num,r);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] rot(int m, int n, int[][] num, int r) {
        int[][] num2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i < m / 2) && (j >= i + 1) && (j < n - i)) {
                    num2[i][j - 1] = num[i][j];
                } else if ((j < n / 2) && (i >= j) && (i < m - j - 1)) {
                    num2[i + 1][j] = num[i][j];
                } else if ((i >= m / 2) && (j >= m - i - 1) && (j < n - m + i)) {
                    num2[i][j + 1] = num[i][j];
                } else if ((j >= n / 2) && (i >= n - j) && (i <= m - n + j)) {
                    num2[i - 1][j] = num[i][j];
                }
            }
        }
        if (r != 1) {
            return rot(m, n, num2, r - 1);
        } else {
            return num2;
        }
    }
}
/*

 4 4 1
 1 2 3 4
 5 6 7 8
 9 10 11 12
 13 14 15 16

 5 4 1
 1 2 3 4
 5 6 7 8
 9 10 11 12
 13 14 15 16
 17 18 19 20

 4 5 1
 1 2 3 4 5
 6 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20
 */
