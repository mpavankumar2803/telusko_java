// public class exception {
//     public static void main(String[] args) {
        
//         int i=0;
//         int j=0;

//         try {
//             j=18/i;
//         }
//         catch(Exception e) {
//             System.out.println();
//             System.out.println("Exception caught: "+e);
//             System.out.println();

//         }
//     }
// }

// Throw - key word exception  /////// 
// public class exception {
//     public static void main(String[] args) {
        
//         int i=20;
//         int j=0;

//         try {
//             j=18/i;
//             if(j==0){
//                 throw new ArithmeticException("Division by zero is not allowed.");
//             }
//         }
//         catch(Exception e) {
//             System.out.println();
//             System.out.println("Exception caught: "+e);
//             System.out.println();

//         }
//     }
// }


//////////// Custon Exception and super() keyword exectuion  ////////////
/* 
class PavanException extends Exception{
    public PavanException(String message) {
        super(message);
    }
}
public class exception {
    public static void main(String[] args) {
        
        int i=20;
        int j=0;

        try {
            j=18/i;
            if(j==0){
                throw new PavanException("own exception");
            }
        }
        catch(PavanException e) {
            System.out.println("default exception"+e);

        }
    }
}
*/

///////// in put and printing the char as output using an io funtion ////////////
// import java.io.*;
// class Main {
//     public static void main(String[] args) throws IOException {
//         System.out.print("enter a number:");
//         int n=System.in.read();
//         System.out.println(n);
//     }
// }

////////// buffered reader and input stream reader ////////////
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String input = br.readLine();
        int n = Integer.parseInt(input);
        System.out.println("You entered: " + n);
    }
}