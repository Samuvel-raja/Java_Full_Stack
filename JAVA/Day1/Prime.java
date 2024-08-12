import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0;
        s.close();
        if(n==3 || n==2)
        {
            System.out.println("Prime");
            return;
        }
        for(int i=2;i<=n/2;i++)
        {
         if(n%i==0)
         {
            System.out.println("Not PRIME");
            return;
         }
         else
         {
           c=1;
         }
        }
        if(c==1)
         System.out.println("PRIME");
        else
        System.out.println("NOT PRIME");
       
      
    }
    
}
