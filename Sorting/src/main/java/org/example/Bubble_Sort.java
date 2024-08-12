package org.example;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("Enter Length of Array = ");
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        System.out.println("Enter Array Elements = ");
        int arr[] = new int[L];

        for(int i=0;i<L;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i < L-1; i++)
        {
            for(int j = 0 ; j < L-1-i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e : arr)
        {
            System.out.println(e);
        }
    /*    for(int i=0;i<L;i++)
        {
            System.out.println(arr[i]);
        }*/
    }
}
