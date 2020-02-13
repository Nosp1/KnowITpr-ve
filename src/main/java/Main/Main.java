package Main;

import BookingSystem.BookingSystem;
import Handlers.PriceCalculator;
import Room.BryllupsSuite;
import Room.BuisnessSuite;
import Room.Room;
import Room.RoomType;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Room room = new BryllupsSuite(5,false, RoomType.BRYLLUPSUITE);
        Room room1 = new BuisnessSuite(4,false,RoomType.BUISNESSSUITE);
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addRoomToSystem(room);
        bookingSystem.addRoomToSystem(room1);
        List<Room> roomList = bookingSystem.getListOfRooms();
        PriceCalculator.generatePrice(roomList);
        bookingSystem.bookRoom(roomList.get(0));
        bookingSystem.bookRoom(roomList.get(1));
        bookingSystem.bookRoom(roomList.get(1));
        PriceCalculator.calcauteTotalMoney(roomList);


    }
}
