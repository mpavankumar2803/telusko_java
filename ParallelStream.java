import java.util.*;

// program to print the sum of the double of the elements in a list using the stream api
/* 
public class ParallelStream {
    public static void main(String[] args){

        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        int r1=nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(c,e) -> c+e);
        System.out.println(r1);

                //(OR)

        int r2=nums.stream()
                    .filter(n->n%2==0)
                    .map(i -> i*2)
                    .mapToInt(i->i)
                    .sum();
        System.out.print(r2);
    }
}
*/


/*  below program generates the random 10_000 numbers and inserts in to a list and y using the stream perform
the multiplication of nums of list X 2; and calculating which function does it first by also giving the 
sleep for(1) between normal stream and parallel stream.*/

public class ParallelStream {

    public static void main(String args[]){
        int size=10_000;
        List<Integer> nums=new ArrayList<>(size);

        Random ran=new Random();

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }

        long startSeq=System.currentTimeMillis();
        int sum2=nums.stream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    }catch(Exception e){  
                    }
                    return i*2;
                })
                .mapToInt(i->i)
                .sum();


        long endSeq=System.currentTimeMillis();

        long startPara=System.currentTimeMillis();
        int sum3=nums.parallelStream()
                    .map(i-> {
                        try{
                            Thread.sleep(1);
                        }catch(Exception e){
                        }
                        return i*2;
                    })
                    .mapToInt(i->i)
                    .sum();
        long endPara=System.currentTimeMillis();

        System.out.println(sum2+" "+sum3);
        System.out.println("seq :"+(endSeq-startSeq));
        System.out.println("para :"+(endPara-startPara));

    }
}