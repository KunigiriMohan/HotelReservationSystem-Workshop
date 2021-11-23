public class Hotel {
    private String hotel;                   //Instance variables
    private int rate_Regular_Weekdays;
    private int rate_Weekends;

    public Hotel (String hotel,int rate_Regular_Weekdays,int rate_Weekends)                 //Constructer to intialise instance variables
    {
        this.hotel =hotel;
        this.rate_Regular_Weekdays=rate_Regular_Weekdays;
        this.rate_Weekends=rate_Weekends;
    }
}