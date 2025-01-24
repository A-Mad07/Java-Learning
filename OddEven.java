import java.util.Scanner;// Import the Scanner class for input

public class OddEven { //class declaration
    public static void main(String[] args) { //main function

        // Create a Scanner object
        Scanner sc= new Scanner(System.in);

        //taking Input's
        System.out.print("Enter the number to check even or odd:");
        int a= sc.nextInt();

        //find odd and even using Arithmetic Operator
        if(a%2==0)
            //will execute when the number is completely divisible by 2 i.e reminder 0.
            System.out.println("The given number (" + a + ") is EVEN");

        else
            //will execute when the number is not completely divisible by 2 i.e reminder is anything instead 0.
            System.out.println("The given number (" +a+ ") is ODD");


        //find odd and even using Bitwise Operator
        if((a & 1 )!= 1)
            System.out.println("The given number (" + a + ") is EVEN");

        else
            System.out.println("The given number (" +a+ ") is ODD");

    }
}
