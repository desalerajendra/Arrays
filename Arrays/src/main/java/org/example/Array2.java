package org.example;

import java.util.*;
import java.lang.*;
public class Array2 {

        public static void reverseArray(int arr[])
        {
            int temp = 0;
            int l = arr.length;
            for(int i=0;i < l/2 ; i++)
            {
                temp = arr[i];
                arr[i] = arr[l-1-i];
                arr[l-1-i] = temp;
            }
            //Write code here
        }

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            System.out.println("Hi");
            int arr1[] = new int[n];
            for(int i=0;i<n;i++)
                arr1[i] = sc.nextInt();

            reverseArray(arr1);

            for (int i = 0; i < n; i++)
                System.out.print(arr1[i] + " ");
            System.out.println('\n');
        }
    }


