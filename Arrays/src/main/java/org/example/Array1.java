package org.example;

import java.util.*;
import java.lang.*;
//max element
public class Array1 {
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Array Length = ");
    int l = s.nextInt();
    int arr[]= new int[l];
    for(int i = 0;i <= l-1;i++)
    {
        System.out.print("Enter " + i + " st element = ");

        arr[i]=s.nextInt();
    }
    int max = arr[0];
    for(int j = 0 ; j < l ; j++)
    {
        if(arr[j] > max)
        {
            max = arr[j];
        }
    }
System.out.println("Max element is = " +max);
}}
