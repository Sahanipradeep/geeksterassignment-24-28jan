/* program to find power of a number  */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int base,pow,i,result=1;
	Scanner s=new Scanner(System.in);
    System.out.println("enter the base:");
    base=s.nextInt();
        System.out.println("enter the power:");
    pow=s.nextInt();
 for(i=1;i<=pow;i++) {
     result = result * base;
       }
        System.out.println("number is:"+result);
    }
}
