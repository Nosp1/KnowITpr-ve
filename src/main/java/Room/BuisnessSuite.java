package Room;

public class BuisnessSuite extends Room {
    private int id;
    private int numOfPeople;
    private int price;

    public BuisnessSuite(int numOfPeople, boolean booked, RoomType roomType) {
        super(numOfPeople, booked, roomType);
    }
}
