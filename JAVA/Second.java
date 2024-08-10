import java.util.*;
public class Second {
    public static void main(String[] args) {
        int empId;
        String empName;
        float empSalary;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id");
        empId=s.nextInt();
        System.out.println("Enter name");
        empName=s.next();
        System.out.println("Enter salary");
        empSalary=s.nextFloat();
System.out.println(empId+" "+empName+" "+empSalary);
s.close();
    }
}
