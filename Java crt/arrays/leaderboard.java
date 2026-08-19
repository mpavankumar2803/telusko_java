import java.util.*;

public class leaderboard{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print(i+" index array value:");
            arr[i] = sc.nextInt();
        }
        int small=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>small){
                System.out.print(arr[i]+" ");
                small=arr[i];
            }
        }
    }
}