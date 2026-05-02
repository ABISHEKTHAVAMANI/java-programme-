import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        if (input.length() < 5) {
            System.out.println("Short");
        } else {
            System.out.println("Long");
        }
        
        sc.close();
    }
}