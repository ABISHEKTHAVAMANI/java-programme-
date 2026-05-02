import java.util.*;

class Mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        total o = new total();
        int r;

        do {
            System.out.println("Enter your Food Name: ");
            String expenses = sc.nextLine();

            System.out.println("Enter the rate of expenses: ");
            int rate_exp = sc.nextInt();
            sc.nextLine(); 

            o.rate(rate_exp);

            System.out.println("Press 0 to finish bill or any other number to continue:");
            r = sc.nextInt();
            sc.nextLine(); 

        } while (r != 0);

        o.finalBill();
    }
}

 
    
