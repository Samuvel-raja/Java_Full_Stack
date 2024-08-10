import java.util.*;


public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),f=1;
        for(int i=1;i<=n;i++)
         f=f*i;
         System.out.println("Factorial : "+f);
         s.close();
    }
}
