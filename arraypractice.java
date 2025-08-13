import java.util.*;
import java.util.Scanner;

public class arraypractice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int n=sc.nextInt();

        //bruteforce approach
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==n)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }


    }
}