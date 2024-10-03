import java.util.Scanner;
public class IT24100607Lab7Q3 {
    public static void main(String[] args) {

        final double discountRate = 0.05;
        final int maxCustomers = 5;

        Scanner input = new Scanner(System.in);

        for (int customers = 1; customers <= maxCustomers; customers++) {

            System.out.println("Customer " + customers);
            System.out.print("Enter total bill amount: ");
            double amount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().toUpperCase().charAt(0);

            if (mode == 'C') {
                double discount = amount * discountRate;
                System.out.println("Discount is: " + discount);

                double total = amount - discount;
                System.out.println("Amount to be paid: " + total);
            }
            else if (mode == 'O') {

                System.out.println("No discount applicable");

                System.out.println("Amount to be paid: " + amount);
            }
            else {

                System.out.println("Payment Mode is Not Valid");
                System.out.println("");

                continue;
            }
            System.out.println();
        }
    }
}