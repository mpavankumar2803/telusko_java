import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr={3,5,4,1,2,6};  // 2,1,4,3,6,5
        Arrays.sort(arr);
        int n=arr.length;
        
        for(int i=0;i<n;i+=2){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
