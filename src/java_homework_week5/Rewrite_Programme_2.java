package java_homework_week5;

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *
 * Rewrite the student mark sheet programme (From java-homework-week3
 *
 * programmes) using if else and while loop.
 */
public class Rewrite_Programme_2
{
    public void re() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            System.out.print("Enter Math marks: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Enter Science marks: ");
            int scienceMarks = scanner.nextInt();

            System.out.print("Enter English marks: ");
            int englishMarks = scanner.nextInt();



            if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                continue;
            }

            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (double) totalMarks / 3;

            String result;
            if (percentage >= 35) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }

            // Print the mark sheet
            System.out.println("_______________________________");
            System.out.println("|                             |");
            System.out.println("|         Mark Sheet           |");
            System.out.println("|_____________________________|");
            System.out.println("| Name       : " + name);
            System.out.println("| Roll No    : " + rollNo);
            System.out.println("|_____________________________|");
            System.out.println("| Subjects   : Marks           |");
            System.out.println("|_____________________________|");
            System.out.println("| Math       : " + mathMarks);
            System.out.println("| Science    : " + scienceMarks);
            System.out.println("| English    : " + englishMarks);
            System.out.println("|_____________________________|");
            System.out.println("| Total      : " + totalMarks);
            System.out.println("|_____________________________|");
            System.out.println("| Percentage : " + percentage);
            System.out.println("| Result     : " + result);
            System.out.println("| Grade      : " + grade);
            System.out.println("|_____________________________|");

            // Ask the user if they want to do more calculations
            System.out.print("Would you like to enter another student's marks? (Y/N): ");
            scanner.nextLine(); // Consume the remaining newline character
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Program terminated.");
                break;
            }

        }

        scanner.close();
    }



    public static void main(String[] args)
    {
        Rewrite_Programme_2 q3 =new Rewrite_Programme_2();
        q3.re();
    }
}
