package BookingSystem;

import Room.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingSystem {
    private List<Room> listOfRooms;
    private Date date;
    private int numOfPeople;
    public BookingSystem() {
        this.listOfRooms = new ArrayList<Room>();

    }
    /**
     * Adds room to the system.
     *
     */
    public void addRoomToSystem(Room room) {
        listOfRooms.add(room);
    }
    /**
     *  Books a room in the system.
     * @param room the room they want to book
     *
     */
    public boolean bookRoom(Room room) {
        if (room.getIsBooked()) {
            System.out.println(" The room " + room.getRoomType() + "is already booked");
        } else {
            room.setBooked(true);
            System.out.println("The room " + room.getRoomType() + " has been successfully booked");
        }
        return room.getIsBooked();
    }

    public List<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
}
