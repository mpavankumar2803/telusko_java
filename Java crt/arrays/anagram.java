import java.util.*;
class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter s1= ");
        String s1=sc.nextLine();
        System.out.print("enter s1= ");
        String s2=sc.nextLine();
        
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");
        
        if(s1.length()==s2.length()){
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagram");
            }else{
                System.out.println("not a Anagram");
            }
        }else{
            System.out.println("not a anagram");
        }
    }
}