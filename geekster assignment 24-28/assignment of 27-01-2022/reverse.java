/*  program to find reverse of a number */



package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,rev;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number:");
        n=s.nextInt();
        while(n>0){
           rev= n%10;
            System.out.print(rev);
           n=n/10;

        }

    }
}
