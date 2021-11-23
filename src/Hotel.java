public class Hotel {

    private String name;                //Instance Variables
    private int rate_Regular_Weekdays;
    private int weekEnd_Fare;
    private int rating;

    /*
     * Constructor for initializing instance variables
     * */
    public Hotel (String name,int rate_Regular_Weekdays,int weekEnd_Fare,int rating)
    {
        this.name =name;
        this.rate_Regular_Weekdays=rate_Regular_Weekdays;
        this.weekEnd_Fare=weekEnd_Fare;
        this.rating=rating;
    }
}
