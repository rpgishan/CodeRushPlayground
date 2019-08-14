/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gishan-mac
 */
public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String time = in.next(), time24;
        int h = Integer.parseInt(time.substring(0, 2));
        String hs = time.substring(0, 2);
        String m = time.substring(3, 5);
        String s = time.substring(6, 8);
        boolean b = time.substring(8, 10).equals("AM");

        if (b) {
            if (h == 12) {
                time24 = "00:" + m + ":" + s;
            } else {
                time24 = hs + ":" + m + ":" + s;
            }
        } else {
            time24 = h+12 + ":" + m + ":" + s;

        }
        System.out.println(time24);
        
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
       Date date = parseFormat.parse(time);
       System.out.println(displayFormat.format(date));
        

    }
}
