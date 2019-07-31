/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
public class ExtraLongFactorials {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger tot,t;
         tot = new BigInteger("1");
         for (int i = 1; i <= n; i++) {
            t = new BigInteger(i+"");
            tot = tot.multiply(t);
         }
         System.out.println(tot);
    }
     
}
