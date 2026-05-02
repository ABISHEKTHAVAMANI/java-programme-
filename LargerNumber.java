import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is the larger number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the larger number");
        } else {
            System.out.println("Equal");
        }

        scanner.close();
    }
} 
    

