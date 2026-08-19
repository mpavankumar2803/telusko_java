import java.util.*;
public class ArrayProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        int result1=1;

        for(int i=0;i<n;i++){
            result[i]=sc.nextInt();
        }

        for(int nums:result){
            result1*=nums;
        }

        System.out.println(result1);
    }
}