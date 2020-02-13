package Handlers;

import Room.Room;
import Room.RoomType;

import java.util.List;
/**
 * Class handles generation of price for all rooms in the system. I chose to have a static price for the rooms.
 *
 */

public class PriceCalculator {
    private static final int bryllupsPrice = 2500;
    private static final int lavPris = 250;
    private static final int kvalitetPris = 750;
    private static final int buisnessPris = 1500;
    private  static int totalMoney;

    public static void generatePrice(List<Room> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRoomType() == RoomType.BRYLLUPSUITE) {
                list.get(i).setPrice(bryllupsPrice);
            } else if (list.get(i).getRoomType() == RoomType.BUISNESSSUITE) {
                list.get(i).setPrice(buisnessPris);
            } else if (list.get(i).getRoomType() == RoomType.KVALITETSROM) {
                list.get(i).setPrice(kvalitetPris);
            } else {
                list.get(i).setPrice(lavPris);
            }
        }
    }
    public static int calcauteTotalMoney(List<Room> list) {
        for (Room room : list) {
            if (room.getIsBooked()) {
                totalMoney += room.getPrice();
            }
        }
        System.out.println("Total income for all bookings are " + totalMoney);
        return totalMoney;
    }
    /**
     * Getters and Setters.
     */
    public int getBryllupsPrice() {
        return bryllupsPrice;
    }

    public int getLavPris() {
        return lavPris;
    }

    public int getKvalitetPris() {
        return kvalitetPris;
    }

    public int getBuisnessPris() {
        return buisnessPris;
    }
}
