import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    @org.junit.jupiter.api.Test
    void add() {
        HotelReservation obj = new HotelReservation();
        assertEquals(1,obj.add("LakeWood",110,90));
    }
}