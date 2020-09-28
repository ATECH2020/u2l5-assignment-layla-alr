import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double startLat, startLong;
       double endLat, endLong;

      //Get user info
      System.out.print("Enter the latitude of the starting location: ");
      startLat= in.nextDouble();
      System.out.print("\n Enter the longitude of the starting location: ");
      startLong= in.nextDouble();
      System.out.print("\nEnter the latitude of the ending location: ");
      endLat= in.nextDouble();
      System.out.print("\nEnter the longitude of the ending location: ");
      endLong= in.nextDouble();
    //use GeoLocation class to calculate distance48.8567
      GeoLocation location1 = new GeoLocation( startLat, startLong);
      GeoLocation location2 = new GeoLocation (endLat, endLong);
      System.out.print("The distance is "+location1.distanceFrom (location2)+ " miles.");
    
    }
}