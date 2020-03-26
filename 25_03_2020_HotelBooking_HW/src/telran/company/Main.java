package telran.company;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", 22);
        Person p2 = new Person("Jack", 20);
        Person p3 = new Person("Igor", 35);
        Person p4 = new Person("Svetlana", 31);
        Person p5 = new Person("Inna", 21);
        Person p6 = new Person("Anton", 55);
        Person p7 = new Person("Valentina", 54);
        Person p8 = new Person("Aleksandra", 27);


        Room r1 = new Room("1");
        Room r2 = new Room("2");
        Room r3 = new Room("3", 2);
        Room r4 = new Room("4");


        Date in1 = new Date(1, 10, 2020);
        Date out1 = new Date(20, 10, 2020);

        Date in2 = new Date(11, 3, 2020);
        Date out2 = new Date(18, 3, 2020);

        Date in3 = new Date(22, 6, 2020);
        Date out3 = new Date(25, 6, 2020);

        Date in4 = new Date(10, 8, 2020);
        Date out4 = new Date(24, 8, 2020);


        Booking b1 = new Booking(p1, r1, in1, out1);
        Booking b2 = new Booking(p2, r2, in1, out1);
        Booking b3 = new Booking(p3, r3, in4, out4);
        Booking b4 = new Booking(p5, r1, in2, out2);
        Booking b5 = new Booking(p3, r4, in3, out3);
        Booking b6 = new Booking(p3, r2, in2, out2);
        Booking b7 = new Booking(p5, r1, in3, out3);
        Booking b8 = new Booking(p1, r4, in3, out3);

        BookingList myList = new BookingList(20);
        myList.addBooking(b1);
        myList.addBooking(b2);
        myList.addBooking(b3);
        myList.addBooking(b4);
        myList.addBooking(b5);
        myList.addBooking(b6);
        myList.addBooking(b7);
        myList.addBooking(b8);

        //System.out.println("------- before delete Booking ------");
        myList.displayBooking();

       /*  System.out.println("------- after delete Booking ------");
        myList.deleteBooking(p5);
        myList.displayBooking();  */

        //System.out.println("------- Booking by person -------");
        //myList.getBookingsByPerson(p3);

        //System.out.println();
        //myList.displayLastBooking(3);

        System.out.println("----------------");
        myList.displayLastBooking(2);

    }
}
