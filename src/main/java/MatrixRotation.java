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
public class MatrixRotation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt(), r = in.nextInt();
        int[][] num = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = in.nextInt();
            }
        }

        int[][] ar = rot(m, n, num);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] rot(int m, int n, int[][] num) {
        int[][] num2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i && i < (m / 2)) {
                    num2[i + 1][j] = num[i][j];
//                } else if (j == i && i >= (m / 2)) {
//                    num2[i - 1][j] = num[i][j];
                } else if (j > i) {
                    if (j != n - 1) {
                        if (j > n / 2) {
                            num2[i][j + 1] = num[i][j];
                        } else {
                            num2[i][j - 1] = num[i][j];
                        }
                    } else {
                        if (i == 0) {
                            num2[i][j - 1] = num[i][j];
                        } else {
                            num2[i - 1][j] = num[i][j];
                        }
                    }
                } else {// if (j < i) {
                    if (i != m - 1) {
                        if (j == m - i - 1) {
                            num2[i][j + 1] = num[i][j];
                        } else if (i > m / 2 && j >= n / 2) {
                            num2[i - 1][j] = num[i][j];
                        } else if (i == j) {
                            num2[i][j + 1] = num[i][j];
                        } else {
                            num2[i + 1][j] = num[i][j];
                        }
                    } else if (j != n - 1) {
                        num2[i][j + 1] = num[i][j];

                    } else {
                        num2[i - 1][j] = num[i][j];
                    }
                }

            }
        }

        return num2;
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
