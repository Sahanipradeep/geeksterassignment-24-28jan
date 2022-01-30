/* program to find distance between two points    */


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of x1:");
        x1=s.nextInt();
        System.out.println("enter the value of x2:");
        x2=s.nextInt();
        System.out.println("enter the value of y1:");
        y1=s.nextInt();
        System.out.println("enter the value of y2:");
        y2=s.nextInt();
        double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between two points is:"+distance);
    }
}
