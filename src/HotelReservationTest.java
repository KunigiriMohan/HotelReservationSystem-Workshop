import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    @org.junit.jupiter.api.Test
    void add() throws ParseException {
        HotelReservation obj = new HotelReservation();

        assertEquals(1,obj.add("LakeWood",110,90, 80, 80));
        assertEquals(2,obj.add("BridgeWood",150,50, 60, 50));
        assertEquals(3,obj.add("RidgeWood",220,150, 150, 40));

    }

}