package org.example;

import java.util.Scanner;

//To print numbers between x & y
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num = ");
        int x = sc.nextInt();
        System.out.println("Enter first num = ");
        int y = sc.nextInt();

        rec(x,y);

    }
    public static void rec(int x , int y)
    {
        if(x>y)
        {
            return;
       }
        System.out.print(x + " ");
        rec(x+1,y);
    }
}
