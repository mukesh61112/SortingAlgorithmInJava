package com.company;

import java.util.Scanner;

public class Array_Sort_bubble {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr,n);



    }
}
class BubbleSort
{
    int bubbleSort(int arr[],int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("i="+i+"     ");

            for(int j=0;j<(n-1);j++)
            {
                System.out.print("j="+j+"     ");

                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                for(int k=0;k<n;k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
                System.out.print("        ");

            }
            System.out.println("\n\n");
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        return 0;
    }


}
