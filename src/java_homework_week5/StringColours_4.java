package java_homework_week5;

import java.util.ArrayList;

/**Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.*
 *
 */
public class StringColours_4
{
    public static void colour()
    {
        ArrayList<String> color = new ArrayList();////Creating arraylist
        color.add("Green"); ////Adding object in arraylist
        color.add("Yellow");
        color.add("Black");
        color.add("Red");

        for(String colors: color);
        System.out.println(color);
    }

    public static void main(String[] args)
    {
        colour();
    }
}
