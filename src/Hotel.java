public class Hotel {
    private String hotel;                   //Instance variables
    private int rate_Regular_Weekdays;
    private int rate_Weekends;
    private int reward_Customer_Weekday_rates;
    private int reward_Customer_Weekend_rates;
/*
* creating constructor to initialize variables
* */
    public Hotel (String hotel,int rate_Regular_Weekdays,int rate_Weekends, int reward_Customer_Weekday_rates,int reward_Customer_Weekend_rates)
    {
        this.hotel =hotel;
        this.rate_Regular_Weekdays=rate_Regular_Weekdays;
        this.rate_Weekends=rate_Weekends;
        this.reward_Customer_Weekday_rates=reward_Customer_Weekday_rates;
        this.reward_Customer_Weekend_rates=reward_Customer_Weekend_rates;
    }
}