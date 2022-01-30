/*program to check number is prime or not */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,i,count=0;
	Scanner s=new Scanner(System.in);
    System.out.println("enter the number to check:");
    n=s.nextInt();
    for(i=1;i<=n;i++) {
        if (n % i == 0) {

            count++;

        }
    }
        if(count==2)
            System.out.println("number is prime");
         else
            System.out.println("number is not prime");


    }
}
