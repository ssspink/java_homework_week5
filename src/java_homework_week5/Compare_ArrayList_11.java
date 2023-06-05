package java_homework_week5;

import java.util.ArrayList;

/** Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");
 *
 *
 *
 */
public class Compare_ArrayList_11
{
    public static void com()
{
    ArrayList<String> c1 = new ArrayList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");

    ArrayList<String> c2 = new ArrayList<String>();
    c2.add("Red");
    c2.add("Green");
    c2.add("Black");
    c2.add("Pink");

    // Comparing the ArrayLists
    boolean isEqual = c1.equals(c2);

    // Printing the result
    System.out.println("Are the ArrayLists equal? " + isEqual);
}


    public static void main(String[] args) {
        com();
    }
}
