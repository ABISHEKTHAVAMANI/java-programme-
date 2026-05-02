 
import java.util.Scanner;

public class newtask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your MOBILE NUMBER: ");
        long mobileNumber = sc.nextLong();

        System.out.print("ENTER YOUR EMAIL ID : ");
        String email = sc.nextLine();

        System.out.println("Your age is: " + age);
        System.out.println("Your name is: " + name);
        System.out.println("Your mobile number is: " + mobileNumber);
        System.out.println("Your email ID is: " + email);

        sc.close();
    }
}