public class reverseHalfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int count=0;
        int mid =(n / 2);

        if(n>2){
            mid = (n - 1) / 2;
        }else{
            mid = (n) / 2;
        }
        int[] result = new int[n];

        for(int i=mid;i>=0;i--){
            result[count++]=arr[i];
        }
        for(int j=n-1;j>=mid+1;j--){
            result[count++]=arr[j];
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}

//////////// antoher solution approach is given below

// import java.util.*;
// public class Solution {
//     public static void reverse(int[] arr, int start, int end){
//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int mid = (n - 1) / 2;
//         reverse(arr, 0, mid);
//         reverse(arr, mid + 1, n - 1);

//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }

