
class details {
    int rollno;
    String name;
    int marks;

    public void display() {
        System.out.println("My rollno:" + rollno);
        System.out.println("My Name:" + name);
        System.out.println("My marks:" + marks);
    }
}

class oops {
    public static void main(String[] args) {
        details obj1 = new details();
        obj1.rollno = 10;
        obj1.name = "ram";
        obj1.marks = 70;

        obj1.display();
    }
}