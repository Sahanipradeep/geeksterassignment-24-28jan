/* program to find compound interest  */



package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      double amount=0,p,r,t,ci,a=1;
      Scanner s=new Scanner(System.in);
        System.out.println("enter the principal amount:");
        p=s.nextDouble();
        System.out.println("enter the rate of interest:");
        r=s.nextDouble();
        System.out.println("enter the time:");
        t=s.nextDouble();

        r=(1+r/100);
        for(int i=0;i<a;i++) {
            a = a * r;
            amount = p * a;
            System.out.println("amount+amount:");
            ci = amount - p;
            System.out.println("compund interest is:" + ci);

        }

    }
}
