
class calc {
    public static int add(int a,int b){
        return a+b;
    }
    public int prod(int a,int b){
        return a*b;
    }
}
    
public  class staticandNon {
    public static void main(String[] args){
        int sum=calc.add(5,2);
        calc obj1 =new calc();
        int mult=obj1.prod(5,2);

        System.out.println(sum);
        System.out.println(mult);
    }
    }


    // in the above program we call add without creating an object(calc) because it is not a static
    // we can call both static and non static objects with the object created(obj1);