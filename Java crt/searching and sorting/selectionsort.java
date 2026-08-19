// selection sort program by taking the count of array and the array element from the user and returning the sorted array.
/* selection sort algorith it swaps the i element with the samllest elemetent in the array and then it moves to the next element 
and repeat the process untill the array is sorted.*/
import java.io.*;
import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int min=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" index array value: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(int j=0;j<n-1;j++){
            min=j;
            for(int k=j+1;k<n;k++){
                if(arr[min]>arr[k]){
                    min=k;
                }
            }
            int temp=arr[min];
            arr[min]=arr[j];
            arr[j]=temp;
        }
        for(int number: arr){
            System.out.print(number+" ");
        }
    }
}