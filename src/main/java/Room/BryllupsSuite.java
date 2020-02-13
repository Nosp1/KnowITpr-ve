package Room;

public class BryllupsSuite extends Room {
    private int id;
    private int price;
    private int numOfPeople;

    public BryllupsSuite(int numOfPeople, boolean booked, RoomType roomType) {
        super(numOfPeople, booked, roomType);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
}
