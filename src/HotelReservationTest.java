import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    @org.junit.jupiter.api.Test
    void add() throws ParseException {
        HotelReservation obj = new HotelReservation();

        obj.add("LakeWood",110);                    //Sending values to add method to store hotel data
        obj.add("Bridgewood",160);
        obj.add("RidgeWood",220);

        assertEquals(110,obj.rate_of_Hotels("2020-09-10","2021-11-21"));            //Sending date to check output amount is minimum



    }

}