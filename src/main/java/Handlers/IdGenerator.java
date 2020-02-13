package Handlers;

public class IdGenerator {
    private static int lastId;

    public static int generateID() {
        IdGenerator.lastId++;
        return IdGenerator.lastId;
    }
}
