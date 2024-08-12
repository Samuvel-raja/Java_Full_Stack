import java.util.Scanner;

public class CompareTwoObjects {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        s.close();
        if(s1.equals(s2))
         System.out.println("Two Objects Equal");
        else
        System.out.println("Two Objects are not equal");
    }
}
