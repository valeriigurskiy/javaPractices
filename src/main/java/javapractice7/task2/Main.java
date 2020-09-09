package javapractice7.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact(1, "Petro", Company.Apple, "Ivanov", "Ivanov1@gmail.com", 1234, Department.Factory);
        Contact contact2 = new Contact(2, "Ivan", Company.Apple, "Ivanov", "Ivanov2@gmail.com", 1234, Department.Tech);
        Contact contact3 = new Contact(3, "Petro", Company.Apple, "Ivanov", "Ivanov3@gmail.com", 1234, Department.Support);
        Contact contact4 = new Contact(4, "Stepan", Company.Apple, "Ivanov", "Ivanov4@gmail.com", 1234, Department.Factory);
        Contact contact5 = new Contact(5, "Ivan", Company.Apple, "Ivanov", "Ivanov5@gmail.com", 1234, Department.Support);
        Contact contact6 = new Contact(6, "Stepan", Company.Apple, "Ivanov", "Ivanov6@gmail.com", 1234, Department.Support);
        Contact contact7 = new Contact(7, "Ivan", Company.Apple, "Ivanov", "Ivanov7@gmail.com", 1234, Department.Factory);
        Contact contact8 = new Contact(8, "Petro", Company.Apple, "Ivanov", "Ivanov8@gmail.com", 1234, Department.Support);
        Contact contact9 = new Contact(10, "Stepan", Company.Apple, "Ivanov", "Ivanov9@gmail.com", 1234, Department.Factory);
        Contact contact10 = new Contact(10, "Stepan", Company.Apple, "Ivanov", "Ivanov10@gmail.com", 1234, Department.Tech);

        List<Contact> contacts = new LinkedList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);
        contacts.add(contact9);
        contacts.add(contact10);

        List<Contact> collect = contacts.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

        List<Contact> collect1 = contacts.stream().distinct().filter(i -> i.getDepartment().equals(Department.Factory)).collect(Collectors.toList());
//        System.out.println(collect1);

        List<Contact> collect2 = contacts.stream().distinct().filter(i -> i.getDepartment().equals(Department.Factory)).collect(Collectors.toList());
        Collections.sort(collect2, new SortByEmail());

        System.out.println(collect2);


    }
}
