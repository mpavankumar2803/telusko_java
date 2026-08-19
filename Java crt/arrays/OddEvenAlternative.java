public class OddEvenAlternative {
    public static void main(String[] arrgs){
        int[] arr = {2,4,6,8,10,3};
        int n=arr.length;
        int ev=0;
        int od=0;
        int[] even=new int[n];
        int[] odd=new int[n];
        
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[ev++]=arr[i];
            }else{
                odd[od++]=arr[i];
            }
        }
        
        int a=0,b=0,c=0;
        int[] result=new int[n];
        while(a<od && b<ev){
            result[c++]=odd[a++];
            result[c++]=even[b++];
        }

        while(a<od){
            result[c++]=odd[a++];
        }
        while(b<ev){
            result[c++]=even[b++];
        }


        // alternative approach is //////////////////
        
        // for(int i=0,j=0;i<od && j<e+0; i++,j++){
        //     result[c++]=odd[i];
        // }
        // for(int i=0,j=1;i<ev && j<e+0; i++,j++){
        //     result[c++]=even[j];
        // }
        
        
        if(od==n){
            System.out.print("only odd numbers");
        }else if(ev==n){
            System.out.print("only even numbers");
        }else{
            
            for(int num:result){
            System.out.print(num+" ");
        }
        }
        
    }
}
