package telran.data;

public class Person {
    private String name;
    Address address;

    public Person() {
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + name + '\n' + address + '\n';
    }

    public static void displayArrayPerson(Person[] persons){
        for (Person p:persons) {
            System.out.println(p.toString());

        }
    }
    public static void displayPersons(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            if(persons[i] != null)
            System.out.println(persons[i]);
        }
    }

    public static void findByName(Person[] persons, String name){
        int flag = 0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getName().equals(name)){
                System.out.println(name + " livs in " + persons[i].getAddress().getCity());
                flag = 1; }

        }
            if(flag == 0){
                System.out.println("This person isn't found");
        }
    }

    public static void findByCity(Person[] persons, String city) {
        int flag = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAddress().getCity().equals(city)) {
                System.out.println("In " + city + " lives following person: " + persons[i].getName());
                flag = 1;
            }
            if (flag == 0) {
                System.out.println("City isn't found");
            }
        }
    }

    public static Person[] listCityMembers(Person[] persons, String city, int size){
        int i = 0;
        Person[] cityMembers = new Person[size];
        for (Person p : persons) {
            if(p.getAddress().getCity().equalsIgnoreCase(city)){
                cityMembers[i] = p;
                i++;
            }
        }
        return cityMembers;
    }
}
