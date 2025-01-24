import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        /* We can also declare Variables as:
        int num1,num2,sum=1; the name of variables can be anything instead of keywords name.
        keywords are the predefined word for the compiler of the program by the developers.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t Input....  ");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\t\t Output....  ");

        int sum = num1 + num2;
        System.out.println("The sum is: \n" +num1+ " + " +num2+ " = " +sum);
    }
}
