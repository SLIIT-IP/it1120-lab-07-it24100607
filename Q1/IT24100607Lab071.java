import java.util.Scanner;

public class IT24100607Lab071 {                

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter subject marks 1: ");
        int subject1 = input.nextInt();
        System.out.print("Enter subject marks 2: ");
        int subject2 = input.nextInt();
        System.out.print("Enter subject marks 3: ");
        int subject3 = input.nextInt();
        System.out.print("Enter subject marks 4: ");
        int subject4 = input.nextInt();
        
        double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
       
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        
        System.out.println("\nAverage is: " + average);
        System.out.println("Grade is: " + grade);
    }
}





	

	
	
	
	