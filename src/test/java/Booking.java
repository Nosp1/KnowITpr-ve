import BookingSystem.BookingSystem;
import Room.BryllupsSuite;
import Room.Room;
import Room.RoomType;
import org.junit.Test;
import org.junit.Assert;

public class Booking {

    @Test
    public void bookRoom() {
        Room room = new BryllupsSuite(5,false, RoomType.BUISNESSSUITE);
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.bookRoom(room);
        Assert.assertTrue(room.getIsBooked());

    }
}
