/* program to find factorial    */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;int factorial=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        int i=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println("factorial is:"+factorial);
    }
}
