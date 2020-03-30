package telran.company;

public class StandartRoom extends Room {

    private int prise;

    public StandartRoom(String number, int capacity) {
        super(number, capacity);
    }

    public void doService() {
        System.out.println("You can use a drinks from mini bar free of charge. If you would like to oder another drinks" +
                "to your room it will be cost extra prise. The drinks and prices you can see at the service list on you table.");
    }
}
