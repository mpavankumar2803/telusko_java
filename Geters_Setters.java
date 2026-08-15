import java.util.*;
class human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class Geters_Setters {
    public static void main(String[] args) {
        human obj=new human();
        obj.setAge(55);
        obj.setName("John");

        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}