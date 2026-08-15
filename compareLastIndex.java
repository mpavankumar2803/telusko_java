import java.util.*;

//////// sort the numbers according to the last digits /////////
/* 
public class compareLastIndex {
    public static void main(String[] args){

        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10 >j%10){
                    return 1;
                }else{
                    return -1;
                }
            };
        };

        List<Integer> nums=new ArrayList<>();
        nums.add(43);
        nums.add(46);
        nums.add(41);
        nums.add(46);
        nums.add(49);
        nums.add(40);

        Collections.sort(nums,com);
        System.out.print(nums);

    }
}*/


////////////// sorting the students according to the age using comparator //////////////////
/* 
class Student implements Comparable<Student>{
        int age;
        String name;

        public Student(int age,String name){
            this.age=age;
            this.name=name;
        }

        public String toString(){
            return "Student [age : "+age+", name = "+name+"]";
        }

        public int compareTo(Student that){
            if(this.age>that.age){
                    return 1;
                }else{
                    return -1;
                }  
        }
    }
public class compareLastIndex {
    public static void main(String[] args){

        Comparator<Student> com=new Comparator<Student>() {
            public int compare(Student i,Student j){
                if(i.age>j.age){
                    return 1;
                }else{
                    return -1;
                }
            };
        };

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(40,"pavan"));
        studs.add(new Student(46,"praveen"));
        studs.add(new Student(41,"Ravan"));
        studs.add(new Student(46,"jeevan"));
        studs.add(new Student(49,"raghu"));
        studs.add(new Student(49,"kumar"));

        Collections.sort(studs,com);
        for(Student std:studs){
            System.out.println(std);
        }
    }
}
*/

/////////////////////////////////(OR)//////////////////////////
/* 
class Student{
        int age;
        String name;

        public Student(int age,String name){
            this.age=age;
            this.name=name;
        }

        public String toString(){
            return "Student [age : "+age+", name = "+name+"]";
        }
    }
public class compareLastIndex {
    public static void main(String[] args){

        Comparator<Student> com=(i,j) -> i.age>j.age?1:-1;

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(40,"pavan"));
        studs.add(new Student(46,"praveen"));
        studs.add(new Student(41,"Ravan"));
        studs.add(new Student(46,"jeevan"));
        studs.add(new Student(49,"raghu"));
        studs.add(new Student(49,"kumar"));

        Collections.sort(studs,com);
        for(Student std:studs){
            System.out.println(std);
        }
    }
}
*/

/* 
O/P:-
Student [age : 40, name = pavan]
Student [age : 41, name = Ravan]
Student [age : 46, name = jeevan]
Student [age : 46, name = praveen]
Student [age : 49, name = kumar]
Student [age : 49, name = raghu]
*/
