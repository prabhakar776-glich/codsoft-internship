import java.util.*;

public class gradecalculator {
    public static void main(String[] args) {
        char grade;
        Boolean choice = true;
        float chem, phy, maths, eng, comp, avg, total;
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        while (choice) {
            System.out.println("!!! Welcome To Grade Calculator !!!");
            System.out.println("Enter the marks out of 100 :- ");
            // Input marks from the user
            System.out.print("Mathematics:-    ");
            chem = sc.nextFloat();
            System.out.print("Computer:-      ");
            phy = sc.nextFloat();
            System.out.print("Chemistry:-  ");
            maths = sc.nextFloat();
            System.out.print("English:-      ");
            eng = sc.nextFloat();
            System.out.print("Physics:-     ");
            comp = sc.nextFloat();
            total = chem + phy + maths + eng + comp;
            avg = total / 5;
            // Use of conditional statements
            if (avg <= 30) {
                grade = 'E';
            } else if (avg > 30 && avg < 60) {
                grade = 'D';
            } else if (avg >= 60 && avg < 80) {
                grade = 'C';
            } else if (avg >= 80 && avg < 90) {
                grade = 'B';
            } else {
                grade = 'A';
            }
            // Printing the output
            System.out.println("Total Marks:- " + total + "/500");
            System.out.println("Average Percentage:- " + avg + " %");
            System.out.println("Grade:- " + grade);
            System.out.println("Enter true to calculate again and false to exit! ");
            choice = sc.nextBoolean();
        }
    }
}