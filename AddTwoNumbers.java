import java.util.Scanner;// Import the Scanner class for input

public class AddTwoNumbers { // class
    public static void main(String[] args) { //main function

        /* We can also declare Variables as:
        int num1,num2,sum=1; the name of variables can be anything instead of keywords name.
        keywords are the predefined word for the compiler of the program by the developers.
         */
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        //taking input's
        System.out.println("\t\t Input....  ");

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //output section
        System.out.println("\t\t Output....  ");

        // Calculating the sum
        int sum = num1 + num2;
        // Display the result/printing the sum
        System.out.println("The sum is: \n" +num1+ " + " +num2+ " = " +sum);
    }
}
