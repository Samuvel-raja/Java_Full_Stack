import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0,sum=0,tmp=0;
        s.close();
        c=(int)(Math.log10(n)+1);
        tmp=n;
        while(n>0)
        {
             int r=n%10;
             sum+=Math.pow(r,c);
             n=n/10;
        }
        if(sum==tmp)
         System.out.println("Armstrong");
        else
        System.out.println("Not a Armstrong");
    }
}
