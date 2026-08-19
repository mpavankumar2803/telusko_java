

import java.util.*;

public class SecondMaxofArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // sorting of array using the function : Arrays.sort(arr);
        int smax=0,f=0;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                smax=arr[i];
                f=1;
                break;
            }
        }
        if(f==1){
            System.out.println("second max is: "+smax);
        }else{
            System.out.println("second max not found");
        }
}
}


