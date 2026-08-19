import java.util.Scanner;

public class AlternatArrayElement {
        public static void main(String[] args) {
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
        
        int a=0,b=0,c=0;
        
        while(a<n && b<m){
            arr3[c++]=arr1[a++];
            arr3[c++]=arr2[b++];
        }

        while(a<n){
            arr3[c++]=arr1[a++];
        }
        while(b<m){
            arr3[c++]=arr2[b++];
        }


        for(int num:arr3){
            System.out.print(num+" ");
        }   
    }
}
