import java.util.LinkedHashMap;
import java.util.Map;

public class HotelReservation {
    public static Map<String,Hotel> hotels= new LinkedHashMap<>();                  //Creating map for storing hotel details
/*
* add() method to add object elements to map
* */
    public int add(String hotel_Name, int rate_Regular_Weekdays, int rate_Weekends, int reward_Customer_Weekday_rates, int reward_Customer_Weekend_rates)
    {
        Hotel obj= new Hotel(hotel_Name,rate_Regular_Weekdays,rate_Weekends,reward_Customer_Weekday_rates,reward_Customer_Weekend_rates);
        hotels.put(hotel_Name,obj);
        return hotels.size();           //returning size of hashmap
    }
}