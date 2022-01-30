/* program to print 2,4,6,8,10 */


package com.company;
import java.util.Scanner;
public class Main {
/* by using for loop*/
    public static void main(String[] args) {
        System.out.println("numbers are:");
        int i;
        for(i=1;i<=10;i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }

}



package com.company;
import java.util.Scanner;
public class Main {
/* by using while loop */
    public static void main(String[] args) {
        System.out.println("numbers are:");
        int i=1;
            while(i<=10){
                i++;
                if(i%2==0){
                    System.out.println(i);
                }
            }
    }

}

