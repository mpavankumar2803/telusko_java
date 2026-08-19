import java.util.*;
class bsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array count:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" "+"index value: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("enter x value to find: ");
        int x=sc.nextInt();
        int r=-1;
        int l=0;
        int u=arr.length-1;
        while(l<=u){
            int m=(l+u)/2;
            if(arr[m]==x){
                r=m;
                u=m-1;  // written instead of break so that it will find the element which is in the least index.(First occurrence of the element)
            }else{
                if(x<arr[m]){
                    u=m-1;
                }else{
                    l=m+1;
                }
            }
        }
        if(r>=0){
            System.out.print("element found at index: "+r);
        }else{
            System.out.print("element not found");
        }
    }
}






//////////////// Binary Search Algorithm  with recursion in Java ///////////////////////
/*
class Main {
    public static int bs(int[] arr,int l,int u,int x){
        if(l>u){
            return -1;
        }
            int mid=(l+u)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                return bs(arr,l,mid-1,x);
            }else{
                return bs(arr,mid+1,u,x);
            }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int x=8;    
        
        int result=bs(arr,0,arr.length-1,x);
        if(result==-1){
            System.out.print("element not found");
        }else{
            System.out.println("elements found at index:"+result);
        }
    }
}
 */