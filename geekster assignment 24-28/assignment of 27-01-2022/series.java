/*  program to find x terms of series 3N+2     */


import java.util.Scanner;

public class Main{
public static void main(String[] args){
    int result = 0;
    int i = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of terms: ");
    int x = sc.nextInt();
    while (x != 0) {
        result = 3 * i + 2;
        if (result % 4 != 0) {
            System.out.println(result);
            x--;

        }
        i++;
    }
}