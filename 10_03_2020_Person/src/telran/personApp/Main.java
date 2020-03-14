package telran.personApp;

import telran.data.Address;
import telran.data.Person;

import static telran.data.Person.findByCity;
import static telran.data.Person.findByName;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Vova", new Address());
            p1.setAddress(new Address("Riga", "Prospekt N",100));

            Person p2 = new Person("Tolik",new Address("Berlin", "Friedrisch Str", 5));

        Address address1 = new Address("Palma de Mallorca", "Barselona boulevard", 5);
        Person p3 = new Person("Sergi",address1);

        Person p4 = new Person("Alina", new Address("Paris", "Saint Denis", 7));

        Person p5 = new Person("Lubov", new Address("London", "Backer", 21));

        Person[] persons = new Person[] {p1,p2,p3,p4,p5};


        Person.displayArrayPerson(persons);
        System.out.println(p1.toString());
        p1.getAddress().setCity("Berlin");
        p1.getAddress().setStreet("Potsdamer Str.");
        System.out.println(p1.toString());
        System.out.println(p1.getAddress().getCity());
        System.out.println(p1.getName() + " livs on the " + p1.getAddress().getStreet());

        System.out.println("--------Find By Name---------");
        findByName(persons, "Sergi");

        System.out.println("--------Find By City---------");
        findByCity(persons, "Berlin");

        System.out.println("-------------City Members--------------");
        Person[] cityMembers = Person.listCityMembers(persons, "Berlin" , 5);
        Person.displayPersons(cityMembers);
    }
}
