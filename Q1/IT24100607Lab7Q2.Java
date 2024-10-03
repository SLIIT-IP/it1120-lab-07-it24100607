import java.util.Scanner;

public class IT24100607Lab7Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);


            System.out.print("Enter subject: ");
            double total = 0;

            for (int i = 1; i <= 4; i++) {
                double marks = input.nextDouble();
                total += marks;
            }

            double avg = total / 4;

            System.out.println("Average is: " + avg);

            System.out.print(0 <= avg && avg<= 49 ? "Overall Grade is : Fail" :
                             50 <= avg && avg <= 74 ? "Overall Grade is : Credit" :
                             75 <= avg && avg <= 100 ? "Overall Grade is : Distinction" : "Invalid marks entered");
            System.out.println("\n");
        }
    }
}