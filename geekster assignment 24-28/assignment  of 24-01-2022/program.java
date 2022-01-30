/*program to find maximum of two numbers */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b;
	Scanner s=new Scanner(System.in);
    System.out.println("enter the first numbers:");
   a=s.nextInt();
        System.out.println("enter the second numbers:");
    b=s.nextInt();
        if (a>b)
            System.out.println("a is maximum");
        else
            System.out.println("b is maximum");
    }
}
