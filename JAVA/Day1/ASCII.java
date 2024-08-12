import java.util.*;
public class ASCII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        for(int i=0;i<st.length();i++)
        {
            System.out.print((int)(st.charAt(i))+" ");
        }
        s.close();
    }
}
