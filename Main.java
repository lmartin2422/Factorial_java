import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write a program to determine the factorial of a number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: \n");
        int number = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial = factorial * i;
            System.out.println(factorial);

        }
    }
}