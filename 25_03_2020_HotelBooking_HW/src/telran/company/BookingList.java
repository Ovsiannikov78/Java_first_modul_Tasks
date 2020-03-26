package telran.company;

public class BookingList {

    private Booking[] bookings;
    protected int size;

    public BookingList(int capacity) {
        bookings = new Booking[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addBooking(Booking booking) {
        if (size < bookings.length) {
            bookings[size] = booking;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBooking(Person person) {
        for (int i = 0; i < size; i++) {
            if (bookings[i].getPerson().equals(person)) {
                bookings[i] = bookings[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayBooking() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
            System.out.println(count + ". " + bookings[i]);


        }
    }

    public Booking[] getBookingsByPerson(Person person) {

        for (int i = 0; i < size; i++) {
            if (bookings[i].getPerson().equals(person)) {
                System.out.println(bookings[i]);
            }
        }
        return null;
    }

    public void displayLastBooking(int n) {
        int count = size - n;
        for (int i = size - n; i < size; i++) {
            count++;
            System.out.println(count + ". " + bookings[i]);

        }
    }
}
