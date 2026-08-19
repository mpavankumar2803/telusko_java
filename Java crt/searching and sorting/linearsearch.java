//lenear search program
import java.io.*;
import java.util.*;

public class linearsearch{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int t=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" index array value: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("array target value: ");
        int x=sc.nextInt();
        for(int j=0;j<n;j++){
            if(arr[j]==x){
                t=j;
                break;
            }
        }
        System.out.print(t);
    }
}