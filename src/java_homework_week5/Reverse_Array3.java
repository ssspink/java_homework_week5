package java_homework_week5;

public class Reverse_Array3
{

   public static void reversearrays() {
       int[] arr = new int[]{1, 5, 6, 7, 9};
       System.out.println(" Original arrays:  ");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

       System.out.println();
       System.out.println("Array in reverse oder: ");
       //loop through the array in reverse order
       for(int i =arr.length-1; i>=0;i--){
           System.out.println(arr[i] + " ");
       }

   }
    public static void main(String[] args) {
        reversearrays();
    }
}
