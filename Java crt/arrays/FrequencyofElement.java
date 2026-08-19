import java.util.*;
public class FrequencyofElement {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int visited[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                int c=1;
                for(int j=i+1;j<n;j++){
                    if((a[i]==a[j])){
                        c++;
                        visited[j]=1;
                    }
                }
                System.out.print(a[i]+" "+c+" ");
                visited[i]=1;
            }
        }
    }
}