/* types of sorting algorithms
bubble sort, selection sort, insertion sort, quick sort, merge sort, heap sort, counting sort, radix sort, bucket sort


In bubble sort consicutive elemets are compared and the less value will be sent to left 
and the higher value will sent to right. the inner-loop will only go until the j<n-j-i */
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" index array value: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){ // we used  n-j-1 because after each iteration the last element will be sorted and we don't need to check it again
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        // for(int l=0;l<n;l++){
        //     System.out.print(arr[l]+" ");
        for(int number: arr){
            System.out.print(number+" ");    // this is "for each loop"
        }
    }
}