/* program to find multiplication table  */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;int table=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println("multiplication table of n:"+n*i);
        }

    }
}
