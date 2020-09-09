package javapractice7.task2;

import java.util.Comparator;

public class SortByEmail implements Comparator<Contact> {
    @Override
    public int compare(Contact contact, Contact t1) {
        return contact.getEmail().compareTo(t1.getEmail());
    }
}
