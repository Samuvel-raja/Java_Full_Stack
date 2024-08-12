import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5],sum=0;
        for(int i=0; i<5; i++)
         {
            a[i]=s.nextInt();
            sum+=a[i];
         }
         System.out.println(sum);
         s.close();
    }
}
