/* program to find sum till n   */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum of numbers:"+sum);
    }
}

