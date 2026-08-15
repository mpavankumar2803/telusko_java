/* 
class first{
    public static void main(String[] args){
        int arr[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = (int)(Math.random()*10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
/////// if we had a 2d array and we want to print all the elements in the form of a matrix then we can do below /////
/* 
class first{
    
    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

       for(int n[] : arr){
        for(int m:n){
            System.out.print(m + " ");
        }
        System.out.println();
       } 
    }
}
*/

import java.util.*;
class Students{
    int rollno;
    String name;
    int marks;
}
public class first{   //this class should be public because the file name is first.java
    public static void main(String[] args){
        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 95;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "Bob";
        s3.marks = 85;

        Students s4 = new Students();
        s4.rollno = 4;
        s4.name = "Alice";
        s4.marks = 92;

        Students student[]=new Students[4];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;

        for(int i=0;i<student.length;i++){
            System.out.println(student[i].name+" : "+student[i].marks);
        }

    }
}