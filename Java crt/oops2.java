public class oops2 {
    class details{
        int rollno;
        String name;
        int marks;
        static String colleges="St peters eng college";  // when static keyword is used it belong to class and it doesnt add memory to objects.
        public void display() {
        System.out.println("My rollno:" + rollno);
        System.out.println("My Name:" + name);
        System.out.println("My marks:" + marks);
        System.out.println("My colleges:" + colleges);
    }
        }
    public static void main(String[] args) {
        details obj1 = new details();
        details obj2 = new details();
        obj1.rollno = 10;
        obj1.name = "ram";
        obj1.marks = 70;
        obj1.display();
        
    }
}
