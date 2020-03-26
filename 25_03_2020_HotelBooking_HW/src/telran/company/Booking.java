package telran.company;

/*
             Person
             Date          -> Boking
             Room
*/
public class Booking {

    private Person person;
    private Room room;
    private Date in;
    private Date out;

    public Booking(Person person, Room room, Date in, Date out) {
        this.person = person;
        this.room = room;
        this.in = in;
        this.out = out;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getIn() {
        return in;
    }

    public void setIn(Date in) {
        this.in = in;
    }

    public Date getOut() {
        return out;
    }

    public void setOut(Date out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "Booking by " + person + room +
                " --- Check in: " + in +
                " --- Check out: " + out + ".";
    }
}