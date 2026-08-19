// video link: https://www.youtube.com/watch?v=5Boqfjissv0&t=1930s;
import java.util.*;

/////// printing 5 to 1 numbers using recursion  //////////////
/* 
class first{
    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args){
        printnum(5);
    }
}
*/

//////////// sum of n natural numbers ////////////
/* 
class first{
    public static void  printnum(int n,int m){
        if(n==0){
            System.out.print(m);
            return;
        }
        m+=n;
        printnum(n-1,m);
    }
    public static void main(String[] args){
        printnum(5,0);
    }
}*/

//////////// factorial of the numbers (with void function) ///////////
/* 
class first{
    public static void fact(int n,int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        r*=n;
        fact(n-1,r);
    }
    public static void main(String[] args){
        fact(5,1);
    }
}
*/
//    (OR)  (with int return function) *********
/* 
class first{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1=fact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}*/

////////// fibonacci series using recursion ////////////
/* 
class first{
    public static void fun(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fun(b,c,n-1);
    }
    public static int fib(int n){
        int a=0;
        int b=1;
        int n=9;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fun(a,b,n-2);
    }
}
*/
//////// power of an number using recursion O(n) ////////////

/* 
class first {
    public static int fun(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int result=x*fun(x,n-1);
        return result;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.print(fun(x,n));
    }
}
*/
///////// power of a number using recursion (optimized O(log n))
class first {
    public static int fun(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return fun(x,n/2)*fun(x,n/2);
        }
        else{
            return fun(x,n/2)*fun(x,n/2)*x;
        }
    }

public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.print(fun(x, n));

}
}