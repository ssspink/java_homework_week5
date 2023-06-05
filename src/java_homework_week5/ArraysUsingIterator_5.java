package java_homework_week5;
/**Write a Java program to iterate through all elements in an array list using
 Iterater. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysUsingIterator_5
{
    public void m()
    {
              // Create a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
                             // Print the list

        Iterator<String> iterator = list_Strings.iterator();
        while(iterator.hasNext() ) {
            String element =iterator.next();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArraysUsingIterator_5 a1 =new ArraysUsingIterator_5();
        a1.m();
    }
    }

