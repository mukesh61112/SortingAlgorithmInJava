package com.company;

import java.util.Scanner;

public class Array_Sort_Selection {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        SelectionSort obj=new SelectionSort();
        obj.selectionSort(arr,n);



    }
}
class SelectionSort
{
    int selectionSort(int arr[],int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("i="+i+"     ");
            int mini=i;
            for(int j=i+1;j<(n);j++)
            {
               // System.out.print("j="+j+"     ");
                if(arr[j]<arr[mini])
                       mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
            System.out.println("\n\n");
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        return 0;
    }


}