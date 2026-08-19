import java.util.*;
public class lastTwoindex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-2;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
