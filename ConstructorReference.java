import java.util.*;
class Student{
    private String name;
    private int age;

    
    public Student() {
    }

    public Student(String name){

        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [String=" + name + ", age=" + age + "]";
    }
    
    
}
public class ConstructorReference {
    public static void main(String[] args){
        List<String> names=Arrays.asList("navin","pavan","john");

        List<Student> students=new ArrayList<>();

        /* 
        for(String name:names){
            Students.add(new Student(name));
        }*/

        /* 
        Students=names.stream()
                .map(name->Students(name))
                .toList();
        */

        students=names.stream()
                .map(Student::new)
                .toList();

        System.out.println(students);
    }
}
