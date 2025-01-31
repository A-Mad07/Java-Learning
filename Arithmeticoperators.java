
import java.util.Scanner;

public class Arithmeticoperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a= sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.println();
        System.out.println("Applying all operation +,-,*,/,%\n");
        System.out.println("Sum of ("+a+"+"+b+") = "+(a+b));
        System.out.println("Difference of ("+a+"-"+b+") = "+(a-b));
        System.out.println("Product of ("+a+"*"+b+") = "+(a*b));
        System.out.println("Division of ("+a+"/"+b+") = "+(a/b));
        System.out.println("Modulus or Reminder of ("+a+"%"+b+") = "+(a%b));
    }
}
