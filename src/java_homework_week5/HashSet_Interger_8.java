package java_homework_week5;

import java.util.HashSet;

/**Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else)
 *
 */
public class HashSet_Interger_8
{

    public static void hash()
    {
        HashSet<Integer> numberSet =new HashSet();
        //adding number 4,7,and 8 to the set

        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
       // checking number between 1 and 10
        for (int i = 1; i <= 10; i++){
             if(numberSet.contains(i)){
                 System.out.println(i + " is the set");
             }else {
                 System.out.println(i+ " is not in the set");
             }
    }
    }
    public static void main(String[] args)
    {
        hash();
    }

}
