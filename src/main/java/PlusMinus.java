/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), pos = 0, neg = 0, zero = 0;
        int arr[] = new int[n];
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(4);
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] > 0) {
                pos++;
            } else if (arr[arr_i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        double dpos = pos+0.0 ,dneg = neg+0.0 ,dzero = zero+0.0;
        
        System.out.println(df.format(dpos / n));
        System.out.println(df.format(dneg / n));
        System.out.println(df.format(dzero / n));

    }
}
