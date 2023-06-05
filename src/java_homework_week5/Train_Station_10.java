package java_homework_week5;
/**Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.
 *
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Train_Station_10
{
    public static void main(String[] args)
    {
        Map<String,String> stationLine =new HashMap();
        stationLine.put("King's Cross St Pancras", "Piccadilly, Victoria, Northern, Hammersmith & City, Circle, Metropolitan");
        stationLine.put("Waterloo", "Bakerloo, Northern, Jubilee, Waterloo & City");
        stationLine.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationLine.put("Victoria", "Victoria, District, Circle");
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter the Station Name in Zone 1: ");
        String station =scanner.nextLine();

        //check if the station exists in the map

        if (stationLine.containsKey(station)) {
            String lines = stationLine.get(station);
            System.out.println("The following lines pass through " + station + ": " + lines);
        } else {
            System.out.println("The station \"" + station + "\" is not found in Zone 1.");
        }
        scanner.close();

    }
}









