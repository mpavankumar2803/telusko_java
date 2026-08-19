import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }


        // print duplicat array elements 

        // for(int j=0;j<n;j++){
        //     for(int k=j+1;k<n;k++){
        //         if(arr[j]==arr[k]){
        //             System.out.print(arr[j]);
        //         }
        //     }
        // }





        // merging of two unsorted arrays

        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        int m=sc.nextInt();
        int[] arr2=new int[m];
        
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        
        int[] arr3=new int[n+m];

        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        for(int j=0;j<m;j++){
            arr3[n+j]=arr2[j];
        }


        for(int num:arr3){
            System.out.print(num+" ");
        }

    }
}
