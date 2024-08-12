import java.util.Scanner;
 class Add
{
    void add(int a,int b)
    {
        System.out.println("add "+(a+b));
    }
}
public class Object {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        Add a=new Add();
        a.add(n1,n2);
        s.close();
    }

}
