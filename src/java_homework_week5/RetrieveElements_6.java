package java_homework_week5;

import java.util.ArrayList;
import java.util.Scanner;

/**Write a Java program to retrieve an element (at a specified index) from a given
 array list
 *
 */
public class RetrieveElements_6 {
    public static void retrieve()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the index of the Elements: ");
        int index =scanner.nextInt();
        ArrayList<String> elements =new ArrayList();
        elements.add("Monday");
        elements.add("Tuesday");
        elements.add("Wednesday");
        elements.add("Thursday");
        elements.add("Friday");

        if(index>= 0 && index< elements.size()){
            String element =elements.get(index);
            System.out.println("The element at index " + index + " is " + element);


        }else {
            System.out.println("Invalid index");
        }

    }
    public static void main(String[] args) {
        retrieve();
    }
}