package calculate;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        char choice ='Y';
        while (choice =='Y'){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the First Number: ");
        int a= scanner.nextInt();

        System.out.println("Enter the Second Number: ");
        int b =scanner.nextInt();

        System.out.println("Enter the symbol: + , - , * , / ");
        char symbol = scanner.next().charAt(0);
        Calculator c1 =new Calculator();
        c1.calculateResult(a,b,symbol);

         System.out.print("Would you like to do more calculations? Please enter 'Y' or 'N': ");
         choice = scanner.next().charAt(0);


    }
}





    }