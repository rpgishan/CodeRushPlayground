/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
public class FindTheMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), median=0;
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
            median = arr[n/2];
        System.out.println(median);
    }
}
