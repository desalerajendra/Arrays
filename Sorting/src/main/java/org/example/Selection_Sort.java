package org.example;

import java.util.Scanner;

public class Selection_Sort {
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
        for(int i = 0 ; i < L-1;i++)
        {
            int smallest = i;
            for(int j = i+1;j<L;j++)
            {
                if(arr[j] < arr[smallest])
                {
                smallest = j;
                   // System.out.println(j+" " +arr[j]);
                }
            }
            int temp = arr[smallest];

            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int e: arr)
        {
            System.out.print(e + " ");
        }
    }
}
