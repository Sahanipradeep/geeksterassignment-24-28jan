/*  program to check if a year is leap year or not   */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int y;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year:");
        y=s.nextInt();
        if(y%100==0 && y%400==0||y%100!=0 && y%4==0)
            System.out.println(" year is leap year");
        else
            System.out.println("year is not leap year");


    }
}
