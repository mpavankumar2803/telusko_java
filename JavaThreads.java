//////////////////////  Extending thread class  ////////////////////////
/* 
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class JavaThreads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

        obj2.setPriority(Thread.MAX_PRIORITY);
    }
    
}*/

///////////////////////  Implementing Runnable interface  ////////////////////////
/*
class A implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class JavaThreads {
    public static void main(String[] args){
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
    }
 */

//////// thread using the lambda expression and annonymous inner class

public class JavaThreads {
    public static void main(String[] args){
        Runnable obj1=() -> {
        for(int i=0;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };


        Runnable obj2=() ->{
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(2); 
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        // Thread.sleep(2);
        t2.start();
    }
}