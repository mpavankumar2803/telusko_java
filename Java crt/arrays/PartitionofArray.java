// partion of arry by tacking an pivet element and dividing the array by sending the less value to left and sending high value to right.
import java.io.*;
import java.util.*;

public class PartitionofArray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int ind=in.nextInt();
        int p=a[ind];
        int left=0,right=n-1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(ind==i){
                continue;
            }
            if(a[i]<p){
                res[left++]=a[i];
            }
            else{
                res[right--]=a[i];
            }
        }
        res[left]=p;
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}