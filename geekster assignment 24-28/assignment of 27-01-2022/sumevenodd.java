/* program to find sumof even and odd digitof a number  */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,sum_of_even=0,sum_of_odd=0,digit;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
       while(n>0){
           digit=n%10;
           if(digit%2==0)
               sum_of_even=sum_of_even+digit;

           else
               sum_of_odd=sum_of_odd+digit;

           n=n/10;
       }
        System.out.println(sum_of_even);
        System.out.println(sum_of_odd);

    }
}
