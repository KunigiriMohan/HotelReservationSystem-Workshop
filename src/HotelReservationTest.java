
import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    @org.junit.jupiter.api.Test
    void add()  {
        HotelReservation obj = new HotelReservation();

        assertEquals(1,obj.add("LakeWood",110,90));         //Sending values to get cheap hotel
        assertEquals(2,obj.add("BridgeWood",160,60));
        assertEquals(3,obj.add("RidgeWood",220,150));

        assertEquals("LakeWood",obj.rate_of_Hotels("2020-09-11"));                  //Giving date on which we have to find
        assertEquals("BridgeWood",obj.rate_of_Hotels("2020-09-12"));
    }

}