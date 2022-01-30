/* program to swap tw numbers  */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=s.nextInt();
        System.out.println("enter the value of b:");
        b=s.nextInt();

        temp=a;
        a=b;
        b=temp;
        System.out.println("enter after swapping value of a and b are:"+a+"and "+b);

    }
}
