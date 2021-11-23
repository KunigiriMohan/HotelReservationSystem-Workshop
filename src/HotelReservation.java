import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {
    public static Map<String,Hotel> hotels= new LinkedHashMap<>();              //Creating maps of hotel to store hotel name and hotel object
    public static Map<Integer,String>regularRates=new LinkedHashMap<>();
    public static Map<Integer,String>regularWeekendRates=new LinkedHashMap<>();         //Creating regularRates to store hotel rates along with hotel name
    public static Map<Integer,String >list=new LinkedHashMap<>();                   //Creating list map to store rates of different hotels and its names.


    public int add(String hotel_name,int rate_Regular_Weekdays,int weekEnd_Fare)                 //add() method to add hotel details to various maps
    {
        hotels.put(hotel_name,new Hotel(hotel_name,rate_Regular_Weekdays,weekEnd_Fare));
        regularRates.put(rate_Regular_Weekdays,hotel_name);
        regularWeekendRates.put(weekEnd_Fare,hotel_name);


        return hotels.size();

    }
    public Object rate_of_Hotels(String start_Date)
    {                                                                                      //verifies date according to day and return minimum fare
        LocalDate currentDate1 = LocalDate.parse(start_Date);

        if (currentDate1.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate1.getDayOfWeek() != DayOfWeek.SUNDAY)
        {
            list = regularRates.entrySet().stream().collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        }
        else
        {
            list = regularWeekendRates.entrySet().stream().collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        }

        return list.get(Collections.min(list.keySet()));
    }
}
