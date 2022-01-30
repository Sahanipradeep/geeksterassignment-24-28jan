/* program to find average  of two number */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float a,b,average;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first numbers:");
        a=s.nextFloat();
        System.out.println("enter the second numbers:");
        b=s.nextFloat();
        average=(a+b)/2;
        System.out.println("average of two number is:"+average);



    }
}
