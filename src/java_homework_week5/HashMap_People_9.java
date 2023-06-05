package java_homework_week5;

import java.util.HashMap;
import java.util.Map;

/**Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map.
 *
 *  */
public class HashMap_People_9
{

    public static void hashp()
    {
        //create a HashMap object to call people
        Map<String, Integer> people =new HashMap();

        //Add some key-value pairs to the map
        people.put("Pinkal",28);
        people.put("Sanvi", 14);
        people.put("Shail", 12);
        //using for each loop iterate the value

        for(Integer value : people.values()){
            System.out.println(value);
        }
    }


    public static void main(String[] args)
    {
        hashp();
    }
}
