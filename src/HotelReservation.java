import java.util.LinkedHashMap;
import java.util.Map;

public class HotelReservation {
    public static Map<String,Hotel> hotels= new LinkedHashMap<>();                  //Creating map for storing hotel details

    public int add(String hotel_Name, int rate_Regular_Weekdays, int rate_Weekends)
    {
        System.out.println("Welcome to Hotel Reservation System.");
        Hotel obj= new Hotel(hotel_Name,rate_Regular_Weekdays,rate_Weekends);           //Creating objects of hotel class by sending values
        hotels.put(hotel_Name,obj);

        return hotels.size();
    }
}