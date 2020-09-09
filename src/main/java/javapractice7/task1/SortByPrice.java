package javapractice7.task1;

import java.util.Comparator;

public class SortByPrice implements Comparator<Computer> {
    @Override
    public int compare(Computer a, Computer b) {
        return a.getPrice() - b.getPrice();
    }
}
