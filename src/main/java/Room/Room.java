package Room;

import Handlers.IdGenerator;

public abstract class Room {
    private int id;
    private int numOfPeople;
    private int price;
    private boolean booked;
    private RoomType roomType;
    private IdGenerator idGenerator;

    public Room( int numOfPeople, boolean booked, RoomType roomType) {
        this.id = IdGenerator.generateID();
        this.numOfPeople = numOfPeople;
        this.booked = booked;
        this.roomType = roomType;
    }



    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean getIsBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
