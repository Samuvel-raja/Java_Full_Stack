import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        if (n == 0)
            System.out.print(n+" ");
        else {
            int a = 0, b = 1, c = 0;
            System.out.print(a+" ");
            for (int i = 2; i <= n; i++)
             {
                c = a + b;
                a = b;
                System.out.print(b+" ");
                b = c;
            }
        }
        
    }
}