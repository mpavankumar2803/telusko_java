import java.util.Scanner;

public class positiveNumberofArray {
    public static void main(String[] args) {

        int[] arr = {2,3,4};

        int n=arr.length;

        // for(int i=0;i<n;i++){
        //     if(arr[i]>0){
        //         System.out.println(arr[i]);
        //     }
                
        // }

        // for(int num : arr){
        //     if(num%2==0){
        //         System.out.println(num);
        //     }
        // }





        // int even=0;
        // int odd=0;

        // for(int num : arr){
        //     if(num%2==0){
        //         even++;
        //     }else{
        //         odd++;
        //     }
        // }
        // System.out.println(even);
        // System.out.println(odd);



        // int a=arr[0];
        // for(int nums:arr){
        //     if(a>nums){
        //         a=nums;
        //     }
        // }
        // System.out.println(a);



        // for(int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }



        // int sum=0;
        // for(int num:arr){
        //     sum+=num;
        // }
        // double avg=(double)sum/n;    //// used to convert int to double and stord in double variable avg
        // System.out.println(avg);



        // int[] newArr=new int[n];
        // for(int i=0;i<n;i++){
        //     int res=arr[i]*arr[i];
        //     newArr[i]=res;
        // }
        // for(int num:newArr){
        //     System.out.print(num+" ");  
        // }



        // Scanner sc=new Scanner(System.in);  //////////////////////////////////////////////////
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // int[] newarr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        //     newarr[i]=arr[i]*arr[i];
        // }

        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }

        int difference=max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(difference);



        
}
}
