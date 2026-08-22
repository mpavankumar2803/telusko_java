// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ArrayMerge {
    public static void main(String[] args) {
        // System.out.println("Start small. Ship something.");
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9};
        int[] result=new int[arr1.length+arr2.length];
        
        for(int i=0;i<result.length;i++){
            if(i<arr1.length){
                result[i]=arr1[i];
            }else{
                result[i]=arr2[i-arr1.length];
            }
        }


        for(int x:result){
            System.out.print(x+" ");
        }
    }
}