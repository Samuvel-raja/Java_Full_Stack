import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        StringBuffer sb=new StringBuffer(st);
        sb=sb.reverse();
        if(st.equals(String.valueOf(sb)))
         System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");
        s.close();
    }
}
